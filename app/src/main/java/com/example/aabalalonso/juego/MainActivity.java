package com.example.aabalalonso.juego;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button valor1 = (Button) findViewById(R.id.BOTON1);
        Button valor2 = (Button) findViewById(R.id.BOTON2);
        Button valor3 = (Button) findViewById(R.id.BOTON3);
        Button valor4 = (Button) findViewById(R.id.BOTON4);
        Button valor5 = (Button) findViewById(R.id.BOTON5);
        Button valor6 = (Button) findViewById(R.id.BOTON6);
        Button valor7 = (Button) findViewById(R.id.BOTON7);
        Button valor8 = (Button) findViewById(R.id.BOTON8);
        Button valor9 = (Button) findViewById(R.id.BOTON9);

        int v1=1;
        int v2=2;
        int v3=3;
        int v4=4;
        int v5=5;
        int v6=6;
        int v7=7;
        int v8=8;
        int v9=9;



    }

    public void presion(View v) {

        Button botonPresionado = (Button) v;




    }
}
