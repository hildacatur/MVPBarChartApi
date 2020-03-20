package com.example.mvpapi.interactor;

import com.example.mvpapi.model.Data;
import com.example.mvpapi.model.ResponseApi;
import com.example.mvpapi.model.Senin;

public interface MainInteractor {



    interface ListenerInteractor<T> {
//        void onSuccess(Object data);
void onSuccess(ResponseApi data);
//        void onSuccess(Senin senin);
        void onError(String message);

    }

//    void getMainInteractor(ListenerInteractor<Object> listenerInteractor);
    void getMainInteractor(ListenerInteractor<ResponseApi> listenerInteractor);
}
