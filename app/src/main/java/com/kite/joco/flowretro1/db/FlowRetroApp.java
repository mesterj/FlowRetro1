package com.kite.joco.flowretro1.db;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by Mester József on 2015.07.30..
 */
public class FlowRetroApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
        FlowManager.destroy();
    }
}
