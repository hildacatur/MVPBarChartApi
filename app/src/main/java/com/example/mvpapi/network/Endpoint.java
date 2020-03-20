package com.example.mvpapi.network;

import com.example.mvpapi.model.Data;
import com.example.mvpapi.model.ResponseApi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Endpoint {

    @GET ("/api/json/get/cgcjJLuPyq")
//    Call<Object> getEndData();
    Call<ResponseApi> getEndData();
}
