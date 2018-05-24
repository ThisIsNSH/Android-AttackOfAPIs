package com.nsh.pucho.Activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.rekognition.AmazonRekognitionClient;
import com.amazonaws.services.rekognition.model.Attribute;
import com.amazonaws.services.rekognition.model.DetectFacesRequest;
import com.amazonaws.services.rekognition.model.DetectFacesResult;
import com.amazonaws.services.rekognition.model.DetectLabelsRequest;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.S3Object;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.nsh.pucho.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class AwsActivity extends AppCompatActivity {
    JSONObject jsonRequest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aws);
        new nsh().execute();
        //new AsyncTaskRunner().execute();

    }

    public void abc() {
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
                headers.put("X-Amz-Target", "RekognitionService.DetectLabels");
                headers.put("X-Amz-Date", "20180522T173400Z");
                headers.put("Content-Type", "application/x-amz-json-1.1");
                headers.put("Host", "rekognition.us-west-2.amazonaws.com");
                headers.put("Authorization", "AWS4-HMAC-SHA256 Credential=AKIAIFFZUABKJ5IZDTKA/20170522/us-west-2/rekognition/aws4_request,\n" +
                        "  SignedHeaders=content-type;host;x-amz-date;x-amz-target, Signature=");
                return headers;
            }
        };
        queue.add(jsonObjectRequest);
    }

    class nsh extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            String photo = "photo.jpg";
            String bucket = "S3bucket";
/*

            AWSCredentials credentials;
            try {
                credentials = new ProfileCredentialsProvider("AdminUser").getCredentials();
            } catch(Exception e) {
                throw new AmazonClientException("Cannot load the credentials from the credential profiles file. "
                        + "Please make sure that your credentials file is at the correct "
                        + "location (/Users/userid/.aws/credentials), and is in a valid format.", e);
            }
*/

            CognitoCachingCredentialsProvider credentialsProvider = new CognitoCachingCredentialsProvider(
                    AwsActivity.this,
                    "XXXXXXXXXXXXXXXX",
                    Regions.US_WEST_2);

            AmazonRekognitionClient amazonRekognitionClient = new AmazonRekognitionClient(credentialsProvider);

            DetectLabelsRequest request = new DetectLabelsRequest()
                    .withImage(new Image()
                            .withS3Object(new S3Object()
                                    .withName(photo).withBucket(bucket)))

                    .withMaxLabels(10)
                    .withMinConfidence(75F);

            DetectFacesRequest detectFaceRequest = new DetectFacesRequest()
                    .withAttributes(Attribute.ALL.toString())
                    .withImage(new Image()
                            .withS3Object(new S3Object()
                                    .withName(photo).withBucket(bucket)));
DetectFacesResult detectFaceResult;

            detectFaceResult = amazonRekognitionClient.detectFaces(detectFaceRequest);

System.out.println(detectFaceResult.getFaceDetails());

           /* DetectLabelsResult result = rekognitionClient.detectLabels(request);
            //List<DescriptorProtos.FieldDescriptorProto.Label> labels = result.getLabels();
            System.out.println(result);
            System.out.println("Detected labels for " + photo);
                *//*for (DescriptorProtos.FieldDescriptorProto.Label label : labels) {
                    System.out.println(label.getName() + ": " + label.getConfidence().toString());
                }*//*
*/

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }
    }

}
