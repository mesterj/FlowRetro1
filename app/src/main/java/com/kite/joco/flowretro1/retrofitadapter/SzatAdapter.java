package com.kite.joco.flowretro1.retrofitadapter;


import retrofit.RestAdapter;
/**
 * Created by Mester József on 2015.07.17..
 */
public class SzatAdapter {
    private static SzatApi SZAT_CLIENT;
    private static String root="http://192.168.86.3:8080/UzletkotoService-1.0/webresources/joco.uzletkotoservice.uzletkotok";

    static {
        setupSzatClient();
    }

    public static SzatApi getSzatClient(){
        return SZAT_CLIENT;
    }

    private static void setupSzatClient(){
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(root).build();
        SZAT_CLIENT = restAdapter.create(SzatApi.class);
    }
}
