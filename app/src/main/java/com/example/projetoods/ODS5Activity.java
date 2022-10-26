package com.example.projetoods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ODS5Activity extends AppCompatActivity {

    Button BtnVoltar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods5);

        BtnVoltar5 = findViewById(R.id.BtnVoltar5);
        BtnVoltar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TelaPrincipal = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(TelaPrincipal);
            }
        });
    }
}