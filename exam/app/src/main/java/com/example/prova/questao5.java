package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questao5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao5);
    }

    public void btnalternativa_a5(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b4", 0);

        Intent intent = new Intent(getApplicationContext(), questao6.class);
        intent.putExtra("bt_alternativa_c5", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_b5(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b4", 0);

        Intent intent = new Intent(getApplicationContext(), questao6.class);
        intent.putExtra("bt_alternativa_c5", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_c5(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b4", 0);

        Intent intent = new Intent(getApplicationContext(), questao6.class);
        intent.putExtra("bt_alternativa_c5", valor1 + 1);
        startActivity(intent);
    }

    public void btnalternativa_d5(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b4", 0);

        Intent intent = new Intent(getApplicationContext(), questao6.class);
        intent.putExtra("bt_alternativa_c5", valor1 + 0);
        startActivity(intent);
    }
}