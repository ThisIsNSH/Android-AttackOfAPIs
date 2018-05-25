package com.nsh.pucho;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.ibm.watson.developer_cloud.assistant.v1.Assistant;
import com.ibm.watson.developer_cloud.assistant.v1.model.InputData;
import com.ibm.watson.developer_cloud.assistant.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.assistant.v1.model.MessageResponse;

import java.util.ArrayList;

public class ChatBot extends AppCompatActivity {

    private static final int REQUEST_RECORD_AUDIO_PERMISSION = 200;
    private static final int RECORD_REQUEST_CODE = 101;
    private static String TAG = "MainActivity";
    /*
        private MicrophoneInputStream capture;
        private SpeakerLabelsDiarization.RecoTokens recoTokens;
        private MicrophoneHelper microphoneHelper;
    */
    com.ibm.watson.developer_cloud.conversation.v1.model.Context context = null;
    private RecyclerView recyclerView;
    private ChatAdapter mAdapter;
    private ArrayList<Message> messageArrayList;
    private EditText inputMessage;
    private ImageButton btnSend;
    private ImageButton btnRecord;
    //private Map<String,Object> context = new HashMap<>();
    private boolean initialRequest;
    private boolean permissionToRecordAccepted = false;
    private boolean listening = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot);
        inputMessage = (EditText) findViewById(R.id.message);
        btnSend = (ImageButton) findViewById(R.id.btn_send);
//        btnRecord= (ImageButton) findViewById(R.id.btn_record);
        /*String customFont = "Montserrat-Regular.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);*/
/*
        inputMessage.setTypeface(typeface);
*/
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        messageArrayList = new ArrayList<>();
        mAdapter = new ChatAdapter(messageArrayList);
  /*      microphoneHelper = new MicrophoneHelper(this);
*/

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        this.inputMessage.setText("");
        this.initialRequest = true;
        sendMessage();


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkInternetConnection()) {
                    sendMessage();
                }
            }
        });
    }

    private boolean checkInternetConnection() {
        // get Connectivity Manager object to check connection
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();

        // Check for network connections
        if (isConnected) {
            return true;
        } else {
            Toast.makeText(this, " No Internet Connection available ", Toast.LENGTH_LONG).show();
            return false;
        }

    }

    private void sendMessage() {

        final String inputmessage = this.inputMessage.getText().toString().trim();
        if (!this.initialRequest) {
            Message inputMessage = new Message();
            inputMessage.setMessage(inputmessage);
            inputMessage.setId("1");
            messageArrayList.add(inputMessage);
        } else {
            Message inputMessage = new Message();
            inputMessage.setMessage(inputmessage);
            inputMessage.setId("100");
            this.initialRequest = false;
            Toast.makeText(getApplicationContext(), "Tap on the message for Voice", Toast.LENGTH_LONG).show();

        }

        this.inputMessage.setText("");
        mAdapter.notifyDataSetChanged();

        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {

                    Assistant assistant = new Assistant("2018-05-25");
                    assistant.setUsernameAndPassword(getString(R.string.username), getString(R.string.password));
                    assistant.setEndPoint("https://gateway.watsonplatform.net/assistant/api");

                    String workspaceId = getString(R.string.work);

                    InputData input = new InputData.Builder("Hello").build();

                    MessageOptions options = new MessageOptions.Builder(workspaceId)
                            .input(input)
                            .build();

                    MessageResponse response = assistant.message(options).execute();
                    /*
                    Conversation service = new Conversation("2018-05-25");
                    service.setUsernameAndPassword("Watson Assistant username", "Watson Assistant password");

                    InputData input = new InputData.Builder(inputmessage).build();
                    MessageOptions options = new MessageOptions.Builder("Workspace ID").input(input).context(context).build();
                    MessageResponse response = service.message(options).execute();
*/
                    //Passing Context of last conversation
                    /*if (response.getContext() != null) {
                        //context.clear();
                        context = (com.ibm.watson.developer_cloud.conversation.v1.model.Context) response.getContext();

                    }*/

                    Message outMessage = new Message();
                    if (response != null) {
                        if (response.getOutput() != null && response.getOutput().containsKey("text")) {
                            ArrayList responseList = (ArrayList) response.getOutput().get("text");
                            if (null != responseList && responseList.size() > 0) {
                                outMessage.setMessage((String) responseList.get(0));
                                outMessage.setId("2");
                            }
                            messageArrayList.add(outMessage);
                        }

                        runOnUiThread(new Runnable() {
                            public void run() {
                                mAdapter.notifyDataSetChanged();
                                if (mAdapter.getItemCount() > 1) {
                                    recyclerView.getLayoutManager().smoothScrollToPosition(recyclerView, null, mAdapter.getItemCount() - 1);

                                }

                            }
                        });


                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

    }
}
