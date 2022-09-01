package com.example.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio2 extends AppCompatActivity {

    Button ejemplo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        ejemplo3 = (Button) findViewById(R.id.eje3);

        ejemplo3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(Ejercicio2.this, Ejercicio3.class);
                startActivity(i);
            }
        });
    }
}