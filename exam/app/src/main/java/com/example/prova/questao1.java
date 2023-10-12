package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class questao1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1);
    }

    public void btnalternativa_a(View view) {
        Intent intent = new Intent(getApplicationContext(), questao2.class);
        intent.putExtra("bt_alternativa_a", 1);
        startActivity(intent);
        }

    public void btnalternativa_b(View view) {
        Intent intent = new Intent(getApplicationContext(), questao2.class);
        startActivity(intent);
    }

    public void btnalternativa_c(View view) {
        Intent intent = new Intent(getApplicationContext(), questao2.class);
        startActivity(intent);
    }

    public void btnalternativa_d(View view) {
        Intent intent = new Intent(getApplicationContext(), questao2.class);
        startActivity(intent);
    }
}