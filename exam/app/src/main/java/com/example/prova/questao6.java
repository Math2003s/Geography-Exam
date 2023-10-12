package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questao6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao6);
    }

    public void btnalternativa_a6(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_c5", 0);

        Intent intent = new Intent(getApplicationContext(), questao7.class);
        intent.putExtra("bt_alternativa_c6", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_b6(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_c5", 0);

        Intent intent = new Intent(getApplicationContext(), questao7.class);
        intent.putExtra("bt_alternativa_c6", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_c6(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_c5", 0);

        Intent intent = new Intent(getApplicationContext(), questao7.class);
        intent.putExtra("bt_alternativa_c6", valor1 + 1);
        startActivity(intent);
    }

    public void btnalternativa_d6(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_c5", 0);

        Intent intent = new Intent(getApplicationContext(), questao7.class);
        intent.putExtra("bt_alternativa_c6", valor1 + 0);
        startActivity(intent);
    }
}