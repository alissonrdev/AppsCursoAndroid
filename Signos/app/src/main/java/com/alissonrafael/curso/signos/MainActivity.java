package com.alissonrafael.curso.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"};

    private String[] perfis = {"A força do instinto, que abre caminho entre as dificuldades, movida apenas pela vontade de se impor.",
            "Quer uma vida simples, que pode chegar ao conformismo, pois é um signo um tanto preguiçoso na hora de mudar.",
            "Aqui, temos a conclusão do primeiro processo trifásico da ordem universal. Em Gêmeos, tudo já foi manifestado e trata-se agora de espalhar a notícia de que algo existe.", "Instável como as marés, relacionada a este signo, que está sob a regência da Lua, o astro regente, Câncer se move de acordo com seu instinto de proteção, seu sentimento e suas emoções.",
            "Desafiar o ambiente externo, que pode ser hostil e inóspito é algo que precisa ser feito com coragem, focalizando apenas o desejo de ser, a despeito de todo o movimento em contrário que possa existir.", "Virgem possui um temperamento instável e nervoso, pois a própria condição de estar atento ao que precisa ser reformulado e reciclado provoca a perpétua sensação de que algo pode ser diferente.",
            "Libra simboliza o contato com o outro por meio da fluidez, da justiça e do equilíbrio nas relações, em que mais vale a harmonia do relacionamento em si, do que os dotes da pessoa com a qual se relaciona.",
            "A posse e a propriedade - do corpo, do afeto, dos bens - se manifesta com toda a intensidade neste signo que busca o propósito. Escorpião quer saber o final de tudo que foi feito até Libra",
            "De todos os signos do Zodíaco, Sagitário é o que mais deseja alargar a visão, sair do mundo fechado e intenso do Escorpião, para ganhar não mais o bairro nem a cidade, mas outro país, outra cultura", "Como todo signo social (acima do horizonte), este é um signo mais devotado ao mundo das relações humanas do que ao mundo interno.", "Como todo signo social (acima do horizonte), este é um signo mais devotado ao mundo das relações humanas do que ao mundo interno.", "No mar de emoções instáveis como o oceano, governado por Peixes, está este signo que acompanha todos os que estão se despedindo de um ciclo, daí sua relação com os internatos."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adaptadorSignos = new ArrayAdapter<String>(
                getApplicationContext(),
                R.layout.lista,
                R.id.textView,
                signos
        );

        listView.setAdapter(adaptadorSignos);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int posicao = i;
                Toast.makeText(MainActivity.this, perfis[posicao], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
