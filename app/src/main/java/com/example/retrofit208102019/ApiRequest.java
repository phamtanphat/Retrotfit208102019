package com.example.retrofit208102019;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {

    @GET("demo1.json")
    Call<Demo1> getDemo1();
}
