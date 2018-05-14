package com.example.andrewmcclary.triviaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements fragment_making_questions.CallbackClass, fragment_quiz.QuizCallback{

    private fragment_making_questions questionCreatingFragment;
    private fragment_quiz quizFragment;
    private List<fragment_quiz> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        questionList = new ArrayList<>();
    }

    @OnClick(R.id.button_add_question)
    protected void addQuestionClicked(View view){
        questionCreatingFragment = fragment_making_questions.newInstance();
        questionCreatingFragment.attachParent(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_fragment_holder, questionCreatingFragment).commit();
    }

    @OnClick(R.id.button_take_quiz)
    protected void startQuizClicked(View view){
        quizFragment = fragment_quiz.newInstance();
        quizFragment.parentAttach(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_fragment_holder, quizFragment).commit();
    }

    @OnClick(R.id.button_delete_quiz)
    protected void deleteQuizClicked(){

    }

    @Override
    public void addQuestion(String question) {

    }
}
