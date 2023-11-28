package com.example.onlineshoping;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyCostumAdapter1 extends RecyclerView.Adapter<MyCostumAdapter1.MyViewHolder> {
    Context context;
    List<RowModelList1> rowModelList;
    public MyCostumAdapter1(Context context, List<RowModelList1> rowModelList) {
        this.context = context;
        this.rowModelList = rowModelList;
    }
    @NonNull
    @Override
    public MyCostumAdapter1.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.nonvegeitem_list,parent,false);
        return new MyCostumAdapter1.MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyCostumAdapter1.MyViewHolder holder, int position) {
        Glide.with(context).load(rowModelList.get(position).getNonVegeImage()).into(holder.imageView);
        holder.textView.setText(rowModelList.get(position).getNonVege());
        holder.textView.setText(rowModelList.get(position).getNonVegeCost());
    }
    @Override
    public int getItemCount() {
        return rowModelList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.nonvegeimageView);
            textView = itemView.findViewById(R.id.nonvegetext);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            if(getLayoutPosition() == 0){
                Toast.makeText(context,"you clicked First item", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
