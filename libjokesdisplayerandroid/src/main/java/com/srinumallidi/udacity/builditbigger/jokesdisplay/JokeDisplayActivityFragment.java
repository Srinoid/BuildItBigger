package com.srinumallidi.udacity.builditbigger.jokesdisplay;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeDisplayActivityFragment extends Fragment {

    String mJoke;

    public JokeDisplayActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View mView =inflater.inflate(R.layout.fragment_joke_display, container, false);
        mJoke = getActivity().getIntent().getStringExtra(JokeDisplayActivity.JOKE_KEY);
        TextView mtTextView = (TextView) mView.findViewById(R.id.joke_library_text_view);
        if(mJoke != null && mJoke.length() !=0){
            mtTextView.setText(mJoke);
        }
        return mView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("jokeString", mJoke);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(savedInstanceState !=null && savedInstanceState.containsKey("jokeString")){
            mJoke = savedInstanceState.getString("jokeSring");
        }
    }
}
