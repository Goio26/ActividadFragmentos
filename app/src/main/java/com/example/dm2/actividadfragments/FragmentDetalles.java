package com.example.dm2.actividadfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDetalles extends Fragment{

    private TextView detalles;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragmento_detalles, container, false);
    }

    public void muestraDettale(String nom){

        detalles=getView().findViewById(R.id.informacion);
        detalles.setText(nom);
    }

}
