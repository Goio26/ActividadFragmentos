package com.example.dm2.actividadfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetalleActivity extends AppCompatActivity {

    public static final String INFO="texto";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_detalles);

        FragmentDetalles frgdetalles= (FragmentDetalles) getSupportFragmentManager().findFragmentById(R.id.frgDetalle);
        frgdetalles.muestraDettale(getIntent().getExtras().getString(INFO));
    }
}
