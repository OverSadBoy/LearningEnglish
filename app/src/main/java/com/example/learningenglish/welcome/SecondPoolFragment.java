package com.example.learningenglish.welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.learningenglish.R;

public class SecondPoolFragment extends Fragment {

    int id;
    private ImageView imageView;
    private TextView textView;
    private LinearLayout linearLayout;

    public SecondPoolFragment(int id) {
        this.id = id;
    }


    public static SecondPoolFragment newInstance(int index) {
        SecondPoolFragment fragment = new SecondPoolFragment(index);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.history_text);
        imageView = view.findViewById(R.id.second_image);
        linearLayout = view.findViewById(R.id.wind);
        if (id == 6) {
            linearLayout.setBackgroundColor(getResources().getColor(R.color.sepi));
            textView.setText("Чтобы мы с тобой знали друг друга еще лучше,\nя предлагаю тебе, мой дорогой друг, немного\nокунуться в историю моей жизни...");
            imageView.setImageResource(R.drawable.ditya_v_shlyape_02);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_sp_welcome, container, false);
        return root;
    }
}
