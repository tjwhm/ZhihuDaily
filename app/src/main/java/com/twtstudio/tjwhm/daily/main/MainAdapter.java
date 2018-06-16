package com.twtstudio.tjwhm.daily.main;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.twtstudio.tjwhm.daily.R;
import com.twtstudio.tjwhm.daily.detail.DetailActivity;

public class MainAdapter extends RecyclerView.Adapter {

    private MainBean bean;
    private Context context;

    public MainAdapter(MainBean bean, Context context) {
        this.bean = bean;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_main, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MainViewHolder mHolder = (MainViewHolder) holder;
        final MainBean.StoriesBean data = bean.stories.get(position);
        mHolder.tvTitle.setText(data.title);
        Glide.with(context).load(data.images.get(0)).into(mHolder.ivMain);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("index", data.id);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
//        return 1;
        return bean.stories.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        ImageView ivMain;

        public MainViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            ivMain = itemView.findViewById(R.id.iv_main);
        }
    }
}
