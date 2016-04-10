package com.example.admin.demo1;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ThirdPage extends Activity {
    private TextView textView3;
    String latitude;
    String longitude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        Button button7 = (Button) findViewById(R.id.button7);
        textView3 = (TextView) findViewById(R.id.textView3);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new JSONTask2().execute("https://spider.nitt.edu/lateral/appdev/coordinates?category=hostels");
                new JSONTask3().execute("https://spider.nitt.edu/lateral/appdev/coordinates?category=departments");
                new JSONTask4().execute("https://spider.nitt.edu/lateral/appdev/coordinates?category=canteens");
                new JSONTask5().execute("https://spider.nitt.edu/lateral/appdev/coordinates?category=messes");
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

                String finalJson = buffer.toString();
                JSONArray parentArray = new JSONArray(finalJson);
                StringBuffer finalData = new StringBuffer();
                for(int i=0;i<parentArray.length();i++) {
                    JSONObject finalObject = parentArray.getJSONObject(i);
                    String latitude = finalObject.getString("latitude");
                    String name = finalObject.getString("name");
                    String longitude = finalObject.getString("longitude");
                    finalData.append(name+'-'+latitude+'-'+longitude+"\n");
                }
                return finalData.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
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
            textView3.setText(result);
        }
    }
    public class JSONTask3 extends AsyncTask<String, String, String> {

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

                String finalJson = buffer.toString();
                JSONArray parentArray = new JSONArray(finalJson);
                StringBuffer finalData1 = new StringBuffer();
                for(int j=0;j<parentArray.length();j++) {
                    JSONObject finalObject = parentArray.getJSONObject(j);
                    String latitude = finalObject.getString("latitude");
                    String name = finalObject.getString("name");
                    String longitude = finalObject.getString("longitude");
                    finalData1.append(name+'-'+latitude+'-'+longitude+"\n");
                }
                return finalData1.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
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
            textView3.setText(result);
        }
    }
    public class JSONTask4 extends AsyncTask<String, String, String> {

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

                String finalJson = buffer.toString();
                JSONArray parentArray = new JSONArray(finalJson);
                StringBuffer finalData2 = new StringBuffer();
                for(int k=0;k<parentArray.length();k++) {
                    JSONObject finalObject = parentArray.getJSONObject(k);
                    String latitude = finalObject.getString("latitude");
                    String name = finalObject.getString("name");
                    String longitude = finalObject.getString("longitude");
                    finalData2.append(name+'-'+latitude+'-'+longitude+"\n");
                }
                return finalData2.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
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
            textView3.setText(result);
        }
    }
    public class JSONTask5 extends AsyncTask<String, String, String> {

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

                String finalJson = buffer.toString();
                JSONArray parentArray = new JSONArray(finalJson);
                StringBuffer finalData3 = new StringBuffer();
                for (int l = 0; l < parentArray.length(); l++) {
                    JSONObject finalObject = parentArray.getJSONObject(l);
                    String latitude = finalObject.getString("latitude");
                    String name = finalObject.getString("name");
                    String longitude = finalObject.getString("longitude");
                    finalData3.append(name + '-' + latitude + '-' + longitude + "\n");
                }
                return finalData3.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
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
            textView3.setText(result);
        }
    }
    public void displayMap(View view){
        Intent intent = new Intent(ThirdPage.this,FourthPage.class);
        Bundle extras = new Bundle();
        intent.putExtra("latitude",latitude);
        intent.putExtra("longitude", longitude);
        startActivity(intent);

    }

}

