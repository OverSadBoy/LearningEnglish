package com.example.learningenglish.welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.learningenglish.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class FirstPoolFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    private int id;

    private FirstPoolFragment(int id) {
        this.id = id;
    }


    static FirstPoolFragment newInstance(int index) {
        return new FirstPoolFragment(index);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = view.findViewById(R.id.main_image);
        TextView firstText = view.findViewById(R.id.first_text);
        TextView secondText = view.findViewById(R.id.second_text);
        switch (id) {
            case 1:
                firstText.setText(getResources().getString(R.string.hii));
                secondText.setText(getString(R.string.f_text));
                break;
            case 2:
                firstText.setText(getString(R.string.s_f_text));
                secondText.setText(getString(R.string.s_s_text));
                break;
            case 3:
                firstText.setText(getString(R.string.th_f_text));
                secondText.setText(getString(R.string.th_s_text));
                break;
            case 4:
                imageView.setImageResource(R.drawable.psya);
                firstText.setText(getString(R.string.fr_f_text));
                secondText.setText(getString(R.string.fr_s_text));
                break;
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fp_welcome, container, false);
    }
}