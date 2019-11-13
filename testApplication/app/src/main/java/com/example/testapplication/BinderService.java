package com.example.testapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.util.Random;

public class BinderService extends Service {
    private final IBinder iBinder = new LocalBinder();
    private final Random mGenerator = new Random();
    public class LocalBinder extends Binder{
        BinderService getService(){
            return BinderService.this;
        }
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }
    public int getRandomNumber(){
        return mGenerator.nextInt(100);
    }
}
