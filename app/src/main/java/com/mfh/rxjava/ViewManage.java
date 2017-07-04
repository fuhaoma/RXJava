package com.mfh.rxjava;

/**
 * Created by Blessed-tec1 on 2017/6/12.
 */

public interface ViewManage {
    void setLoadingView(int... layoutId);
    void setFailedView(int... layoutId);
    void setFinishView();
}
