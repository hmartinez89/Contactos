package com.hmartinez.contactos;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvFechaNacimiento = (TextView) findViewById(R.id.tvFechaNacimientoCal);

        Button btnContactos = (Button) findViewById(R.id.btnContactos);
        btnContactos.setOnClickListener(new View.OnClickListener() {

        TextInputEditText tietNombreCompleto         = (TextInputEditText) findViewById(R.id.tietNombre);
        TextInputEditText tietTelefono               = (TextInputEditText) findViewById(R.id.tietTelefono);
        TextInputEditText tietCorreo                 = (TextInputEditText) findViewById(R.id.tietMail);
        TextInputEditText tietDescripcionContacto    = (TextInputEditText) findViewById(R.id.tietDescripcion);

        DatePicker dpFechaNacimiento = (DatePicker) findViewById(R.id.dpFechaNacimiento);

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ConfirmarContactos.class);

                i.putExtra(getString(R.string.param_nombre), tietNombreCompleto.getText().toString());
                i.putExtra(getString(R.string.param_telefono), tietTelefono.getText().toString());
                i.putExtra(getString(R.string.param_mail), tietCorreo.getText().toString());
                i.putExtra(getString(R.string.param_descripcion), tietDescripcionContacto.getText().toString());

                GregorianCalendar gcFechaNacimiento =
                new GregorianCalendar(dpFechaNacimiento.getYear(), dpFechaNacimiento.getMonth(), dpFechaNacimiento.getDayOfMonth());
                Date dFechaNacimiento = gcFechaNacimiento.getTime();

                SimpleDateFormat sdfFechaNacimiento = new SimpleDateFormat("dd-MM-yyyy");


                i.putExtra(getString(R.string.param_fechaNacimiento), sdfFechaNacimiento.format(dFechaNacimiento));
                startActivity(i);
            }
        });
    }
}