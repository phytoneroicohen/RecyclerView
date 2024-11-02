package com.example.myrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView,emilView;
    public myHolder(@NonNull View itemView){
        super(itemView);
        imageView=itemView.findViewById(R.id.imageView);
        nameView=itemView.findViewById(R.id.name);
        emilView=itemView.findViewById(R.id.email);

    }
}
