package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;


import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.srinumallidi.udacity.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

/**
 * Created by Srinu Mallidi.
 */

class EndPointAsyncTask extends AsyncTask<Object, Object, Void> {
    private final String LOG_TAG = EndPointAsyncTask.class.getSimpleName();
    private static MyApi myApiService = null;
    private String joke;


    @Override
    protected Void doInBackground(Object... params) {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://builditbigger-145809.appspot.com/_ah/api/");
            // end options for devappserver

            myApiService = builder.build();
        }



        try {
            joke = myApiService.getJoke().execute().getData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {

        return;
    }

    public String getJoke(){
        return joke;
    }
}