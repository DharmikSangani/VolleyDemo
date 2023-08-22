package com.example.volleydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button callAPI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callAPI = findViewById(R.id.callButton);

        callAPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);


//                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
//                String url = "https://jsonplaceholder.typicode.com/users";
//
//                // Request a string response from the provided URL.
//                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                        new Response.Listener<String>() {
//                            @Override
//                            public void onResponse(String response) {
//                                // Display the first 500 characters of the response string.
//                                //textView.setText("Response is: " + response.substring(0, 500));
//                                //Log.d("YYY", "onResponse: "+response.toString());
//                                try {
//                                    JSONArray jsonArray=new JSONArray(response);
//                                    for(int i=0;i<jsonArray.length();i++)
//                                    {
//                                        JSONObject mainObj=jsonArray.getJSONObject(i);
//                                        //Log.d("YYY", "onResponse: MainObj="+mainObj);
//                                        int id=mainObj.getInt("id");
//                                        String name=mainObj.getString("name");
//                                        String phone=mainObj.getString("phone");
//                                        String username=mainObj.getString("username");
//                                        String email=mainObj.getString("email");
//                                        String website=mainObj.getString("website");
//
//                                        JSONObject address = mainObj.getJSONObject("address");
//
//                                        String street=address.getString("street");
//                                        String suite=address.getString("suite");
//                                        String city=address.getString("city");
//                                        String zipcode=address.getString("zipcode");
//
//
//
//                                        dataModel=new Data_Model(id,name,phone,username,email,street,suite,city,zipcode,website);
//                                        dataModelList.add(dataModel);
//
//                            // JSONObject address=mainObj.getJSONObject("address");
//                            // Log.d("YYY", "onResponse: Address="+address);
//                                    }
//                                    Log.d("YYY", "onResponse: Lists of Data="+dataModelList);
//
//
//                                } catch (JSONException e) {
//                                    throw new RuntimeException(e);
//                                }
//                            }
//                        }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        //textView.setText("That didn't work!");
//                        Log.d("YYY", "onErrorResponse: "+error.getLocalizedMessage());
//                    }
//                });
//
//// Add the request to the RequestQueue.
//                queue.add(stringRequest);
//
//
//
            }

        });

    }
}