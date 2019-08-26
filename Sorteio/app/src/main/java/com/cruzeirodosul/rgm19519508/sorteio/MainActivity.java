package com.cruzeirodosul.rgm19519508.sorteio;

import androidx.appcompat.app.AppCompatActivity;

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

        int x= new Random().nextInt(11);
        resultado.setText("O numero sorteado foi : " + x);
    }
}
