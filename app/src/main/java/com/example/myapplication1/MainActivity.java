package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText nombre, email, telefono, descripcion;
    Button boton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.EtNombre);
        email = findViewById(R.id.EtEmail);
        telefono = findViewById(R.id.EtTelefono);
        descripcion = findViewById(R.id.EtDescripcion);

        boton = findViewById(R.id.boton);
        textView = findViewById(R.id.textView);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent boton = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(boton);

                String etNombre = nombre.getText().toString().trim();
                String etEmail = email.getText().toString().trim();
                String etTelefono = telefono.getText().toString().trim();
                String etDescripcion = descripcion.getText().toString().trim();


                //if (!etName.isEmpty() && !etEmail.isEmpty() && !etName.isPhone() && !etDescription.isEmpty()){
                textView.setText(etNombre + "\n" + etEmail + "\n" + etTelefono + "\n" + etDescripcion);
                //}else{
                //Toast.makeText( context: MainActivity2.this, text: "")
            }
        });
    }
}
