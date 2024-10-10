package com.example.tarearetro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Service {

    @GET("users/{user}/repos")
    Call<List<Info>> getInfo(@Path("user") String user);
}
