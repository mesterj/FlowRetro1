package com.kite.joco.flowretro1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.kite.joco.flowretro1.entity.Uzletkoto;
import com.kite.joco.flowretro1.retrofitadapter.SzatAdapter;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends Activity {

    EditText etSzatKod;
    TextView tvNev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSzatKod = (EditText) findViewById(R.id.etSzatKod);
        tvNev = (TextView) findViewById(R.id.tvHello);
    }


    public void onClick(View v){
        String szatkod = etSzatKod.getText().toString();
        SzatAdapter.getSzatClient().getBySzatKod(szatkod, new Callback<Uzletkoto>() {
            @Override
            public void success(Uzletkoto uzletkoto, Response response) {
                tvNev.setText(uzletkoto.getNev());
                Log.d("FLOWRETROLOG", "SUCCESS");
            }

            @Override
            public void failure(RetrofitError error) {
                tvNev.setText("Nem sikerült a kapcsolódás");
                Log.d("FLOWRETROLOG", "FAILURE");
            }
        });
    }
}
