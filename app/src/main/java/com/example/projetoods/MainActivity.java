package com.example.projetoods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSair,BtnOds1,BtnOds2,BtnOds3,BtnOds4,BtnOds5,BtnOds6,BtnOds7,BtnOds8,BtnOds9,BtnOds10,
            BtnOds11,BtnOds12,BtnOds13,BtnOds14,BtnOds15,BtnOds16,BtnOds17,BtnVoltar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // BOTAO ODS 1
        BtnOds1 = findViewById(R.id.BtnOds1);
        BtnOds1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS1 = new Intent( getApplicationContext(), ODS1Activity.class);
                startActivity(telaODS1);
            }
        });

        // BOTAO 0DS 2
        BtnOds2 = findViewById(R.id.BtnOds2);
        BtnOds2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS2 = new Intent( getApplicationContext(), ODS2Activity.class);
                startActivity(telaODS2);
            }
        });
        //BOTAO ODS 3
        BtnOds3 = findViewById(R.id.BtnOds3);
        BtnOds3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS3 = new Intent( getApplicationContext(), ODS3Activity.class);
                startActivity(telaODS3);
            }
        });
        //BOTAO ODS 4
        BtnOds4 = findViewById(R.id.BtnOds4);
        BtnOds4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS4 = new Intent( getApplicationContext(), ODS4Activity.class);
                startActivity(telaODS4);
            }
        });
        //BOTAO ODS 5
        BtnOds5 = findViewById(R.id.BtnOds5);
        BtnOds5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS5 = new Intent( getApplicationContext(), ODS5Activity.class);
                startActivity(telaODS5);
            }
        });
        // BOTAO ODS 6
        BtnOds6 = findViewById(R.id.BtnOds6);
        BtnOds6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS6 = new Intent( getApplicationContext(), ODS6Activity.class);
                startActivity(telaODS6);
            }
        });
        //BOTAO ODS 7
        BtnOds7 = findViewById(R.id.BtnOds7);
        BtnOds7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS7 = new Intent( getApplicationContext(), ODS7Activity.class);
                startActivity(telaODS7);
            }
        });
        //BOTAO ODS 8
        BtnOds8 = findViewById(R.id.BtnOds8);
        BtnOds8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS8 = new Intent( getApplicationContext(), ODS8Activity.class);
                startActivity(telaODS8);
            }
        });
        //BOTAO ODS 9
        BtnOds9 = findViewById(R.id.BtnOds9);
        BtnOds9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS9 = new Intent( getApplicationContext(), ODS9Activity.class);
                startActivity(telaODS9);
            }
        });
        //BOTAO ODS 10
        BtnOds10 = findViewById(R.id.BtnOds10);
        BtnOds10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS10 = new Intent( getApplicationContext(), ODS10Activity.class);
                startActivity(telaODS10);
            }
        });
        //BOTAO ODS 11
        BtnOds11 = findViewById(R.id.BtnOds11);
        BtnOds11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS11 = new Intent( getApplicationContext(), ODS11Activity.class);
                startActivity(telaODS11);
            }
        });
        //BOTAO ODS 12
        BtnOds12 = findViewById(R.id.BtnOds12);
        BtnOds12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS12 = new Intent( getApplicationContext(), ODS12Activity.class);
                startActivity(telaODS12);
            }
        });
        //BOTAO ODS 13
        BtnOds13 = findViewById(R.id.BtnOds13);
        BtnOds13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS13 = new Intent( getApplicationContext(), ODS13Activity.class);
                startActivity(telaODS13);
            }
        });
        //BOTAO ODS 14
        BtnOds14 = findViewById(R.id.BtnOds14);
        BtnOds14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS14 = new Intent( getApplicationContext(), ODS14Activity.class);
                startActivity(telaODS14);
            }
        });
        //BOTAO ODS 15
        BtnOds15 = findViewById(R.id.BtnOds15);
        BtnOds15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS15 = new Intent( getApplicationContext(), ODS15Activity.class);
                startActivity(telaODS15);
            }
        });
        //BOTAO ODS 16
        BtnOds16 = findViewById(R.id.BtnOds16);
        BtnOds16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS16 = new Intent( getApplicationContext(), ODS16Activity.class);
                startActivity(telaODS16);
            }
        });
        //BOTAO ODS 17
        BtnOds17 = findViewById(R.id.BtnOds17);
        BtnOds17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS17 = new Intent( getApplicationContext(), ODS17Activity.class);
                startActivity(telaODS17);
            }
        });
    }
}