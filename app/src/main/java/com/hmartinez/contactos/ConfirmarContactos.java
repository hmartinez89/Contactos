package com.hmartinez.contactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ConfirmarContactos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_contactos);

        Bundle parametros    = getIntent().getExtras();
        String sNombre       = parametros.getString(getResources().getString(R.string.param_nombre));
        String sTelefono     = parametros.getString(getResources().getString(R.string.param_telefono));
        String sCorreo       = parametros.getString(getResources().getString(R.string.param_mail));
        String sDescripcion  = parametros.getString(getResources().getString(R.string.param_descripcion));

        TextView tvNombre       = (TextView) findViewById(R.id.tvNombre_confirmarContacto);
        TextView tvTelefono     = (TextView) findViewById(R.id.tvTelefono_confirmarContacto);
        TextView tvCorreo       = (TextView) findViewById(R.id.tvMail_confirmarContacto);
        TextView tvDescripcion  = (TextView) findViewById(R.id.tvDescripcion_confirmarContacto);

        tvNombre.setText(sNombre);
        tvTelefono.setText("Tel: " + sTelefono);
        tvCorreo.setText("E-mail: " + sCorreo);
        tvDescripcion.setText("Descripción: " + sDescripcion);
    }
}
