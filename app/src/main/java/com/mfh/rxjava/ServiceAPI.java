package com.mfh.rxjava;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Blessed-tec1 on 2017/6/9.
 */

public interface ServiceAPI {
    @GET("top250")
    Observable<Bean> getBean();
    @GET("top250")
    Call<Bean> getBean1();
}
