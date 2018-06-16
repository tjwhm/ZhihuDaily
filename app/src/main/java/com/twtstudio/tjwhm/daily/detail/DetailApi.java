package com.twtstudio.tjwhm.daily.detail;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DetailApi {

    @GET("news/{index}")
    public Call<DetailBean> getDetail(@Path("index") String index);
}
