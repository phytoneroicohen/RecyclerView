package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myHolder> {

    Context context;
    List<item> items;

    public myAdapter(Context context, List<item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myHolder holder, int position) {
    holder.nameView.setText(items.get(position).getName());
    holder.emilView.setText(items.get(position).getEmail());
    holder.imageView.setImageResource(items.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
