package com.example.dm2.actividadfragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentListado.ListaListener{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentListado fragmen1= (FragmentListado) getSupportFragmentManager().findFragmentById(R.id.frgListado);
        fragmen1.setListaListener(this);

    }

        public void onDiscoSeleccionado(Planeta c) {

            boolean hayDetalle = (getSupportFragmentManager().findFragmentById(R.id.frgDetalle)!= null);
            if (hayDetalle) {

                ((FragmentDetalles)getSupportFragmentManager().findFragmentById(R.id.frgDetalle)).muestraDettale(c.getInfo());
            }
            else {
                Intent i = new Intent(this, DetalleActivity.class);
                i.putExtra(DetalleActivity.INFO, c.getInfo());
                startActivity(i);
            }
        }
}
