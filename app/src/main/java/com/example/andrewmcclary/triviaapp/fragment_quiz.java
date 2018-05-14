package com.example.andrewmcclary.triviaapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public class fragment_quiz extends Fragment {

    private QuizCallback callback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_making_questions,container, false);
        ButterKnife.bind(this, view);
        return getView();
    }

    public static fragment_quiz newInstance() {

        Bundle args = new Bundle();

        fragment_quiz fragment = new fragment_quiz();
        fragment.setArguments(args);
        return fragment;
    }

    public void parentAttach(QuizCallback callback){
        this.callback = callback;
    }

    public interface QuizCallback{

    }
}
