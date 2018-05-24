package com.nsh.pucho.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.nsh.pucho.Activity.LoginActivity;
import com.nsh.pucho.Adapter.CardAdapter;
import com.nsh.pucho.Extra.Card;
import com.nsh.pucho.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class HomeFrag extends Fragment implements View.OnClickListener {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private List<Card> cardList = new ArrayList<>();
    private RecyclerView reco_rec, rece_rec;
    private CardAdapter mCardAdapter;
    private TextView acc_name, sign_out;
    private CircleImageView acc_img;
    private OnFragmentInteractionListener mListener;

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
        reco_rec = view.findViewById(R.id.reco_rec);
        acc_img = view.findViewById(R.id.acc_pic);
        acc_name = view.findViewById(R.id.acc_name);
        sign_out = view.findViewById(R.id.sign_out);

        acc_name.setText(new LoginActivity().getName());
        Picasso.with(getContext()).load(new LoginActivity().getURI()).into(acc_img);
        sign_out.setOnClickListener(this);

        mCardAdapter = new CardAdapter(getContext(), cardList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        reco_rec.setLayoutManager(mLayoutManager);

        reco_rec.setItemAnimator(new DefaultItemAnimator());
        reco_rec.setAdapter(mCardAdapter);
        prepareRecoData();

        return view;
    }

    private void prepareRecoData() {
        Card card = new Card("GBikes & Dinosaur", "https://cdn.suwalls.com/wallpapers/fantasy/dinosaur-20061-1920x1080.jpg", "Video Intelligence");
        cardList.add(card);

        card = new Card("Skateboarding", "https://dhei5unw3vrsx.cloudfront.net/images/skateboard_resized.jpg", "AWS Rekognition");
        cardList.add(card);

        card = new Card("Cat Video", "https://i.ytimg.com/vi/YCaGYUIfdy4/maxresdefault.jpg", "Video Intelligence");
        cardList.add(card);

        card = new Card("City Landscape", "https://dhei5unw3vrsx.cloudfront.net/images/city_resized.jpg", "AWS Rekognition");
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
