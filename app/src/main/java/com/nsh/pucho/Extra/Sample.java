package com.nsh.pucho.Extra;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by ThisIsNSH on 5/24/2018.
 */

public class Sample {
    JSONObject var;

    //skateboard
    public JSONObject aws1() {
        try {
            var = new JSONObject("{\n" +
                    "    \"Labels\": [\n" +
                    "        {\n" +
                    "            \"Name\": \"Skateboard\",\n" +
                    "            \"Confidence\": 99.25341796875\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sport\",\n" +
                    "            \"Confidence\": 99.25341796875\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sports\",\n" +
                    "            \"Confidence\": 99.25341796875\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Human\",\n" +
                    "            \"Confidence\": 99.24723052978516\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"People\",\n" +
                    "            \"Confidence\": 99.24723052978516\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Person\",\n" +
                    "            \"Confidence\": 99.24723052978516\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Parking\",\n" +
                    "            \"Confidence\": 97.42487335205078\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Parking Lot\",\n" +
                    "            \"Confidence\": 97.42487335205078\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Automobile\",\n" +
                    "            \"Confidence\": 91.53312683105469\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Car\",\n" +
                    "            \"Confidence\": 91.53312683105469\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Transportation\",\n" +
                    "            \"Confidence\": 91.53312683105469\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Vehicle\",\n" +
                    "            \"Confidence\": 91.53312683105469\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Intersection\",\n" +
                    "            \"Confidence\": 76.8509521484375\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Road\",\n" +
                    "            \"Confidence\": 76.8509521484375\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Path\",\n" +
                    "            \"Confidence\": 76.2149429321289\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Pavement\",\n" +
                    "            \"Confidence\": 76.2149429321289\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sidewalk\",\n" +
                    "            \"Confidence\": 76.2149429321289\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Walkway\",\n" +
                    "            \"Confidence\": 76.2149429321289\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Building\",\n" +
                    "            \"Confidence\": 66.71541595458984\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Coupe\",\n" +
                    "            \"Confidence\": 62.047218322753906\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sports Car\",\n" +
                    "            \"Confidence\": 62.047218322753906\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Urban\",\n" +
                    "            \"Confidence\": 61.98908233642578\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Neighborhood\",\n" +
                    "            \"Confidence\": 60.97801971435547\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sedan\",\n" +
                    "            \"Confidence\": 59.22069549560547\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"City\",\n" +
                    "            \"Confidence\": 57.33274841308594\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Town\",\n" +
                    "            \"Confidence\": 57.33274841308594\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Street\",\n" +
                    "            \"Confidence\": 56.48063278198242\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Housing\",\n" +
                    "            \"Confidence\": 54.23549270629883\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Downtown\",\n" +
                    "            \"Confidence\": 53.852264404296875\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Office Building\",\n" +
                    "            \"Confidence\": 52.00179672241211\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Suv\",\n" +
                    "            \"Confidence\": 51.3253288269043\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Apartment Building\",\n" +
                    "            \"Confidence\": 51.260765075683594\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"High Rise\",\n" +
                    "            \"Confidence\": 51.260765075683594\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Pedestrian\",\n" +
                    "            \"Confidence\": 50.68067932128906\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Freeway\",\n" +
                    "            \"Confidence\": 50.59547424316406\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Bumper\",\n" +
                    "            \"Confidence\": 50.56858825683594\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return var;
    }

    public ArrayList<String> aws1r() {
        JSONObject a = aws1();
        ArrayList<String> b = new ArrayList<String>();
        try {
            JSONArray c = a.getJSONArray("Labels");
            for (int i = 0; i < c.length(); i++) {
                b.add(c.getJSONObject(i).getString("Name"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return b;
    }

    //city
    public JSONObject aws2() {
        try {
            var = new JSONObject("{\n" +
                    "    \"Labels\": [\n" +
                    "        {\n" +
                    "            \"Name\": \"Building\",\n" +
                    "            \"Confidence\": 91.4747314453125\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"City\",\n" +
                    "            \"Confidence\": 91.4747314453125\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Downtown\",\n" +
                    "            \"Confidence\": 91.4747314453125\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Town\",\n" +
                    "            \"Confidence\": 91.4747314453125\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Urban\",\n" +
                    "            \"Confidence\": 91.4747314453125\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Landscape\",\n" +
                    "            \"Confidence\": 74.08634185791016\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Nature\",\n" +
                    "            \"Confidence\": 74.08634185791016\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Outdoors\",\n" +
                    "            \"Confidence\": 74.08634185791016\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Scenery\",\n" +
                    "            \"Confidence\": 74.08634185791016\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"High Rise\",\n" +
                    "            \"Confidence\": 56.20011520385742\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Dock\",\n" +
                    "            \"Confidence\": 55.654693603515625\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Pier\",\n" +
                    "            \"Confidence\": 55.654693603515625\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Dawn\",\n" +
                    "            \"Confidence\": 52.41661071777344\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Dusk\",\n" +
                    "            \"Confidence\": 52.41661071777344\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Red Sky\",\n" +
                    "            \"Confidence\": 52.41661071777344\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sky\",\n" +
                    "            \"Confidence\": 52.41661071777344\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sunrise\",\n" +
                    "            \"Confidence\": 52.41661071777344\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sunset\",\n" +
                    "            \"Confidence\": 52.41661071777344\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Housing\",\n" +
                    "            \"Confidence\": 51.498085021972656\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Coast\",\n" +
                    "            \"Confidence\": 51.15507888793945\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Ocean\",\n" +
                    "            \"Confidence\": 51.15507888793945\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sea\",\n" +
                    "            \"Confidence\": 51.15507888793945\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Water\",\n" +
                    "            \"Confidence\": 51.15507888793945\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Harbor\",\n" +
                    "            \"Confidence\": 50.9989128112793\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Port\",\n" +
                    "            \"Confidence\": 50.9989128112793\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Waterfront\",\n" +
                    "            \"Confidence\": 50.9989128112793\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Marina\",\n" +
                    "            \"Confidence\": 50.821693420410156\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Metropolis\",\n" +
                    "            \"Confidence\": 50.53001022338867\n" +
                    "        }\n" +
                    "    ],\n" +
                    "    \"OrientationCorrection\": \"ROTATE_0\"\n" +
                    "}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return var;
    }

    public ArrayList<String> aws2r() {
        JSONObject a = aws2();
        ArrayList<String> b = new ArrayList<String>();
        try {
            JSONArray c = a.getJSONArray("Labels");
            for (int i = 0; i < c.length(); i++) {
                b.add(c.getJSONObject(i).getString("Name"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return b;
    }

    //shah
    public JSONObject aws3() {
        try {
            var = new JSONObject("{\n" +
                    "    \"CelebrityFaces\": [\n" +
                    "        {\n" +
                    "            \"Urls\": [\n" +
                    "                \"www.imdb.com/name/nm0451321\"\n" +
                    "            ],\n" +
                    "            \"Name\": \"Shah Rukh Khan\",\n" +
                    "            \"Id\": \"ok8hG6S\",\n" +
                    "            \"Face\": {\n" +
                    "                \"BoundingBox\": {\n" +
                    "                    \"Width\": 0.2993007004261017,\n" +
                    "                    \"Height\": 0.49651971459388733,\n" +
                    "                    \"Left\": 0.35664334893226624,\n" +
                    "                    \"Top\": 0.24825985729694366\n" +
                    "                },\n" +
                    "                \"Confidence\": 99.99884033203125,\n" +
                    "                \"Landmarks\": [\n" +
                    "                    {\n" +
                    "                        \"Type\": \"eyeLeft\",\n" +
                    "                        \"X\": 0.46781864762306213,\n" +
                    "                        \"Y\": 0.45522329211235046\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"Type\": \"eyeRight\",\n" +
                    "                        \"X\": 0.5554090142250061,\n" +
                    "                        \"Y\": 0.41664308309555054\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"Type\": \"nose\",\n" +
                    "                        \"X\": 0.5605055689811707,\n" +
                    "                        \"Y\": 0.53983074426651\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"Type\": \"mouthLeft\",\n" +
                    "                        \"X\": 0.48909059166908264,\n" +
                    "                        \"Y\": 0.6199827194213867\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"Type\": \"mouthRight\",\n" +
                    "                        \"X\": 0.5587709546089172,\n" +
                    "                        \"Y\": 0.5962613821029663\n" +
                    "                    }\n" +
                    "                ],\n" +
                    "                \"Pose\": {\n" +
                    "                    \"Roll\": -18.02217674255371,\n" +
                    "                    \"Yaw\": 39.665042877197266,\n" +
                    "                    \"Pitch\": -14.077613830566406\n" +
                    "                },\n" +
                    "                \"Quality\": {\n" +
                    "                    \"Brightness\": 51.09420394897461,\n" +
                    "                    \"Sharpness\": 99.98487854003906\n" +
                    "                }\n" +
                    "            },\n" +
                    "            \"MatchConfidence\": 76\n" +
                    "        }\n" +
                    "    ],\n" +
                    "    \"UnrecognizedFaces\": [],\n" +
                    "    \"OrientationCorrection\": \"ROTATE_0\"\n" +
                    "}");
        } catch (JSONException e) {
            e.printStackTrace();

        }
        return var;
    }

    public ArrayList<String> aws3r() {
        JSONObject a = aws3();
        ArrayList<String> b = new ArrayList<String>();
        try {
            JSONArray c = a.getJSONArray("CelebrityFaces");
            b.add(c.getJSONObject(0).getString("Name"));
            b.add(c.getJSONObject(0).getJSONArray("Urls").getString(0));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return b;
    }

    //bike
    public JSONObject aws4() {
        try {
            var = new JSONObject("{\n" +
                    "    \"Labels\": [\n" +
                    "        {\n" +
                    "            \"Name\": \"Human\",\n" +
                    "            \"Confidence\": 99.29954528808594\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"People\",\n" +
                    "            \"Confidence\": 99.29954528808594\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Person\",\n" +
                    "            \"Confidence\": 99.29954528808594\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Bicycle\",\n" +
                    "            \"Confidence\": 96.5782470703125\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Bike\",\n" +
                    "            \"Confidence\": 96.5782470703125\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Transportation\",\n" +
                    "            \"Confidence\": 96.5782470703125\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Vehicle\",\n" +
                    "            \"Confidence\": 96.5782470703125\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Flora\",\n" +
                    "            \"Confidence\": 88.06275939941406\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Forest\",\n" +
                    "            \"Confidence\": 88.06275939941406\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Land\",\n" +
                    "            \"Confidence\": 88.06275939941406\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Nature\",\n" +
                    "            \"Confidence\": 88.06275939941406\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Outdoors\",\n" +
                    "            \"Confidence\": 88.06275939941406\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Plant\",\n" +
                    "            \"Confidence\": 88.06275939941406\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Tree\",\n" +
                    "            \"Confidence\": 88.06275939941406\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Vegetation\",\n" +
                    "            \"Confidence\": 88.06275939941406\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Cyclist\",\n" +
                    "            \"Confidence\": 82.61070251464844\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sport\",\n" +
                    "            \"Confidence\": 82.61070251464844\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Sports\",\n" +
                    "            \"Confidence\": 82.61070251464844\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Path\",\n" +
                    "            \"Confidence\": 77.80635070800781\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Trail\",\n" +
                    "            \"Confidence\": 77.80635070800781\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Wilderness\",\n" +
                    "            \"Confidence\": 73.05116271972656\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Mountain Bike\",\n" +
                    "            \"Confidence\": 55.95555877685547\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Rainforest\",\n" +
                    "            \"Confidence\": 51.08957290649414\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Rock\",\n" +
                    "            \"Confidence\": 51.09151077270508\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Jungle\",\n" +
                    "            \"Confidence\": 51.053802490234375\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Moss\",\n" +
                    "            \"Confidence\": 50.757164001464844\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"Name\": \"Grove\",\n" +
                    "            \"Confidence\": 50.67768859863281\n" +
                    "        }\n" +
                    "    ],\n" +
                    "    \"OrientationCorrection\": \"ROTATE_0\"\n" +
                    "}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return var;
    }

    public ArrayList<String> aws4r() {
        JSONObject a = aws4();
        ArrayList<String> b = new ArrayList<String>();
        try {
            JSONArray c = a.getJSONArray("Labels");
            for (int i = 0; i < c.length(); i++) {
                b.add(c.getJSONObject(i).getString("Name"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return b;
    }

    //dino
    public JSONObject cvi11() {
        try {
            var = new JSONObject("{\n" +
                    "        \"inputUri\": \"/demomaker/gbikes_dinosaur.mp4\",\n" +
                    "        \"segmentLabelAnnotations\": [\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0199g\",\n" +
                    "              \"description\": \"bicycle\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/07yv9\",\n" +
                    "                \"description\": \"vehicle\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"42.766666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.47582102\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/029tx\",\n" +
                    "              \"description\": \"dinosaur\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"42.766666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.94490045\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/07j7r\",\n" +
                    "              \"description\": \"tree\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/05s2s\",\n" +
                    "                \"description\": \"plant\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"42.766666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.42314154\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/07hjh\",\n" +
                    "              \"description\": \"tyrannosaurus\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/029tx\",\n" +
                    "                \"description\": \"dinosaur\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"42.766666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.42222223\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          }\n" +
                    "        ],\n" +
                    "        \"shotLabelAnnotations\": [\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/06ntj\",\n" +
                    "              \"description\": \"sports\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"5.166666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.54302704\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/07j7r\",\n" +
                    "              \"description\": \"tree\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/05s2s\",\n" +
                    "                \"description\": \"plant\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"10.100s\",\n" +
                    "                  \"endTimeOffset\": \"28.133333s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.41736194\n" +
                    "              },\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"28.166666s\",\n" +
                    "                  \"endTimeOffset\": \"42.766666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.55788624\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/01bqk0\",\n" +
                    "              \"description\": \"bicycle wheel\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"5.166666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.7962091\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0199g\",\n" +
                    "              \"description\": \"bicycle\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/07yv9\",\n" +
                    "                \"description\": \"vehicle\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"5.166666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.9959037\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/07yv9\",\n" +
                    "              \"description\": \"vehicle\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"5.233333s\",\n" +
                    "                  \"endTimeOffset\": \"10.066666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.45896822\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/09rgp\",\n" +
                    "              \"description\": \"road bicycle\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/0199g\",\n" +
                    "                \"description\": \"bicycle\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"5.166666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.86710626\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/05y5lj\",\n" +
                    "              \"description\": \"sports equipment\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"5.166666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.6187258\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/029tx\",\n" +
                    "              \"description\": \"dinosaur\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"10.100s\",\n" +
                    "                  \"endTimeOffset\": \"28.133333s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.8315473\n" +
                    "              },\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"28.166666s\",\n" +
                    "                  \"endTimeOffset\": \"42.766666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.93914324\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/05wrt\",\n" +
                    "              \"description\": \"property\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"5.233333s\",\n" +
                    "                  \"endTimeOffset\": \"10.066666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.41941902\n" +
                    "              },\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"10.100s\",\n" +
                    "                  \"endTimeOffset\": \"28.133333s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.43385637\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0jbk\",\n" +
                    "              \"description\": \"animal\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"28.166666s\",\n" +
                    "                  \"endTimeOffset\": \"42.766666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.4112725\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/01bqgn\",\n" +
                    "              \"description\": \"bicycle frame\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"5.166666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.73205084\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/07hjh\",\n" +
                    "              \"description\": \"tyrannosaurus\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/029tx\",\n" +
                    "                \"description\": \"dinosaur\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"28.166666s\",\n" +
                    "                  \"endTimeOffset\": \"42.766666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.42222223\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/08t0vy\",\n" +
                    "              \"description\": \"individual sports\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/06ntj\",\n" +
                    "                \"description\": \"sports\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"5.166666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.83015776\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/01sgl\",\n" +
                    "              \"description\": \"cycling\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/06ntj\",\n" +
                    "                \"description\": \"sports\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"5.166666s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.8543576\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          }\n" +
                    "        ]\n" +
                    "      }");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return var;
    }

    public ArrayList<String> cvi11r() {
        JSONObject a = cvi11();
        ArrayList<String> b = new ArrayList<String>();
        try {
            JSONArray a1 = a.getJSONArray("segmentLabelAnnotations");

            for (int i = 0; i < a1.length(); i++) {
                b.add(a.getJSONArray("segmentLabelAnnotations")
                        .getJSONObject(i)
                        .getJSONObject("entity")
                        .getString("description"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return b;
    }

    public JSONObject cvi13() {
        try {
            var = new JSONObject("{\n" +
                    "    \"inputUri\": \"/demomaker/gbikes_dinosaur.mp4\",\n" +
                    "    \"shotAnnotations\": [\n" +
                    "      {\n" +
                    "        \"startTimeOffset\": \"0s\",\n" +
                    "        \"endTimeOffset\": \"5.167104s\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"startTimeOffset\": \"5.236736s\",\n" +
                    "        \"endTimeOffset\": \"10.072064s\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"startTimeOffset\": \"10.106880s\",\n" +
                    "        \"endTimeOffset\": \"28.139520s\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"startTimeOffset\": \"28.174336s\",\n" +
                    "        \"endTimeOffset\": \"42.768384s\"\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  }");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return var;
    }

    public ArrayList<String> cvi13r() {
        JSONObject a = cvi13();
        ArrayList<String> b = new ArrayList<String>();
        try {
            JSONArray a1 = a.getJSONArray("shotAnnotations");
            String start, end;
            for (int i = 0; i < a1.length(); i++) {
                start = (a.getJSONArray("shotAnnotations")
                        .getJSONObject(i)
                        .getString("startTimeOffset"));
                end = (a.getJSONArray("shotAnnotations")
                        .getJSONObject(i)
                        .getString("endTimeOffset"));

                b.add("Start: " + start + "\nEnd: " + end);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return b;
    }

    public JSONObject cvi12() {
        try {
            var = new JSONObject("{\n" +
                    "        \"inputUri\": \"/demomaker/gbikes_dinosaur.mp4\",\n" +
                    "        \"explicitAnnotation\": {\n" +
                    "          \"frames\": [\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"0.056149s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"1.166841s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +

                    "            {\n" +
                    "              \"timeOffset\": \"41.678209s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"42.596413s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            }\n" +
                    "          ]\n" +
                    "        }\n" +
                    "      }");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return var;
    }

    public ArrayList<String> cvi12r() {
        JSONObject a = cvi12();
        ArrayList<String> b = new ArrayList<String>();
        try {
            JSONArray a1 = a.getJSONObject("explicitAnnotation").getJSONArray("frames");
            String start, end;
            for (int i = 0; i < a1.length(); i++) {
                start = (a1.getJSONObject(i)
                        .getString("timeOffset"));
                end = (a1.getJSONObject(i)
                        .getString("pornographyLikelihood"));

                b.add("Time: " + start + "\nContent: " + end.toLowerCase());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return b;
    }

    //cat
    public JSONObject cvi22() {
        try {
            var = new JSONObject("{\n" +
                    "        \"inputUri\": \"/demomaker/cat.mp4\",\n" +
                    "        \"explicitAnnotation\": {\n" +
                    "          \"frames\": [\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"0.670147s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"1.505817s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"2.673934s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"3.580204s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"4.613285s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"5.729093s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"6.923117s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"7.993587s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"8.932066s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"10.044461s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"11.170883s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"12.250815s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"13.429649s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "              \"timeOffset\": \"14.417924s\",\n" +
                    "              \"pornographyLikelihood\": \"VERY_UNLIKELY\"\n" +
                    "            }\n" +
                    "          ]\n" +
                    "        }\n" +
                    "      }");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return var;
    }

    public ArrayList<String> cvi22r() {
        JSONObject a = cvi22();
        ArrayList<String> b = new ArrayList<String>();
        try {
            JSONArray a1 = a.getJSONObject("explicitAnnotation").getJSONArray("frames");
            String start, end;
            for (int i = 0; i < a1.length(); i++) {
                start = (a1.getJSONObject(i)
                        .getString("timeOffset"));
                end = (a1.getJSONObject(i)
                        .getString("pornographyLikelihood"));

                b.add("Time: " + start + "\nContent: " + end.toLowerCase());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return b;
    }

    public JSONObject cvi23() {
        try {
            var = new JSONObject("{\n" +
                    "        \"inputUri\": \"/demomaker/cat.mp4\",\n" +
                    "        \"shotAnnotations\": [\n" +
                    "          {\n" +
                    "            \"startTimeOffset\": \"0s\",\n" +
                    "            \"endTimeOffset\": \"14.840s\"\n" +
                    "          }\n" +
                    "        ]\n" +
                    "      }");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return var;
    }

    public ArrayList<String> cvi23r() {
        JSONObject a = cvi23();
        ArrayList<String> b = new ArrayList<String>();
        try {
            JSONArray a1 = a.getJSONArray("shotAnnotations");
            String start, end;
            for (int i = 0; i < a1.length(); i++) {
                start = (a.getJSONArray("shotAnnotations")
                        .getJSONObject(i)
                        .getString("startTimeOffset"));
                end = (a.getJSONArray("shotAnnotations")
                        .getJSONObject(i)
                        .getString("endTimeOffset"));

                b.add("Start: " + start + "\nEnd: " + end);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return b;
    }

    public JSONObject cvi21() {
        try {
            var = new JSONObject("{\n" +
                    "        \"inputUri\": \"/demomaker/cat.mp4\",\n" +
                    "        \"segmentLabelAnnotations\": [\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0307l\",\n" +
                    "              \"description\": \"cat like mammal\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/04rky\",\n" +
                    "                \"description\": \"mammal\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.4902568\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0jbk\",\n" +
                    "              \"description\": \"animal\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.9809588\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/07k6w8\",\n" +
                    "              \"description\": \"small to medium sized cats\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/04rky\",\n" +
                    "                \"description\": \"mammal\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.8077077\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0hjzp\",\n" +
                    "              \"description\": \"kitten\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/01yrx\",\n" +
                    "                \"description\": \"cat\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.68532044\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0g4cd0\",\n" +
                    "              \"description\": \"tabby cat\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/01yrx\",\n" +
                    "                \"description\": \"cat\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.47549522\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/05h0n\",\n" +
                    "              \"description\": \"nature\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.8411303\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0k8hs\",\n" +
                    "              \"description\": \"domestic long haired cat\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/01yrx\",\n" +
                    "                \"description\": \"cat\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.5661983\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/068hy\",\n" +
                    "              \"description\": \"pet\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/0jbk\",\n" +
                    "                \"description\": \"animal\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.9382622\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0j60j\",\n" +
                    "              \"description\": \"maine coon\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/01yrx\",\n" +
                    "                \"description\": \"cat\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.4681999\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/01l7qd\",\n" +
                    "              \"description\": \"whiskers\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.43819335\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/01yrx\",\n" +
                    "              \"description\": \"cat\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/068hy\",\n" +
                    "                \"description\": \"pet\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.98509187\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          }\n" +
                    "        ],\n" +
                    "        \"shotLabelAnnotations\": [\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0hjzp\",\n" +
                    "              \"description\": \"kitten\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/01yrx\",\n" +
                    "                \"description\": \"cat\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.68532044\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0jbk\",\n" +
                    "              \"description\": \"animal\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.9809588\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/07k6w8\",\n" +
                    "              \"description\": \"small to medium sized cats\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/04rky\",\n" +
                    "                \"description\": \"mammal\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.8077077\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0g4cd0\",\n" +
                    "              \"description\": \"tabby cat\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/01yrx\",\n" +
                    "                \"description\": \"cat\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.47549522\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0j60j\",\n" +
                    "              \"description\": \"maine coon\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/01yrx\",\n" +
                    "                \"description\": \"cat\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.4681999\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/05h0n\",\n" +
                    "              \"description\": \"nature\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.8411303\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0k8hs\",\n" +
                    "              \"description\": \"domestic long haired cat\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/01yrx\",\n" +
                    "                \"description\": \"cat\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.5661983\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/068hy\",\n" +
                    "              \"description\": \"pet\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/0jbk\",\n" +
                    "                \"description\": \"animal\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.9382622\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/01yrx\",\n" +
                    "              \"description\": \"cat\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/068hy\",\n" +
                    "                \"description\": \"pet\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.98509187\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/01l7qd\",\n" +
                    "              \"description\": \"whiskers\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.43819335\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"entity\": {\n" +
                    "              \"entityId\": \"/m/0307l\",\n" +
                    "              \"description\": \"cat like mammal\",\n" +
                    "              \"languageCode\": \"en-US\"\n" +
                    "            },\n" +
                    "            \"categoryEntities\": [\n" +
                    "              {\n" +
                    "                \"entityId\": \"/m/04rky\",\n" +
                    "                \"description\": \"mammal\",\n" +
                    "                \"languageCode\": \"en-US\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"segments\": [\n" +
                    "              {\n" +
                    "                \"segment\": {\n" +
                    "                  \"startTimeOffset\": \"0s\",\n" +
                    "                  \"endTimeOffset\": \"14.840s\"\n" +
                    "                },\n" +
                    "                \"confidence\": 0.4902568\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          }\n" +
                    "        ]\n" +
                    "      }");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return var;
    }

    public ArrayList<String> cvi21r() {
        JSONObject a = cvi21();
        ArrayList<String> b = new ArrayList<String>();
        try {
            JSONArray a1 = a.getJSONArray("segmentLabelAnnotations");

            for (int i = 0; i < a1.length(); i++) {
                b.add(a.getJSONArray("segmentLabelAnnotations")
                        .getJSONObject(i)
                        .getJSONObject("entity")
                        .getString("description"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return b;
    }

}

