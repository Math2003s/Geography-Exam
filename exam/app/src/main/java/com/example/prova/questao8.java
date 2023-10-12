package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questao8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao8);
    }

    public void btnalternativa_a8(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_d7", 0);

        Intent intent = new Intent(getApplicationContext(), questao9.class);
        intent.putExtra("bt_alternativa_a8", valor1 + 1);
        startActivity(intent);
    }

    public void btnalternativa_b8(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_d7", 0);

        Intent intent = new Intent(getApplicationContext(), questao9.class);
        intent.putExtra("bt_alternativa_a8", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_c8(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_d7", 0);

        Intent intent = new Intent(getApplicationContext(), questao9.class);
        intent.putExtra("bt_alternativa_a8", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_d8(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_d7", 0);

        Intent intent = new Intent(getApplicationContext(), questao9.class);
        intent.putExtra("bt_alternativa_a8", valor1 + 0);
        startActivity(intent);
    }
}