package com.nsh.pucho.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.nsh.pucho.Activity.LoginActivity;
import com.nsh.pucho.Adapter.CardAdapter;
import com.nsh.pucho.Adapter.RecentAdapter;
import com.nsh.pucho.Database.DatabaseHelper;
import com.nsh.pucho.Database.Recent;
import com.nsh.pucho.Extra.Card;
import com.nsh.pucho.Listener.RecyclerTouchListener;
import com.nsh.pucho.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class HomeFrag extends Fragment implements View.OnClickListener {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public RecentAdapter mAdapter;
    public List<Recent> notesList = new ArrayList<>();
    public DatabaseHelper db;

    private String mParam1;
    private String mParam2;
    private List<Card> cardList = new ArrayList<>();
    private RecyclerView reco_rec, rece_rec;
    private CardAdapter mCardAdapter;
    private TextView rect, acc_name, sign_out;
    private CircleImageView acc_img;
    private OnFragmentInteractionListener mListener;
    private RecyclerView recyclerView;

    public HomeFrag() {
    }

    public static HomeFrag newInstance(String param1, String param2) {
        HomeFrag fragment = new HomeFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recView(view);
        return view;
    }

    private void recView(View view) {
        recyclerView = view.findViewById(R.id.rece_rec);
        reco_rec = view.findViewById(R.id.reco_rec);
        acc_img = view.findViewById(R.id.acc_pic);
        rect = view.findViewById(R.id.rec_tex);
        acc_name = view.findViewById(R.id.acc_name);
        sign_out = view.findViewById(R.id.sign_out);

        db = new DatabaseHelper(getContext());

        notesList.addAll(db.getAllRecents());

        mAdapter = new RecentAdapter(getContext(), notesList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        toggleEmptyNotes();

        acc_name.setText(new LoginActivity().getName());
        Picasso.with(getContext()).load(new LoginActivity().getURI()).into(acc_img);
        sign_out.setOnClickListener(this);

        mCardAdapter = new CardAdapter(getContext(), cardList);
        LinearLayoutManager mLayoutManager3 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        reco_rec.setLayoutManager(mLayoutManager3);

        reco_rec.setItemAnimator(new DefaultItemAnimator());
        reco_rec.setAdapter(mCardAdapter);
        prepareRecoData();
        reco_rec.addOnItemTouchListener(new RecyclerTouchListener(getContext(), reco_rec, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {

                Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.card_aws2);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.show();
                String one = "Google APIs:\nA request is sent with ApiKey query with json Reuqest which fetches a Unique Id. This id therfore acts as query in fetching json response.\n\nAmazon APIs:\nJson request is sent with specific headers including credentials which fetch us the response.\n\nIBM Watson API:\nThe Chatbot is built using it. Assistant has its function which take request and pass on to the url which fetch us the response processed in our online workspace.";
                String two = "Firebase:\nLogin and credentials are handled using firebase. The unified login platform is provided which allows better tracking of the users.\n\nSQL:\nThe database to handle recent activity is done using SQL. The database is created within the mobile to increase productivity.";
                String three = "Circular Image View\nAndroid Design/Support\nAmazon SDK\nPicasso\nWave View for Login\nFlow Layout Manager\nFirebase SDK";
                String four = "To provide unified theme to the app card views are linked with recycler view. \nDue to better design attributes of card view it is preffered. Proper padding and margins has overcomed the corner overlay problem.";

                ArrayList<String> m = new ArrayList<String>();
                m.add(one);
                m.add(two);
                m.add(three);
                m.add(four);
                TextView a = dialog.findViewById(R.id.text123);
                a.setText(m.get(position));

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {

                Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.card_aws);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.show();


            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

    public void createRecent(String name, String url, String function) {
        // inserting note in db and getting
        // newly inserted note id
        long id = db.insertRecent(name, url, function);

        // get the newly inserted note from db
        Recent n = db.getRecent(id);

        if (n != null) {
            // adding new note to array list at 0 position
            notesList.add(0, n);

            // refreshing the list
            mAdapter.notifyDataSetChanged();

            toggleEmptyNotes();
        }
    }

    private void toggleEmptyNotes() {
        // you can check notesList.size() > 0

        if (db.getRecentsCount() <= 0) {
            rect.setText(getString(R.string.no_recent));
            recyclerView.setVisibility(View.GONE);
        } else {
            rect.setText(getString(R.string.recent));
            recyclerView.setVisibility(View.VISIBLE);
        }
    }

    private void prepareRecoData() {
        Card card = new Card("APIs", "https://inform.tmforum.org/wp-content/uploads/2014/08/APIs-shutterstock_210232156-2-702x336.jpg", "Implementation");
        cardList.add(card);


        card = new Card("Firebase & SQL", "https://help.pandasuite.com/resources/AVfYf-idqsg5m25GTXvd/firebase-dot-png", "Backend functionality");
        cardList.add(card);


        card = new Card("Libraries", "https://stfalcon.com/uploads/images/57dba6b33cfe3.png", "Implementation");
        cardList.add(card);

        card = new Card("Recycler + Card Views", "https://androidtutorialmagic.files.wordpress.com/2015/04/card_example.jpg", "Structure of App");
        cardList.add(card);

        mCardAdapter.notifyDataSetChanged();
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sign_out:
                FirebaseAuth.getInstance().signOut();
                notesList.clear();
                mAdapter.notifyDataSetChanged();
                toggleEmptyNotes();
                Toast.makeText(getContext(), "Signout Successfull!", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getActivity(), LoginActivity.class));
                getActivity().finish();

            default:
                break;
        }
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
