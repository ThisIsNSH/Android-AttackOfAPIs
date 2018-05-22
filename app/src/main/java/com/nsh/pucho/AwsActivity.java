package com.nsh.pucho;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class AwsActivity extends AppCompatActivity {
    JSONObject jsonRequest;
    Map<String, String> params;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aws);

        CognitoCachingCredentialsProvider credentialsProvider = new CognitoCachingCredentialsProvider(
                getApplicationContext(),
                "ap-southeast-2:9f8e259a-458e-4d10-a2af-e678d7f4340e", // Identity pool ID
                Regions.AP_SOUTHEAST_2 // Region
        );


        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "https://rekognition.us-west-2.amazonaws.com/HTTP/1.1";


        try {
            jsonRequest = new JSONObject("{\n" +
                    "   \"Image\":{\n" +
                    "      \"S3Object\":{\n" +
                    "         \"Bucket\":\"example-photos\",\n" +
                    "         \"Name\":\"skateboard.jpg\"\n" +
                    "      }\n" +
                    "   }\n" +
                    "}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, jsonRequest, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {

            /**
             * Passing some request headers
             */
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                //headers.put("Content-Type", "application/json");
                String x = new SignedRequestsHelper().sign(params);
                System.out.println(x);
                headers.put("X-Amz-Target", "RekognitionService.DetectLabels");
                headers.put("X-Amz-Date", "20180522T173400Z");
                headers.put("Content-Type", "application/x-amz-json-1.1");
                headers.put("Host", "rekognition.us-west-2.amazonaws.com");
                headers.put("Authorization", "AWS4-HMAC-SHA256 Credential=AKIAIFFZUABKJ5IZDTKA/20170522/us-west-2/rekognition/aws4_request,\n" +
                        "  SignedHeaders=content-type;host;x-amz-date;x-amz-target, Signature="+x);
                return headers;
            }
        };
        queue.add(jsonObjectRequest);
    }
}
