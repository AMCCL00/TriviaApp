package com.example.andrewmcclary.triviaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class FragmentClass {

    private List<String> listA;
    private FragmentClass callback;
    private Bundle arguments;

    public void attachParent(FragmentClass callback){
        this.callback = callback;
    }

    public static FragmentClass newInstance() {

        Bundle args = new Bundle();

        FragmentClass fragment = new FragmentClass();
        fragment.setArguments(args);
        return fragment;
    }

    public void setArguments(Bundle arguments) {
        this.arguments = arguments;
    }

    public void addQuestion() {
        listA.add("Where");
    }
}
