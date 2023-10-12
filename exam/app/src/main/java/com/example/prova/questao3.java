package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questao3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3);
    }

    public void btnalternativa_a3(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b2", 0);

        Intent intent = new Intent(getApplicationContext(), questao4.class);
        intent.putExtra("bt_alternativa_d3", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_b3(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b2", 0);

        Intent intent = new Intent(getApplicationContext(), questao4.class);
        intent.putExtra("bt_alternativa_d3", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_c3(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b2", 0);

        Intent intent = new Intent(getApplicationContext(), questao4.class);
        intent.putExtra("bt_alternativa_d3", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_d3(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b2", 0);

        Intent intent = new Intent(getApplicationContext(), questao4.class);
        intent.putExtra("bt_alternativa_d3", valor1 + 1);
        startActivity(intent);
    }
}