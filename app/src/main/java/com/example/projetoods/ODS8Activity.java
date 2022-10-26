package com.example.projetoods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ODS8Activity extends AppCompatActivity {
    Button BtnVoltar8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods8);

        BtnVoltar8 = findViewById(R.id.BtnVoltar8);
        BtnVoltar8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TelaPrincipal = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(TelaPrincipal);
            }
        });
    }
}