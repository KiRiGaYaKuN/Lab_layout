package com.example.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio4 extends AppCompatActivity {

    Button ejemplo3;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        ejemplo3 = (Button) findViewById(R.id.atras);
        menu = (Button) findViewById(R.id.regreso);

        ejemplo3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(Ejercicio4.this, Ejercicio3.class);
                startActivity(i);
            }
        });

        menu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(Ejercicio4.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}