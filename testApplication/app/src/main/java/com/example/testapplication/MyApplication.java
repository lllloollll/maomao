package com.example.testapplication;

import android.app.Application;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

public class MyApplication extends Application {
    private String name;

    public void setName(String string){
        name = string;
    }

    public String getName(){
        return name;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("MyApplication is create!");
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        System.out.println("conFIgurationChang!");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        System.out.println("MyApplication is LowMenmory!");
    }
}
