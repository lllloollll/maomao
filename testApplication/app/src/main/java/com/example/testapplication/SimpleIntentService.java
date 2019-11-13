package com.example.testapplication;

import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

public class SimpleIntentService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public SimpleIntentService() {
        super("IntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try {
            Thread.sleep(5000);
            System.out.println("will stop IntentService");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate() {
        System.out.println("IntentService is start!");
        super.onCreate();
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        System.out.println("IntentService is onStartCommand!");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        System.out.println("IntentService is destory!");
        super.onDestroy();
    }
}
