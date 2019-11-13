package com.example.testapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReciver extends BroadcastReceiver {
    private static final String TAG = "MyReciver";
    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getStringExtra("msg");
        Log.i(TAG,msg);
    }
}
