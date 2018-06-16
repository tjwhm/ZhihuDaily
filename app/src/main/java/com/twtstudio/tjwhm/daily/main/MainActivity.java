package com.twtstudio.tjwhm.daily.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.twtstudio.tjwhm.daily.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_main;

    MainAdapter adapter;

    MainBean bean = new MainBean();

    MainPresenter mainPresenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_main = findViewById(R.id.rv_main);
        rv_main.setLayoutManager(new LinearLayoutManager(this));

        bean.top_stories = new ArrayList<>();
        bean.stories = new ArrayList<>();

        adapter = new MainAdapter(bean, this);

        rv_main.setAdapter(adapter);
        mainPresenter.getList();
    }


    public void setData(MainBean bean) {
        this.bean.date = bean.date;
        this.bean.stories = bean.stories;
        this.bean.top_stories = bean.top_stories;
        adapter.notifyDataSetChanged();
    }
}
