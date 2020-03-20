package com.example.mvpapi.presenter;

import android.content.Context;
import android.util.Log;

import com.example.mvpapi.interactor.MainInteractor;
import com.example.mvpapi.interactor.MainInteractorImpl;
import com.example.mvpapi.model.Data;
import com.example.mvpapi.model.ResponseApi;
import com.example.mvpapi.model.Senin;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainPresenterImpl implements MainPresenter {

    MainView mainView;
    List<Data> dataList;
    Context context;
    MainInteractor interactor;

    public MainPresenterImpl(MainView view, Context context) {
        this.mainView = view;
        this.context = context;
        dataList = new ArrayList<>();
        interactor = new MainInteractorImpl();
    }


    @Override
    public void dataMainPresenter() {
//        interactor.getMainInteractor(new MainInteractor.ListenerInteractor<Object>() {
            interactor.getMainInteractor(new MainInteractor.ListenerInteractor<ResponseApi>() {


            @Override
//            public void onSuccess(Object data) {
                public void onSuccess(ResponseApi data) {
                Log.d("presenter", "dataPres" + data);
//                mainView.dataMainView(new Gson().toJson(data));



                try {
                    JSONObject dataJson = new JSONObject(new Gson().toJson(data));
                    JSONObject objectRespons = (JSONObject) dataJson;
                    JSONObject dataJsonObj = dataJson.getJSONObject("data");
//                    JSONObject objectSenin = dataJson.getJSONObject("senin");

//                        try {
////                            JSONObject dataJsonSenin = new JSONObject(new Gson().toJson(data));
//                            JSONObject objectSenin = dataJson.getJSONObject("senin");
//                            Log.d("halo", "dataSenin" + objectSenin);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }

                    //mengambil string status dan today
                    String status = (String) objectRespons.get("status");
                    String today = (String) objectRespons.get("today");
                    Log.d("status", "" + status);
                    Log.d("today", "" + today);
//
                    Log.d("halo", "dataJson" + dataJsonObj);
//                    Log.d("halo", "dataSenin" + objectSenin);

//                    //mengambil hari dari object data
                    String senin = dataJsonObj.getString("senin");
                    String selasa = dataJsonObj.getString("selasa");
                    String rabu = dataJsonObj.getString("rabu");
                    String kamis = dataJsonObj.getString("kamis");
                    String jumat = dataJsonObj.getString("jumat");

                    HashMap<String, String> days = new HashMap<>();
                    days.put("senin", senin);
                    days.put("selasa", selasa);
                    days.put("rabu", rabu);
                    days.put("kamis", kamis);
                    days.put("jumat", jumat);


                    Log.d("senin", "seninHore" + senin);
                    Log.d("selasa", "seninHore" + selasa);
                    Log.d("rabu", "seninHore" + rabu);
                    Log.d("kamis", "seninHore" + kamis);
                    Log.d("jumat", "seninHore" + jumat);

                    mainView.dataMainView(dataJsonObj);


                }catch (JSONException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(String message) {

            }
        });
    }
}
