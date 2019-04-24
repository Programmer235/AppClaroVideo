package com.example.mx.com.myproject.appclarovideo.app;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application{

    private static MyApp INSTANCE;

    public  static MyApp getInstance(){
        return INSTANCE;
    }


    public static Context getContext(){
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        INSTANCE = this;
        super.onCreate();
    }
}
