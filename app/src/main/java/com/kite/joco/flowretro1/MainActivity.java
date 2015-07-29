package com.kite.joco.flowretro1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.kite.joco.flowretro1.entity.Uzletkoto;
import com.kite.joco.flowretro1.retrofitadapter.SzatAdapter;
import com.kite.joco.flowretro1.retrofitadapter.SzatApi;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
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
        switch (v.getId()){
        case (R.id.btnLeker):
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
            break;
            case (R.id.btnMind):
                try {
                    //String lekeres = SzatAdapter.getSzatClient().getAllSzat();
                    //Toast.makeText(this, lekeres,Toast.LENGTH_LONG).show();
                    //Log.d("FLOWRERTOLOG ","Lekérés ereménye stringben " + lekeres);
                    SzatAdapter.getSzatClient().listofSzat(new Callback<Uzletkoto[]>() {
                        @Override
                        public void success(Uzletkoto[] uzletkotos, Response response) {
                            Log.d("FLOWRETROLOG","SUCCESS ");
                            for (Uzletkoto uz:uzletkotos){
                                Log.d("FLOWRETROLOG","Egy uz: " + uz.getNev());
                            }
                        }

                        @Override
                        public void failure(RetrofitError error) {
                            Log.d("FLOWRETROLOG","Failure");

                        }
                    });
                    //Uzletkoto uzletkotos = SzatAdapter.getSzatClient().getAllSzat();

                    //Toast.makeText(this,sb.toString(),Toast.LENGTH_LONG).show();
                    //Log.d("FLOWRETROLOG","Sikeresen lekértem az összes szat adatát");
                }
                catch (Exception ex) {
                    Log.d("FLOWRETROLOG","HIBA a lista lekérdezése során: " + ex.getLocalizedMessage());
                }
                break;
            default:
                break;

    }
    }
}
