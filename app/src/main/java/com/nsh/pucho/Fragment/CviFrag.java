package com.nsh.pucho.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nsh.pucho.Adapter.CardAdapter;
import com.nsh.pucho.Extra.Card;
import com.nsh.pucho.Extra.Sample;
import com.nsh.pucho.R;

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
