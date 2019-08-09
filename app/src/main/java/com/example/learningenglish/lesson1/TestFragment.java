package com.example.learningenglish.lesson1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.learningenglish.R;

public class TestFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";
    private Context context;
    private Button finish;

    public TestFragment(Context context) {
        this.context = context;
    }

    public static TestFragment newInstance(int index, Context context) {
        TestFragment fragment = new TestFragment(context);
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button option_1 = view.findViewById(R.id.option_1);
        option_1.setText("Британский");
        option_1.setOnClickListener(v -> wrongOption());

        Button option_2 = view.findViewById(R.id.option_2);
        option_2.setText("Омериканский");
        option_2.setOnClickListener(v -> wrongOption());

        Button option_3 = view.findViewById(R.id.option_3);
        option_3.setText("Английский");
        option_3.setOnClickListener(v -> rightOption());

        Button option_4 = view.findViewById(R.id.option_4);
        option_4.setText("Сербский");
        option_4.setOnClickListener(v -> wrongOption());

        TextView question = view.findViewById(R.id.question);
        question.setText(getResources().getString(R.string.lesson_0_question_1));

        finish = view.findViewById(R.id.finish_lesson);


    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

    private void rightOption() {
        Toast.makeText(context, "ВЕРНО!", Toast.LENGTH_SHORT).show();
        finish.setVisibility(View.VISIBLE);
        finish.setOnClickListener(v -> getActivity().finish());

    }

    private void wrongOption() {
        Toast.makeText(context, "НЕВЕРНО!", Toast.LENGTH_SHORT).show();
    }
}
