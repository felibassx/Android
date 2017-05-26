package com.example.felibass.a02_frangmentintercambiables;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

    FrameLayout contenedor;

    ListadoUsuarioFragment listado;
    CuadriculaUsuariosFragment cuadricula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtener objetos gui
        contenedor = (FrameLayout)findViewById(R.id.contenedorFragmentos);

        listado = new ListadoUsuarioFragment();

        getSupp().beginTransaction().add(R.id.contenedorFragmentos, listado).commit();


    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opciones_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.cambiarVista:
                //Cambiar vista
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
