package com.example.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Generación del texto por XML
        setContentView(R.layout.activity_main);
        //Generación del texto mediante Java
        /*Al constructor del TextView hay que pasarle un contexto, 
        como Activity hereda de Context y MainActivity de esta última, podemos
        pasar "this" como contexto*/
//        TextView texto = new TextView(this);
//        //Se establece el texto a mostrar
//        texto.setText("Hola, Android");
//        //Se añade la vista a la jerarquía de vistas de la activity
//        setContentView(texto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
