package com.example.alfonsogalvanmadera.herencia;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import Herencia.ComportamientoRuido;
import Herencia.Delfin;
import Herencia.Leon;
import Herencia.Pollo;
import Herencia.Tortuga;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Delfin d1=new Delfin();
        d1.setNombre("flipper");
        Toast.makeText(getApplicationContext(),"Hola mundo el animal es:"+d1.getNombre(),Toast.LENGTH_LONG).show();
        Pollo p1=new Pollo();
        p1.setNombre("Pollito pio");
        Leon l1=new Leon();
        l1.setNombre("Simba");
        Leon l2=new Leon();
        l2.setNombre("Mu-fa-sa");
        Tortuga t1=new Tortuga();
        t1.setNombre("Tortuguita");
        Pollo pollo2=new Pollo();
        pollo2.setNombre("Deshuesado");

        ComportamientoRuido animales[]=new ComportamientoRuido[5];
        animales[0]=p1;
        animales[1]=l1;
        animales[2]=l2;
        animales[3]=d1;
        animales[4]=pollo2;

        for (ComportamientoRuido n: animales){
            Toast.makeText(getApplicationContext(),"El animal es: "+n.hacerRuido(),Toast.LENGTH_LONG).show();

        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
