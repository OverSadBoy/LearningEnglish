package com.example.learningenglish.mainMenu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.learningenglish.R;
import com.example.learningenglish.lesson1.Lesson;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemsAdapter adapter = new ItemsAdapter(setData());
        adapter.setListener(new AdapterListener());
        recyclerView.setAdapter(adapter);
    }

    public List<Item> setData() {
        List<Item> data = new ArrayList<>();
        data.add(0, new Item(getResources().getString(R.string.lesson_num, "1"), getResources().getString(R.string.introduction), false));
        data.add(1, new Item(getResources().getString(R.string.lesson_num, "2"), getResources().getString(R.string.alphabet), false));
        return data;
    }


    public class AdapterListener implements ItemsAdapterListener {
        @Override
        public void onStartFLClick(Item item) {
            Intent intent = new Intent(MainActivity.this, Lesson.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

}
