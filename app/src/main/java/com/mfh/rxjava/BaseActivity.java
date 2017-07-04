package com.mfh.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        getContext();
    }

    public void getContext() {
        ToastHelp.setToast(getApplicationContext());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ToastHelp.toastDismiss();
    }
}
