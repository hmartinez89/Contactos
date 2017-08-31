package com.hmartinez.contactos;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class ConfirmarContactos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_contactos);

        Bundle parametros       = getIntent().getExtras();
        String sNombre          = parametros.getString(getString(R.string.param_nombre));
        String sFechaNacimiento = (String) parametros.get(getString(R.string.param_fechaNacimiento));
        String sTelefono        = parametros.getString(getString(R.string.param_telefono));
        String sCorreo          = parametros.getString(getString(R.string.param_mail));
        String sDescripcion     = parametros.getString(getString(R.string.param_descripcion));

        TextView tvNombre           = (TextView) findViewById(R.id.tvNombre_confirmarContacto);
        TextView tvTelefono         = (TextView) findViewById(R.id.tvTelefono_confirmarContacto);
        TextView tvFechaNacimiento  = (TextView) findViewById(R.id.tvFechaNacimiento_confirmarContacto);
        TextView tvCorreo           = (TextView) findViewById(R.id.tvMail_confirmarContacto);
        TextView tvDescripcion      = (TextView) findViewById(R.id.tvDescripcion_confirmarContacto);

        tvNombre.setText(sNombre);
        tvFechaNacimiento.setText(getResources().getString(R.string.tvFechaNacimiento_ConfirmarContactos, sFechaNacimiento));
        tvTelefono.setText(getResources().getString(R.string.tvTelefono_ConfirmarContactos, sTelefono));
        tvCorreo.setText(getResources().getString(R.string.tvMail_ConfirmarContactos, sCorreo));
        tvDescripcion.setText(getResources().getString(R.string.tvDescripcion_ConfirmarContactos, sDescripcion));

        Button btnEditarContactos = (Button) findViewById(R.id.btnEditarContactos);
        btnEditarContactos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ConfirmarContactos.this.finish();
            }
        });
    }
}