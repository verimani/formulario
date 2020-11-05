package com.veronicamachado.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.DatePicker;



public class MainActivity extends AppCompatActivity {
    EditText nombre, fechanac, telefono, email, descrip;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre   = (EditText)findViewById(R.id.editnombre);
        fechanac = (EditText)findViewById(R.id.editfechanac);
        telefono = (EditText)findViewById(R.id.edittelefono);
        email    = (EditText)findViewById(R.id.editemail);
        descrip  = (EditText)findViewById(R.id.editdescr);
        siguiente = (Button) findViewById(R.id.btnBoton);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name   = nombre.getText().toString();
                String fechan = fechanac.getText().toString();
                String tel    = telefono.getText().toString();
                String correo = email.getText().toString();
                String descri = descrip.getText().toString();


                Intent i = new Intent(MainActivity.this, MostrarDatos.class);
                i.putExtra("name", name);
                i.putExtra("fechan",fechan);
                i.putExtra("tel", tel);
                i.putExtra("correo",correo);
                i.putExtra("descri", descri);
                startActivity(i);
            }
        });
    }
}