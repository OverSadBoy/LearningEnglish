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

    private int id;

    private SecondPoolFragment(int id) {
        this.id = id;
    }


    static SecondPoolFragment newInstance(int index) {
        return new SecondPoolFragment(index);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.history_text);
        ImageView imageView = view.findViewById(R.id.second_image);
        LinearLayout linearLayout = view.findViewById(R.id.wind);
        if (id == 6) {
            linearLayout.setBackgroundColor(getResources().getColor(R.color.sepi));
            textView.setText(getString(R.string.spf_id6));
            imageView.setImageResource(R.drawable.ditya_v_shlyape_02);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sp_welcome, container, false);
    }
}
