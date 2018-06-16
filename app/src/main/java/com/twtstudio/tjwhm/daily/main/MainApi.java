package com.twtstudio.tjwhm.daily.main;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MainApi {

    @GET("stories/latest")
    public Call<MainBean> getList();
}
