package com.example.learningenglish.welcome;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.learningenglish.mainMenu.MainActivity;
import com.example.learningenglish.R;

import java.util.UUID;

public class MeetFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    private int id;
    private Button yes;
    private Button no;
    private Context context;

    public MeetFragment(int id, Context context) {
        this.id = id;
        this.context = context;
    }


    public static MeetFragment newInstance(int index, Context context) {
        MeetFragment fragment = new MeetFragment(index, context);
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        yes = view.findViewById(R.id.btn_yes);
        yes.setOnClickListener(V -> {
            auth();
            startActivity(new Intent(context, MainActivity.class));
            getActivity().finish();


        });
        no = view.findViewById(R.id.btn_no);
        no.setOnClickListener(v -> Toast.makeText(context,"А может ты нажмешь Да))))",Toast.LENGTH_SHORT).show());
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_meet, container, false);
        return root;
    }
    void auth() {
        String userId = UUID.randomUUID().toString();
        saveToken(userId);
    }

    private void saveToken(String token) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        preferences.edit()
                .putString("auth_token", token)
                .apply();
    }

}
