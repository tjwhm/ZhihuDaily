package com.twtstudio.tjwhm.daily.main;

import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainPresenter {

    public static final String BASE_URL = "http://news-at.zhihu.com/api/3/";
    MainActivity mainActivity;

    public MainPresenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void getList() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MainApi api = retrofit.create(MainApi.class);
        Call call = api.getList();

        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                mainActivity.setData((MainBean) response.body());
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Toast.makeText(mainActivity, "fail", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
