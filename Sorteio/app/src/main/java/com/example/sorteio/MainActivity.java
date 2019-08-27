package com.example.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void sorteiaNumero(View view){
        TextView resultado = findViewById(R.id.txtSorteio);

        String vetor []= {"ILHA DE CACHORROS","TULLY","ANIQUILAÇÃO","INFILTRADO NA KLAN", "VINGADORES: GUERRA INFINITA", "ARÁBIA", "ROMA", "OS INCRÍVEIS 2", "BENZINHO", "MAMMA MIA! LÁ VAMOS NÓS DE NOVO"};
        int x= new Random().nextInt(10);
        resultado.setText("Filme sorteado \n " + vetor[x].toString());
    }
}
