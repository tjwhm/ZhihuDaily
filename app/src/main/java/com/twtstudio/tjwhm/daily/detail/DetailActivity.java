package com.twtstudio.tjwhm.daily.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.twtstudio.tjwhm.daily.R;

public class DetailActivity extends AppCompatActivity {


    WebView webView;

    DetailPresenter detailPresenter = new DetailPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        webView = findViewById(R.id.wbView);

        String index = String.valueOf(getIntent().getIntExtra("index", 0));
        detailPresenter.getDetail(index);
    }

    public void setData(DetailBean data) {
        webView.loadData(data.body, "text/html", "UTF-8");
    }


}
