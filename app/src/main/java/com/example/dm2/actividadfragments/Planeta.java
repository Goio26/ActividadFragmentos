package com.example.dm2.actividadfragments;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;

public class Planeta extends AppCompatActivity {

    private String nombre;
    private String tamaño;
    private Drawable img;
    private String informacion;

    public Planeta(String nombre, String tamaño, Drawable img,String infor){

        this.nombre=nombre;
        this.tamaño=tamaño;
        this.img=img;
        informacion=infor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCanciones() {
        return tamaño;
    }

    public Drawable getFotodisco() {
        return img;
    }

    public String getInfo() {
        return informacion;
    }
}
