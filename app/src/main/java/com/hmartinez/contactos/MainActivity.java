package com.hmartinez.contactos;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnContactos = (Button) findViewById(R.id.btnContactos);
        btnContactos.setOnClickListener(new View.OnClickListener() {

        EditText etNombreCompleto         = (EditText) findViewById(R.id.tilNombre);
        EditText etTelefono               = (EditText) findViewById(R.id.tilTelefono);
        EditText etCorreo                 = (EditText) findViewById(R.id.tilMail);
        EditText etDescripcionContacto    = (EditText) findViewById(R.id.tilDescripcionContacto);

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ConfirmarContactos.class);

                i.putExtra(getResources().getString(R.string.param_nombre), etNombreCompleto.getText().toString());
                i.putExtra(getResources().getString(R.string.param_telefono), etTelefono.getText().toString());
                i.putExtra(getResources().getString(R.string.param_mail), etCorreo.getText().toString());
                i.putExtra(getResources().getString(R.string.param_descripcion), etDescripcionContacto.getText().toString());
                startActivity(i);
            }
        });
    }
}