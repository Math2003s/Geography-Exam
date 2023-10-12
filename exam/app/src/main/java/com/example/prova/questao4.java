package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questao4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4);
    }

    public void btnalternativa_a4(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_d3", 0);

        Intent intent = new Intent(getApplicationContext(), questao5.class);
        intent.putExtra("bt_alternativa_b4", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_b4(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_d3", 0);

        Intent intent = new Intent(getApplicationContext(), questao5.class);
        intent.putExtra("bt_alternativa_b4", valor1 + 1);
        startActivity(intent);
    }

    public void btnalternativa_c4(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_d3", 0);

        Intent intent = new Intent(getApplicationContext(), questao5.class);
        intent.putExtra("bt_alternativa_b4", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_d4(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_d3", 0);

        Intent intent = new Intent(getApplicationContext(), questao5.class);
        intent.putExtra("bt_alternativa_b4", valor1 + 0);
        startActivity(intent);
    }
}