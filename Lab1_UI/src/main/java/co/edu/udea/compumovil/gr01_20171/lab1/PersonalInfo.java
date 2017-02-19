package co.edu.udea.compumovil.gr01_20171.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PersonalInfo extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemClickListener(this);

        ArrayAdapter adapterEscolaridad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.escolaridad));
        spinner.setAdapter(adapterEscolaridad);

    }

    public void OnClickListener(View view) {
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
