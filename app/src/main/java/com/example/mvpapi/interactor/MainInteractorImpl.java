package com.example.mvpapi.interactor;

import android.util.Log;

import com.example.mvpapi.model.Data;
import com.example.mvpapi.model.ResponseApi;
import com.example.mvpapi.network.Endpoint;
import com.example.mvpapi.network.Network;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainInteractorImpl implements MainInteractor {

    Data dataInter = new Data();
    Network network;
    Endpoint endpoint;

    @Override
//    public void getMainInteractor(final ListenerInteractor<Object> listenerInteractor) {
        public void getMainInteractor(final ListenerInteractor<ResponseApi> listenerInteractor) {

        endpoint = Network.getClient().create(Endpoint.class);
//        Call<Object> call = endpoint.getEndData();
        Call<ResponseApi> call = endpoint.getEndData();
//        call.enqueue(new Callback<Object>() {
            call.enqueue(new Callback<ResponseApi>() {

            @Override
//            public void onResponse(Call<Object> call, Response<Object> response) {
                public void onResponse(Call<ResponseApi> call, Response<ResponseApi> response) {
                Log.d("respon", "" + response );

//                Object obj = response.body();
                ResponseApi obj = response.body();
                if (response.isSuccessful()){
                    listenerInteractor.onSuccess(obj);
                    Log.d("sukses", "" + obj );
                } else {
                    Log.d("notSukses", "gakblass" + obj);
                }

            }

            @Override
//            public void onFailure(Call<Object> call, Throwable t) {
                public void onFailure(Call<ResponseApi> call, Throwable t) {
                Log.d("notSukses", "ogak " + t);
            }
        });
//        listenerInteractor.onSuccess(dataInter.getSenin());
//
//        Endpoint endpoint = Network.getRetrofit().create(Endpoint.class);
//        Call<Object> call = endpoint.getEndData();
//        call.enqueue(new Callback<Object>() {
//
//            @Override
//            public void onResponse(Call<Object> call, Response<Object> response) {
//                Log.d("dataapi", "" + response);
//                Object a = response.body();
//                listenerInteractor.onSuccess(a);
//            }
//
//            @Override
//            public void onFailure(Call<Object> call, Throwable t) {
//
//            }
//        });



    }
}
