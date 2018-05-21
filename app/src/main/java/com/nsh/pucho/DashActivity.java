package com.nsh.pucho;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.volley.Cache;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class DashActivity extends AppCompatActivity {

JSONObject jsonRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        final TextView a = findViewById(R.id.abc);
        String input3="gs://demomaker/gbikes_dinosaur.mp4";
        String input2="gs://demomaker/gbikes_dinosaur.mp4";
        String input1="gs://demomaker/cat.mp4";
        label(input1);
        //shot(input2);
        //explicit(input3);

    }

    public void label(String input) {
        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap
        Network network = new BasicNetwork(new HurlStack());
        RequestQueue queue = new RequestQueue(cache, network);
        queue.start();
        String url = "https://videointelligence.googleapis.com/v1/videos:annotate?key=AIzaSyDZAgxG1MKgyj47N_pWb_jjzsBJsUMjFDI";
        try {
            jsonRequest = new JSONObject("{\n" +
                    "  \"inputUri\": \"" + input + "\",\n" +
                    "  \"features\": [\"LABEL_DETECTION\"]\n" +
                    "}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, jsonRequest, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response);
                try {
                    String name = response.getString("name");
                    name = "us-west1.11303815698753239074";
                    final String url1 = "https://videointelligence.googleapis.com/v1/operations/" + name + "?key=AIzaSyDZAgxG1MKgyj47N_pWb_jjzsBJsUMjFDI";
                    final Handler handler = new Handler();
                    System.out.println(url1);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            label1(url1);
                        }
                    }, 15000);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        queue.add(jsonObjectRequest);
    }

    public void label1(String url1) {

        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap
        Network network = new BasicNetwork(new HurlStack());
        RequestQueue queue = new RequestQueue(cache, network);
        queue.start();

        final JsonObjectRequest jsonObjectRequest1 = new JsonObjectRequest(Request.Method.GET, url1, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(final JSONObject response) {
                try {
                    System.out.println(response);

                    JSONArray a = response
                            .getJSONObject("response")
                            .getJSONArray("annotationResults")
                            .getJSONObject(0)
                            .getJSONArray("segmentLabelAnnotations");

                    ArrayList<String> label = new ArrayList<String>();

                    for (int i = 0; i < a.length(); i++) {
                        label.add(response
                                .getJSONObject("response")
                                .getJSONArray("annotationResults")
                                .getJSONObject(0)
                                .getJSONArray("segmentLabelAnnotations")
                                .getJSONObject(i)
                                .getJSONObject("entity")
                                .getString("description"));
                    }
                    System.out.println(label);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        jsonObjectRequest1.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS * 3, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(jsonObjectRequest1);
    }

    public void shot(String input) {
        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap
        Network network = new BasicNetwork(new HurlStack());
        RequestQueue queue = new RequestQueue(cache, network);
        queue.start();

        String url = "https://videointelligence.googleapis.com/v1/videos:annotate?key=AIzaSyDZAgxG1MKgyj47N_pWb_jjzsBJsUMjFDI";
        try {
            jsonRequest = new JSONObject("{\n" +
                    "  \"inputUri\": \"" + input + "\",\n" +
                    "  \"features\": [\"SHOT_CHANGE_DETECTION\"]\n" +
                    "}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, jsonRequest, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response);
                try {
                    String name = response.getString("name");
                    final String url1 = "https://videointelligence.googleapis.com/v1/operations/" + name + "?key=AIzaSyDZAgxG1MKgyj47N_pWb_jjzsBJsUMjFDI";
                    final Handler handler = new Handler();
                    System.out.println(url1);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            shot1(url1);
                        }
                    }, 15000);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        queue.add(jsonObjectRequest);
    }

    public void shot1(String url1) {

        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap
        Network network = new BasicNetwork(new HurlStack());
        RequestQueue queue = new RequestQueue(cache, network);
        queue.start();

        final JsonObjectRequest jsonObjectRequest1 = new JsonObjectRequest(Request.Method.GET, url1, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(final JSONObject response) {

                    System.out.println(response);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        jsonObjectRequest1.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS * 3, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(jsonObjectRequest1);
    }

    public void explicit(String input) {
        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap
        Network network = new BasicNetwork(new HurlStack());
        RequestQueue queue = new RequestQueue(cache, network);
        queue.start();

        String url = "https://videointelligence.googleapis.com/v1/videos:annotate?key=AIzaSyDZAgxG1MKgyj47N_pWb_jjzsBJsUMjFDI";
        try {
            jsonRequest = new JSONObject("{\n" +
                    "  \"inputUri\": \"" + input + "\",\n" +
                    "  \"features\": [\"EXPLICIT_CONTENT_DETECTION\"]\n" +
                    "}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, jsonRequest, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response);
                try {
                    String name = response.getString("name");
                    final String url1 = "https://videointelligence.googleapis.com/v1/operations/" + name + "?key=AIzaSyDZAgxG1MKgyj47N_pWb_jjzsBJsUMjFDI";
                    final Handler handler = new Handler();
                    System.out.println(url1);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            explicit1(url1);
                        }
                    }, 15000);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        queue.add(jsonObjectRequest);
    }

    public void explicit1(String url1) {

        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap
        Network network = new BasicNetwork(new HurlStack());
        RequestQueue queue = new RequestQueue(cache, network);
        queue.start();

        final JsonObjectRequest jsonObjectRequest1 = new JsonObjectRequest(Request.Method.GET, url1, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(final JSONObject response) {

                System.out.println(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        jsonObjectRequest1.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS * 3, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(jsonObjectRequest1);
    }
}
