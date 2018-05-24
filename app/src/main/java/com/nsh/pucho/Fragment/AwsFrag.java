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
import com.nsh.pucho.R;

import java.util.ArrayList;
import java.util.List;

public class AwsFrag extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;
    private List<Card> cardList1 = new ArrayList<>();
    private List<Card> cardList = new ArrayList<>();
    private RecyclerView aws_media_rec, use_own_rec;
    private CardAdapter mCardAdapter, mCardAdapter1;

    public AwsFrag() {
    }

    public static AwsFrag newInstance(String param1, String param2) {
        AwsFrag fragment = new AwsFrag();
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

        View view = inflater.inflate(R.layout.fragment_aws, container, false);

        aws_media_rec = view.findViewById(R.id.aws_media_rec);
        use_own_rec = view.findViewById(R.id.use_own_rec);

        mCardAdapter = new CardAdapter(getContext(), cardList);
        mCardAdapter1 = new CardAdapter(getContext(), cardList1);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager mLayoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        aws_media_rec.setLayoutManager(mLayoutManager);
        use_own_rec.setLayoutManager(mLayoutManager1);

        aws_media_rec.setItemAnimator(new DefaultItemAnimator());
        aws_media_rec.setAdapter(mCardAdapter);

        use_own_rec.setItemAnimator(new DefaultItemAnimator());
        use_own_rec.setAdapter(mCardAdapter1);

        prepareCardData();
        prepareCard1Data();
        return view;
    }

    private void prepareCardData() {

        Card card = new Card("Shah Rukh Khan", "https://resize.indiatvnews.com/en/centered/newbucket/715_431/2018/01/shah-rukh-fea1-1516593905.jpg", "Celebrity Recognition");
        cardList.add(card);

        card = new Card("Mountain Biking", "https://cdnmos-bikeradar.global.ssl.fastly.net/images/bikes-and-gear/bikes/mountain-bikes/full-suspension/wb_mtb_04-50-1491239031133-16ide61wxdjft-630-354.jpg", "Object Detection");
        cardList.add(card);

        card = new Card("Skateboarding", "https://dhei5unw3vrsx.cloudfront.net/images/skateboard_resized.jpg", "Object & Scene Detection");
        cardList.add(card);

        card = new Card("City Landscape", "https://dhei5unw3vrsx.cloudfront.net/images/city_resized.jpg", "Object & Scene Detection");
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
