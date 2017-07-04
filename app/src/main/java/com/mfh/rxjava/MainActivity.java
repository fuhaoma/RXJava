package com.mfh.rxjava;

import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends BaseActivity {


    @Bind(R.id.tv)
    TextView tv;
    @Bind(R.id.activity_main)
    RelativeLayout activityMain;
    private Call<Bean> bean1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getRetrofit();
    }

    private void getRetrofit() {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://api.douban.com/v2/movie/").
                addConverterFactory(GsonConverterFactory.create()).
                addCallAdapterFactory(RxJavaCallAdapterFactory.create()).
                build();

        bean1 = retrofit.create(ServiceAPI.class).getBean1();
        bean1.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                ToastHelp.toastLong("下载成功","123");
                Log.i("AAA", "onNext: count"+response.body().getCount());
            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {
            }
        });
//        bean.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<Bean>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(Bean bean) {
//                Log.i("AAA", "onNext: count"+bean.getCount());
//            }
//        });
//
    }

    @OnClick(R.id.tv)
    public void onViewClicked() {
        bean1.cancel();
        ToastHelp.toastLong(new Random().nextInt(11111111)+"","123");
    }

}
