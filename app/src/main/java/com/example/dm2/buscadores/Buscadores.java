package com.example.dm2.buscadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Buscadores extends AppCompatActivity implements View.OnClickListener{

    private ImageView imagenB;
    private Button google;
    private Button bing;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscadores);

        imagenB=(ImageView)findViewById(R.id.imgBuscador);
        google=(Button)findViewById(R.id.btngoogle);
        bing=(Button) findViewById(R.id.btnbing);

        //primera forma de programar un boton
        google.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imagenB.setImageResource(R.drawable.google);
            }
        });
        //segunda forma de programar un boton,la clase debe implementar "View.OnClickListener" y tner el metodo onClick
        bing.setOnClickListener(this);
    }
    //segunda forma de programar un boton
    public void onClick(View v){

        imagenB.setImageResource(R.drawable.bing);
    }
    //tercera forma de programar un boton
    public void yahoo(View v){

        imagenB.setImageResource(R.drawable.yahoo);
    }



}
