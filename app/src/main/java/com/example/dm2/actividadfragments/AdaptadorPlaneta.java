package com.example.dm2.actividadfragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorPlaneta extends ArrayAdapter<Planeta> {

    private Planeta[] planetas;

    public AdaptadorPlaneta(Context context, Planeta[] planetas) {

        super(context, R.layout.planetas, planetas);
        this.planetas=planetas;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.planetas, null);

        TextView nombre = (TextView)item.findViewById(R.id.nombre_disco);
        nombre.setText(planetas[position].getNombre());

        TextView canciones = (TextView)item.findViewById(R.id.canciones);
        canciones.setText(planetas[position].getCanciones());

        ImageView imagen = (ImageView) item.findViewById(R.id.foto_disco);
        imagen.setImageDrawable(planetas[position].getFotodisco());
        return(item);
    }
}