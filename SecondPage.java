package com.example.admin.demo1;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SecondPage extends Activity {
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }
    public void hostels(View view) {
        Intent intent = new Intent(SecondPage.this, ThirdPage.class);
        startActivity(intent);
    }
    public void departments(View view) {
        Intent intent = new Intent(SecondPage.this, ThirdPage.class);
        startActivity(intent);
    }
    public void canteens(View view) {
        Intent intent = new Intent(SecondPage.this, ThirdPage.class);
        startActivity(intent);
    }
    public void messes(View view) {
        Intent intent = new Intent(SecondPage.this, ThirdPage.class);
        startActivity(intent);
    }

}
        /*Button button = (Button) findViewById(R.id.button2);
        textView2 = (TextView) findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new JSONTask2().execute("https://spider.nitt.edu/lateral/appdev/coordinates?category=departments");
            }
        });
    }


    public class JSONTask2 extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection connection = null;
            BufferedReader reader;
            reader = null;
            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuffer buffer = new StringBuffer();

                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }

                //String finalJson = buffer.toString();
                //JSONObject parentObject = new JSONObject(finalJson);
                //JSONArray parentArray = parentObject.getJSONArray("departments");
                //String finalObject = String.valueOf(parentArray);
                return buffer.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            textView2.setText(result);
        }
    }

    }*/
