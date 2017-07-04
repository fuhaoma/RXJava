package com.mfh.rxjava;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Blessed-tec1 on 2017/6/12.
 */

public class ToastHelp {
    private static Toast mToast;
    private static Context mContext;

    public static void setToast(Context context) {
        mContext = context;
    }

    public static void toastShort(String... strings) {
        if (mContext == null) return;
        if (mToast != null) {
            mToast.setText(strings[0] + "++++" + strings[1]);
        } else {
            mToast=setToastContent(strings);
        }
        mToast.show();
    }

    public static void toastLong(String... strings) {
        if (mContext == null) return;
        if (mToast != null) {
            mToast.setText(strings[0] + "++++" + strings[1]);
        } else {
           mToast=setToastContent(strings);
        }
        mToast.show();
    }

    public static Toast setToastContent(String... strings) {
        return Toast.makeText(mContext, strings[0] + "---" + strings[1], Toast.LENGTH_LONG);
    }

    public static void toastDismiss() {
        if (mToast == null) return;
        mToast.cancel();
    }
}
