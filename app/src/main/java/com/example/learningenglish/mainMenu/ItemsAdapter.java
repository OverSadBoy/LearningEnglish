package com.example.learningenglish.mainMenu;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learningenglish.R;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {

    private List<Item> data;
    private ItemsAdapterListener listener = null;

    public void setListener(ItemsAdapterListener listener) {
        this.listener = listener;
    }

    public ItemsAdapter(List<Item> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bind(data.get(position), position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private final TextView lessonNum;
        private final TextView lessonName;
        private final ImageButton startLesson;
        private final ImageView completeLesson;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            lessonNum = itemView.findViewById(R.id.num_lesson);
            lessonName = itemView.findViewById(R.id.name_lesson);
            startLesson = itemView.findViewById(R.id.btn_start_lesson);
            completeLesson = itemView.findViewById(R.id.complete_lesson);

        }

        public void bind(Item item, int position) {
            lessonNum.setText(item.getLessonNum());
            lessonName.setText(item.getLessonName());
            startLesson.setOnClickListener(v -> {
                if (listener != null&& position == 0)
                    listener.onStartFLClick(item);
                completeLesson.setVisibility(View.VISIBLE);
            });

        }

    }
}
