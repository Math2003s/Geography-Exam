package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent it=getIntent();
        int valor1 = it.getIntExtra("bt_alternativa_b10", 0);

        if (valor1 >= 6) {
            TextView seila = findViewById(R.id.textViewresultado);
            seila.setText("VOCÊ ACERTOU " + valor1 + " QUESTÕES." );

            TextView seila2 = findViewById(R.id.textViewresultado1);
            seila2.setText("PARABÉNS! VOCÊ ESTÁ APROVADO!" );

            TextView seila3 = findViewById(R.id.mensagem);
            seila3.setText("Por enquanto..." );
        }else{
            TextView seila = findViewById(R.id.textViewresultado);
            seila.setText("VOCÊ ACERTOU " + valor1 + " QUESTÕES." );

            TextView seila2 = findViewById(R.id.textViewresultado1);
            seila2.setText("VOCÊ FOI REPROVADO!" );

            TextView seila3 = findViewById(R.id.mensagem);
            seila3.setText("eu avisei." );
        }
    }

    public void fecharclickbtn(View view) {
        finishAffinity();
    }
}