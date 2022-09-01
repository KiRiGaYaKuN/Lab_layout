package com.example.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button eje;
    Button email;
    Button produ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eje = (Button) findViewById(R.id.eje);
        email = (Button) findViewById(R.id.correo);
        produ = (Button) findViewById(R.id.producto);

        eje.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Ejercicio.class);
                startActivity(i);
            }
        });

        email.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Email.class);
                startActivity(i);
            }
        });

        produ.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Producto.class);
                startActivity(i);
            }
        });
    }
}