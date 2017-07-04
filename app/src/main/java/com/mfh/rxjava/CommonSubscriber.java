package com.mfh.rxjava;

import rx.Subscriber;

/**
 * Created by Blessed-tec1 on 2017/6/12.
 */

public class CommonSubscriber<T> extends Subscriber implements CommonObserver {
    private CommonSubscriber mCommonSubscriber;

    public CommonSubscriber(CommonSubscriber<?> commonSubscriber) {
        this.mCommonSubscriber=commonSubscriber;
    }

    @Override
    public void onCompleted() {
        onFinish();
    }

    @Override
    public void onError(Throwable e) {
        onFinish();
    }

    @Override
    public void onNext(Object o) {

    }

    @Override
    public void onFinish() {

    }
}
