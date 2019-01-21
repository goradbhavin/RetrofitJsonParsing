package com.gb.retrofitjsonparsingdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by bhavin on 10/9/2018.
 */

public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
