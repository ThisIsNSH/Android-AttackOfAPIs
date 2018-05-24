package com.nsh.pucho.Fragment;

import android.app.Dialog;
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
import android.widget.Toast;

import com.nsh.pucho.Adapter.CardAdapter;
import com.nsh.pucho.Adapter.LabelAdapter;
import com.nsh.pucho.Extra.Card;
import com.nsh.pucho.Extra.Label;
import com.nsh.pucho.Extra.RecyclerTouchListener;
import com.nsh.pucho.Extra.Sample;
import com.nsh.pucho.R;
import com.xiaofeng.flowlayoutmanager.FlowLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class CviFrag extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private List<Card> cardList1 = new ArrayList<>();
    private List<Card> cardList = new ArrayList<>();
    private RecyclerView cvi_media_rec, use_own_rec1;
    private CardAdapter mCardAdapter, mCardAdapter1;
    private Sample sample = new Sample();

    private List<Label> labelList = new ArrayList<>();
    private List<Label> labelList1 = new ArrayList<>();
    private List<Label> labelList2 = new ArrayList<>();
    private RecyclerView cvi_label, cvi_shot, cvi_explicit;
    private LabelAdapter mLabelAdapter, mLabelAdapter1, mLabelAdapter2;

    public CviFrag() {
    }

    public static CviFrag newInstance(String param1, String param2) {
        CviFrag fragment = new CviFrag();
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
        View view = inflater.inflate(R.layout.fragment_cvi, container, false);
        recView(view);
        System.out.println(sample.cvi11r());
        System.out.println(sample.cvi12r());
        System.out.println(sample.cvi13r());
        System.out.println(sample.cvi21r());
        System.out.println(sample.cvi22r());
        System.out.println(sample.cvi23r());
        return view;
    }

    private void recView(View view) {

        cvi_media_rec = view.findViewById(R.id.cvi_media_rec);
        use_own_rec1 = view.findViewById(R.id.use_own_rec1);

        mCardAdapter = new CardAdapter(getContext(), cardList);
        mCardAdapter1 = new CardAdapter(getContext(), cardList1);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager mLayoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        cvi_media_rec.setLayoutManager(mLayoutManager);
        use_own_rec1.setLayoutManager(mLayoutManager1);

        cvi_media_rec.setItemAnimator(new DefaultItemAnimator());
        cvi_media_rec.setAdapter(mCardAdapter);

        use_own_rec1.setItemAnimator(new DefaultItemAnimator());
        use_own_rec1.setAdapter(mCardAdapter1);

        prepareCardData();
        prepareCard1Data();

        cvi_media_rec.addOnItemTouchListener(new RecyclerTouchListener(getContext(), cvi_media_rec, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Card card = cardList.get(position);
                final Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.card_cvi);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.show();

                cvi_label = dialog.findViewById(R.id.cvi_label);
                cvi_shot = dialog.findViewById(R.id.cvi_shot);
                cvi_explicit = dialog.findViewById(R.id.cvi_explicit);

                mLabelAdapter = new LabelAdapter(labelList, getContext());
                mLabelAdapter1 = new LabelAdapter(labelList1, getContext());
                mLabelAdapter2 = new LabelAdapter(labelList2, getContext());

                FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
                flowLayoutManager.setAutoMeasureEnabled(true);
                cvi_label.setLayoutManager(flowLayoutManager);
                cvi_label.setItemAnimator(new DefaultItemAnimator());
                cvi_label.setAdapter(mLabelAdapter);


                FlowLayoutManager flowLayoutManager1 = new FlowLayoutManager();
                flowLayoutManager1.setAutoMeasureEnabled(true);
                cvi_shot.setLayoutManager(flowLayoutManager1);
                cvi_shot.setItemAnimator(new DefaultItemAnimator());
                cvi_shot.setAdapter(mLabelAdapter1);


                FlowLayoutManager flowLayoutManager2 = new FlowLayoutManager();
                flowLayoutManager2.setAutoMeasureEnabled(true);
                cvi_explicit.setLayoutManager(flowLayoutManager2);
                cvi_explicit.setItemAnimator(new DefaultItemAnimator());
                cvi_explicit.setAdapter(mLabelAdapter2);

                labelList.clear();
                labelList1.clear();
                labelList2.clear();
                prepareLabelData(position);


                Toast.makeText(getContext(), card.getName() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

    private void prepareLabelData(int a) {

        Label label, label1, label2;
        switch (a) {

            case 0:

                ArrayList<String> x3 = sample.cvi11r();
                for (int i = 0; i < x3.size(); i++) {
                    label = new Label(x3.get(i));
                    labelList.add(label);
                }
                mLabelAdapter.notifyDataSetChanged();

                ArrayList<String> x6 = sample.cvi13r();
                for (int i = 0; i < x6.size(); i++) {
                    label1 = new Label(x6.get(i));
                    labelList1.add(label1);
                }
                mLabelAdapter1.notifyDataSetChanged();
                ArrayList<String> x5 = sample.cvi12r();
                for (int i = 0; i < x5.size(); i++) {
                    label2 = new Label(x5.get(i));
                    labelList2.add(label2);
                }
                mLabelAdapter2.notifyDataSetChanged();
                System.out.println(labelList);
                System.out.println(labelList1);
                System.out.println(labelList2);


                break;
            case 1:
                ArrayList<String> x31 = sample.cvi21r();
                for (int i = 0; i < x31.size(); i++) {
                    label = new Label(x31.get(i));
                    labelList.add(label);
                }

                ArrayList<String> x61 = sample.cvi23r();
                for (int i = 0; i < x61.size(); i++) {
                    label1 = new Label(x61.get(i));
                    labelList1.add(label1);
                }

                ArrayList<String> x51 = sample.cvi22r();
                for (int i = 0; i < x51.size(); i++) {
                    label2 = new Label(x51.get(i));
                    labelList2.add(label2);
                }


                mLabelAdapter.notifyDataSetChanged();
                mLabelAdapter1.notifyDataSetChanged();
                mLabelAdapter2.notifyDataSetChanged();
                break;
            default:
                break;

        }
    }

    private void prepareCardData() {
        Card card = new Card("GBikes & Dinosaur", "https://cdn.suwalls.com/wallpapers/fantasy/dinosaur-20061-1920x1080.jpg", "Video Intelligence");
        cardList.add(card);


        card = new Card("Cat Video", "https://i.ytimg.com/vi/YCaGYUIfdy4/maxresdefault.jpg", "Video Intelligence");
        cardList.add(card);


        mCardAdapter.notifyDataSetChanged();
    }

    private void prepareCard1Data() {
        Card card = new Card("Not supported", "https://cdn.shopify.com/s/files/1/1367/8297/products/CLOTHES_1024x1024.jpg", "Feature not available");
        cardList1.add(card);
        mCardAdapter1.notifyDataSetChanged();
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
