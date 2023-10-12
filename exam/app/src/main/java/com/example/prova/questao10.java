package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questao10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao10);
    }

    public void btnalternativa_a10(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b9", 0);

        Intent intent = new Intent(getApplicationContext(), resultado.class);
        intent.putExtra("bt_alternativa_b10", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_b10(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b9", 0);

        Intent intent = new Intent(getApplicationContext(), resultado.class);
        intent.putExtra("bt_alternativa_b10", valor1 + 1);
        startActivity(intent);
    }

    public void btnalternativa_c10(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b9", 0);

        Intent intent = new Intent(getApplicationContext(), resultado.class);
        intent.putExtra("bt_alternativa_b10", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_d10(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b9", 0);

        Intent intent = new Intent(getApplicationContext(), resultado.class);
        intent.putExtra("bt_alternativa_b10", valor1 + 0);
        startActivity(intent);
    }
}