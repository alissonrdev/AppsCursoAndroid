package com.alissonrafael.cursoudemy.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoFrase;
    private Button btnNovaFrase;

    private String[] frases = {"Ninguém tem o poder de dar dois passos de cada vez; você só pode dar um passo de cada vez.",
            "Dizem: pense duas vezes antes de saltar. Eu digo: salta primeiro e depois pense tudo o que quiser.",
            "Se você quer ver a verdade, então não mantenha nenhuma opinião a favor ou contra.",
            "Somos o que pensamos. Tudo o que somos surge com nossos pensamentos. Com nossos pensamentos, fazemos o nosso mundo.",
            "Sua tarefa é descobrir o seu trabalho e, então, com todo o coração, dedicar-se a ele.",
            "É a própria mente de um homem, e não seu inimigo ou adversário, que o seduz para caminhos maléficos.",
            "Somos feitos de carne, mas temos de viver como se fôssemos de ferro.",
            "Nós poderíamos ser muito melhores se não quiséssemos ser tão bons."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoFrase  = (TextView) findViewById(R.id.textoFrase);
        btnNovaFrase  = (Button) findViewById(R.id.btnNovaFrase);

        btnNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt( frases.length );

                textoFrase.setText(frases[ numeroAleatorio ]);
            }
        });

    }
}
