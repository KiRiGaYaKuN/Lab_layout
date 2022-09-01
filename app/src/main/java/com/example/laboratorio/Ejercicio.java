package com.example.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio extends AppCompatActivity {

    Button ejemplo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        ejemplo2 = (Button) findViewById(R.id.eje2);

        ejemplo2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(Ejercicio.this, Ejercicio2.class);
                startActivity(i);
            }
        });
    }
}