package com.alissonrafael.curso.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView voltar, imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagem = (ImageView) findViewById(R.id.imagem);
        voltar = (ImageView) findViewById(R.id.voltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultadoActivity.this, MainActivity.class));
            }
        });

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            String opcaoEscolinha = extra.getString("opcao");

            if (opcaoEscolinha.equals("cara")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            } else {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

    }
}
