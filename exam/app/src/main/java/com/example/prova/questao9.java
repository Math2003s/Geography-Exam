package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questao9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao9);
    }

    public void btnalternativa_a9(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_a8", 0);

        Intent intent = new Intent(getApplicationContext(), questao10.class);
        intent.putExtra("bt_alternativa_b9", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_b9(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_a8", 0);

        Intent intent = new Intent(getApplicationContext(), questao10.class);
        intent.putExtra("bt_alternativa_b9", valor1 + 1);
        startActivity(intent);
    }

    public void btnalternativa_c9(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_a8", 0);

        Intent intent = new Intent(getApplicationContext(), questao10.class);
        intent.putExtra("bt_alternativa_b9", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_d9(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_a8", 0);

        Intent intent = new Intent(getApplicationContext(), questao10.class);
        intent.putExtra("bt_alternativa_b9", valor1 + 0);
        startActivity(intent);
    }
}