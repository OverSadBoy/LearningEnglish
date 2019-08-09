package com.example.learningenglish.lesson1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.learningenglish.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class TheoryFragment  extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static TheoryFragment newInstance(int index) {
        TheoryFragment fragment = new TheoryFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lesson, container, false);
    }
}