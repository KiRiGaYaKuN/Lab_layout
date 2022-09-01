package com.example.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio3 extends AppCompatActivity {

    Button ejemplo4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        ejemplo4 = (Button) findViewById(R.id.eje4);

        ejemplo4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(Ejercicio3.this, Ejercicio4.class);
                startActivity(i);
            }
        });
    }
}