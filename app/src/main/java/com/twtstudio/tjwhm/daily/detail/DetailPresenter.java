package com.twtstudio.tjwhm.daily.detail;

import android.widget.Toast;

import com.twtstudio.tjwhm.daily.main.MainApi;
import com.twtstudio.tjwhm.daily.main.MainPresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailPresenter {

    public static final String BASE_URL = "http://news-at.zhihu.com/api/3/";

    DetailActivity detailActivity;

    public DetailPresenter(DetailActivity detailActivity) {
        this.detailActivity = detailActivity;
    }

    public void getDetail(String index) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        DetailApi detailApi = retrofit.create(DetailApi.class);
        Call call = detailApi.getDetail(index);
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                detailActivity.setData((DetailBean) response.body());
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Toast.makeText(detailActivity, "fail", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
