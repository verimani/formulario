package com.veronicamachado.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    TextView tvnombre, tvfechan, tvtelefono, tvmail, tvdescripcion;
    Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        tvnombre      = (TextView)findViewById(R.id.tvnombre);
        tvfechan      = (TextView)findViewById(R.id.tvfechanac);
        tvtelefono    = (TextView)findViewById(R.id.tvtelefono);
        tvmail        = (TextView)findViewById(R.id.tvemail);
        tvdescripcion = (TextView)findViewById(R.id.tvdescr);
        btnok         = (Button) findViewById(R.id.btnOk);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MostrarDatos.this, MainActivity.class);
                startActivity(intent);

            }
        });
        mostarDatos();
    }

    private void mostarDatos() {
        Bundle ingreso = this.getIntent().getExtras();

        String nombre  = ingreso.getString("name");
        String fechan  = ingreso.getString("fechan");
        String tel  = ingreso.getString("tel");
        String correo  = ingreso.getString("correo");
        String descri  = ingreso.getString("descri");

        tvnombre.setText(nombre);
        tvfechan.setText(fechan);
        tvtelefono.setText(tel);
        tvmail.setText(correo);
        tvdescripcion.setText(descri);




    }
}