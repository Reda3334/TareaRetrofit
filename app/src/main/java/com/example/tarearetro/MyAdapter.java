package com.example.tarearetro;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<Info>infoList;
    Context context;
    public MyAdapter (Context context, List<Info>infos){
        this.context = context;
        infoList = infos;
    }
    @Override

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Info info = infoList.get(position);
        holder.name.setText(info.getName());
        holder.description.setText(info.getDesription());
        holder.followers.setText(info.getFollowers());
    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name, description, followers;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_tv);
            description = itemView.findViewById(R.id.description_tv);
            followers = itemView.findViewById(R.id.followers_tv);

        }
    }

}