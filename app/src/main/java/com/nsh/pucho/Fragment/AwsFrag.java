package com.nsh.pucho.Fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.Toast;

import com.nsh.pucho.Adapter.CardAdapter;
import com.nsh.pucho.Adapter.LabelAdapter;
import com.nsh.pucho.Database.DatabaseHelper;
import com.nsh.pucho.Extra.Card;
import com.nsh.pucho.Extra.Label;
import com.nsh.pucho.Extra.Sample;
import com.nsh.pucho.Listener.RecyclerTouchListener;
import com.nsh.pucho.R;
import com.xiaofeng.flowlayoutmanager.FlowLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class AwsFrag extends Fragment implements View.OnClickListener{

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static int c1 = 0, c2 = 0, c3 = 0, c0 = 0;
    public SQLiteDatabase mydatabase;
    String rating_value="1";
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;
    private List<Card> cardList1 = new ArrayList<>();
    private List<Card> cardList = new ArrayList<>();
    private RecyclerView aws_media_rec, use_own_rec;
    private CardAdapter mCardAdapter, mCardAdapter1;
    private Sample sample = new Sample();
    private List<Label> labelList = new ArrayList<>();
    private RecyclerView aws_label;
    private LabelAdapter mLabelAdapter;

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
        recView(view);
        return view;
    }

    private void recView(View view) {
        final LinearLayout k = view.findViewById(R.id.loading);

        aws_media_rec = view.findViewById(R.id.aws_media_rec);
        use_own_rec = view.findViewById(R.id.use_own_rec);

        mCardAdapter = new CardAdapter(getContext(), cardList);
        mCardAdapter1 = new CardAdapter(getContext(), cardList1);

        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager mLayoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        aws_media_rec.setLayoutManager(mLayoutManager);
        use_own_rec.setLayoutManager(mLayoutManager1);

        aws_media_rec.setItemAnimator(new DefaultItemAnimator());
        aws_media_rec.setAdapter(mCardAdapter);

        use_own_rec.setItemAnimator(new DefaultItemAnimator());
        use_own_rec.setAdapter(mCardAdapter1);

        prepareCardData();
        prepareCard1Data();


        aws_media_rec.addOnItemTouchListener(new RecyclerTouchListener(getContext(), aws_media_rec, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                final Card card = cardList.get(position);

                k.setVisibility(View.VISIBLE);
                final Dialog dialog = new Dialog(getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.card_aws);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                final Handler handle = new Handler();
                handle.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        k.setVisibility(View.GONE);
                        dialog.show();
                    }
                }, 5000);


                System.out.println(position);
                aws_label = (RecyclerView) dialog.findViewById(R.id.aws_label);
                mLabelAdapter = new LabelAdapter(labelList, getContext());


                FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
                flowLayoutManager.setAutoMeasureEnabled(true);
                aws_label.setLayoutManager(flowLayoutManager);
                aws_label.setItemAnimator(new DefaultItemAnimator());
                aws_label.setAdapter(mLabelAdapter);

                labelList.clear();
                prepareLabelData(position);


                dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    public void onDismiss(DialogInterface dialog) {
                        final Dialog dialog1 = new Dialog(getContext());
                        dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        dialog1.setContentView(R.layout.card_star);
                        dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                        //dialog1.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                        dialog1.show();

                        RatingBar ratingBar = dialog1.findViewById(R.id.ratingBar);
                        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                            @Override
                            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                                if (v > 0)
                                    rating_value = String.valueOf(v);
                                else
                                    rating_value = String.valueOf(0);
                            }
                        });

                        dialog1.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public void onDismiss(DialogInterface dialogInterface) {
                                Toast.makeText(getContext(), "Thanks for the feedback", Toast.LENGTH_SHORT).show();
                                DatabaseHelper n = new DatabaseHelper(getContext());
                                n.insertRecent(card.getName(), rating_value, card.getFunction());

                            }
                        });

                    }
                });


                //Toast.makeText(getContext(), card.getName() + " is selected!", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }

    private void prepareLabelData(int a) {

        System.out.println(sample.aws1r());
        System.out.println(sample.aws2r());
        System.out.println(sample.aws3r());
        System.out.println(sample.aws4r());
        Label label;
        switch (a) {

            case 2:
                //if (c2 ==1)break;
                ArrayList<String> x1 = sample.aws1r();
                for (int i = 0; i < x1.size(); i++) {
                    label = new Label(x1.get(i));
                    labelList.add(label);
                }
                System.out.println(labelList);
                mLabelAdapter.notifyDataSetChanged();
                c2 = 1;
                break;
            case 3:
                //if (c3 ==1)break;
                ArrayList<String> x2 = sample.aws2r();
                for (int i = 0; i < x2.size(); i++) {
                    label = new Label(x2.get(i));
                    labelList.add(label);
                }
                System.out.println(labelList);
                mLabelAdapter.notifyDataSetChanged();
                c3 = 1;
                break;
            case 0:
                //if (c0 ==1)break;
                ArrayList<String> x3 = sample.aws3r();
                for (int i = 0; i < x3.size(); i++) {
                    label = new Label(x3.get(i));
                    labelList.add(label);
                }
                System.out.println(labelList);
                mLabelAdapter.notifyDataSetChanged();
                c0 = 1;
                break;
            case 1:
                //if (c1 ==1)break;
                ArrayList<String> x4 = sample.aws4r();
                for (int i = 0; i < x4.size(); i++) {
                    label = new Label(x4.get(i));
                    labelList.add(label);
                }
                System.out.println(labelList);
                mLabelAdapter.notifyDataSetChanged();
                c1 = 1;
                break;
            default:
                break;

        }
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
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.issue:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, "hadanis.singh@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Issue in Cloud Video Intelligence Response");
                intent.putExtra(Intent.EXTRA_TEXT, "Explain the discrepancy and mention the media.");
                startActivity(Intent.createChooser(intent, "Send Email"));
                break;
        }
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
