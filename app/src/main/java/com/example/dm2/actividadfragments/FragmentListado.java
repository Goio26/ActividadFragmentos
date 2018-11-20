package com.example.dm2.actividadfragments;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class FragmentListado extends Fragment{

    private ListView lista;
    private ListaListener listener;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fargemento_lista, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onActivityCreated(Bundle state) {

        super.onActivityCreated(state);

        lista=(ListView) getView().findViewById(R.id.lista_planetas);
        final Planeta[] debs= new Planeta[]{new Planeta("Mercurio ","4.880 km.", getContext().getDrawable(R.mipmap.ic__mercurio),"Mercurio es el planeta del sistema solar más próximo al Sol y el más pequeño. Forma parte de los denominados planetas interiores o terrestres y carece de satélites naturales al igual que Venus. Se conocía muy poco sobre su superficie hasta que fue enviada la sonda planetaria Mariner 10 y se hicieron observaciones con radar y radiotelescopios."),
                new Planeta("Venus","12.104 km.",getContext().getDrawable(R.mipmap.ic__venus),"Venus es el segundo planeta del sistema solar en orden de distancia desde el Sol, el sexto en cuanto a tamaño, ordenados de mayor a menor. Al igual que Mercurio, carece de satélites naturales. Recibe su nombre en honor a Venus, la diosa romana del amor (gr. Afrodita). Se trata de un planeta de tipo rocoso y terrestre, llamado con frecuencia el planeta hermano de la Tierra, ya que ambos son similares en cuanto a tamaño, masa y composición, aunque totalmente diferentes en cuestiones térmicas y atmosféricas (la temperatura media de Venus es de 463,85 ºC). La órbita de Venus es una elipse con una excentricidad de menos del 1 %, formando la órbita más circular de las de todos los planetas; apenas supera la de Neptuno. Su presión atmosférica es 90 veces superior a la terrestre; es, por tanto, la mayor presión atmosférica de las de todos los planetas rocosos del sistema solar."),
                new Planeta("La Tierra","12.756 km.",getContext().getDrawable(R.mipmap.ic__tierra),"La Tierra (del latín Terra,1 deidad romana equivalente a Gea, diosa griega de la feminidad y la fecundidad) es un planeta del sistema solar que gira alrededor de su estrella —el Sol— en la tercera órbita más interna. Es el más denso y el quinto mayor de los ocho planetas del sistema solar. También es el mayor de los cuatro terrestres o rocosos."),
                new Planeta("Marte","6.794 km.",getContext().getDrawable(R.mipmap.ic__marte),"Marte es el cuarto planeta en orden de distancia al Sol y el segundo más pequeño del sistema solar, después de Mercurio. Recibió su nombre en homenaje al dios de la guerra de la mitología romana (Ares en la mitología griega), y también es conocido como el planeta rojo debido a la apariencia rojiza que le confiere el óxido de hierro predominante en su superficie. Marte es el planeta interior más alejado del Sol. Es un planeta telúrico con una atmósfera delgada de dióxido de carbono, y posee dos satélites pequeños y de forma irregular, Fobos y Deimos (hijos del dios griego), que podrían ser asteroides capturados similares al asteroide troyano (5261) Eureka. Sus características superficiales recuerdan tanto a los cráteres de la Luna como a los valles, desiertos y casquetes polares de la Tierra"),
                new Planeta("Júpiter","142.984 km.",getContext().getDrawable(R.mipmap.ic__jupiter),"Júpiter es el quinto planeta del sistema solar. Forma parte de los denominados planetas exteriores o gaseosos. Recibe su nombre del dios romano Júpiter (Zeus en la mitología griega).Se trata del planeta que ofrece un mayor brillo a lo largo del año dependiendo de su fase. Es, además, después del Sol, el mayor cuerpo celeste del sistema solar, con una masa casi dos veces y media la de los demás planetas juntos (con una masa 318 veces mayor que la de la Tierra y tres veces mayor que la de Saturno, además de ser, en cuanto a volumen, 1317 veces más grande que la Tierra). También es el planeta más antiguo del sistema solar, siendo incluso más antiguo que el sol; este descubrimiento fue realizado por investigadores de la universidad de Münster en Alemania."),
                new Planeta("Saturno","108.728 km",getContext().getDrawable(R.mipmap.ic__saturno),"Saturno es el sexto planeta del sistema solar, el segundo en tamaño y masa después de Júpiter y el único con un sistema de anillos visible desde la Tierra. Su nombre proviene del dios romano Saturno. Forma parte de los denominados planetas exteriores o gaseosos. El aspecto más característico de Saturno son sus brillantes anillos. Antes de la invención del telescopio, Saturno era el más lejano de los planetas conocidos y, a simple vista, no parecía luminoso ni interesante. El primero en observar los anillos fue Galileo en 1610, pero la baja inclinación de los anillos y la baja resolución de su telescopio le hicieron pensar en un principio que se trataba de grandes lunas."),
                 new Planeta("Urano","51.118 km.",getContext().getDrawable(R.mipmap.ic__urano),"Urano es el séptimo planeta del sistema solar, el tercero de mayor tamaño, y el cuarto más masivo. Se llama así en honor de la divinidad griega del cielo Urano (del griego antiguo «Οὐρανός»), el padre de Crono (Saturno) y el abuelo de Zeus (Júpiter). Aunque es detectable a simple vista en el cielo nocturno, no fue catalogado como planeta por los astrónomos de la antigüedad debido a su escasa luminosidad y a la lentitud de su órbita."),
                new Planeta("Neptuno","49.532 km.",getContext().getDrawable(R.mipmap.ic__neptuno),"Neptuno es el octavo planeta en distancia respecto al Sol y el más lejano del sistema solar. Forma parte de los denominados planetas exteriores o gigantes gaseosos, y es el primero que fue descubierto gracias a predicciones matemáticas. Su nombre fue puesto en honor al dios romano del mar —Neptuno—, y es el cuarto planeta en diámetro y el tercero más grande en masa.")};



    AdaptadorPlaneta adaptador= new AdaptadorPlaneta(getContext(),debs);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int pos, long id)
            {
                if (listener != null)

                    listener.onDiscoSeleccionado((Planeta)lista.getAdapter().getItem(pos));
            }
        });
    }

    public interface ListaListener {
        void onDiscoSeleccionado(Planeta c);
    }

    public void setListaListener (ListaListener listener){
        this.listener = listener;
    }
}
