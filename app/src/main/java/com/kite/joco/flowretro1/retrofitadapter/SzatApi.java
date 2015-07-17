package com.kite.joco.flowretro1.retrofitadapter;

import com.kite.joco.flowretro1.entity.Uzletkoto;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.Callback;

/**
 * Created by Mester József on 2015.07.17..
 */
public interface SzatApi  {
    @GET("/{szatkod}")
    void getBySzatKod(@Path("szatkod") String szatkod, Callback<Uzletkoto> callback);
}
