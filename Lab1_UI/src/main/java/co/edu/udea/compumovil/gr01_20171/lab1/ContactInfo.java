package co.edu.udea.compumovil.gr01_20171.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class ContactInfo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        AutoCompleteTextView pais = (AutoCompleteTextView) findViewById(R.id.paisEditText);
        ArrayAdapter adapterPais = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.paises));
        pais.setAdapter(adapterPais);
        pais.setThreshold(1);

        AutoCompleteTextView ciudad = (AutoCompleteTextView) findViewById(R.id.ciudadEditText);
        ArrayAdapter adapterCiudad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ciudades));
        ciudad.setAdapter(adapterCiudad);
        ciudad.setThreshold(1);
    }

    public void siguiente(View view) {

    }
}
