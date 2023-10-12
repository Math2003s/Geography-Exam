package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questao7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao7);
    }

    public void btnalternativa_a7(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_c6", 0);

        Intent intent = new Intent(getApplicationContext(), questao8.class);
        intent.putExtra("bt_alternativa_d7", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_b7(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_c6", 0);

        Intent intent = new Intent(getApplicationContext(), questao8.class);
        intent.putExtra("bt_alternativa_d7", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_c7(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_c6", 0);

        Intent intent = new Intent(getApplicationContext(), questao8.class);
        intent.putExtra("bt_alternativa_d7", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_d7(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_c6", 0);

        Intent intent = new Intent(getApplicationContext(), questao8.class);
        intent.putExtra("bt_alternativa_d7", valor1 + 1);
        startActivity(intent);
    }
}