package com.kite.joco.flowretro1.retrofitadapter;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

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
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(root).setConverter(new GsonConverter(gson)).build();
        SZAT_CLIENT = restAdapter.create(SzatApi.class);
    }
}
