package com.example.projetoods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSair,BtnOds1,BtnOds2,BtnOds3,BtnOds4;

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
    }
}