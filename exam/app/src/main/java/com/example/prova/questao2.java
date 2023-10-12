package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class questao2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2);
    }

    public void btnalternativa_a2(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_a", 0);

        Intent intent = new Intent(getApplicationContext(), questao3.class);
        intent.putExtra("bt_alternativa_b2", valor1 + 0);
        startActivity(intent);
    }
    public void btnalternativa_b2(View view) {

        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_a", 0);

        Intent intent = new Intent(getApplicationContext(), questao3.class);
        intent.putExtra("bt_alternativa_b2", valor1 + 1);
        startActivity(intent);
    }

    public void btnalternativa_c2(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_a", 0);

        Intent intent = new Intent(getApplicationContext(), questao3.class);
        intent.putExtra("bt_alternativa_b2", valor1 + 0);
        startActivity(intent);
    }

    public void btnalternativa_d2(View view) {
        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_a", 0);

        Intent intent = new Intent(getApplicationContext(), questao3.class);
        intent.putExtra("bt_alternativa_b2", valor1 + 0);
        startActivity(intent);
    }


}