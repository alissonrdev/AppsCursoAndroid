package com.alissonrafael.curso.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView jogar;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = (ImageView) findViewById(R.id.jogar);
        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // GERAR NUMERO ALEATÓRIO
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(2);

                // 0 = cara / 1 = coroa

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("opcao", opcao[numeroAleatorio] );
                startActivity(intent);
            }
        });
    }
}
