package com.example.projetoods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ODS12Activity extends AppCompatActivity {
    Button BtnVoltar12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods12);

        BtnVoltar12 = findViewById(R.id.BtnVoltar12);
        BtnVoltar12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TelaPrincipal = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(TelaPrincipal);
            }
        });
    }
}