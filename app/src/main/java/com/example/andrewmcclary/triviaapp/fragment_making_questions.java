package com.example.andrewmcclary.triviaapp;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class fragment_making_questions extends Fragment {

    private CallbackClass callback;

    @BindView(R.id.edit_question)
    protected EditText questionEditText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_making_questions, container, false);
        }

    public static fragment_making_questions newInstance() {

        Bundle args = new Bundle();

        fragment_making_questions fragment = new fragment_making_questions();
        fragment.setArguments(args);
        return fragment;
    }

    @OnClick(R.id.button_add_question)
    protected void addQuestionButtonClicked() {
        callback.addQuestion(questionEditText.getText().toString());
    }

    public void attachParent(CallbackClass callback){
        this.callback = callback;
    }

    public interface CallbackClass{
        void addQuestion(String question);
    }
}
