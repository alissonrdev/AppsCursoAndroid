package com.alissonrafael.curso.listview;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    
    // LISTA COM AS FRASES DE FILIPE RET
    private String[] itens = {"Muitos vivem pra deixar bens, mas eu vivo pra deixar saudades.",
    "É necessário saber ficar sozinho, em silêncio, mergulhado em si. É fundamental estar satisfeito com a própria companhia.",
    "Se o mundo não te entendeu, cê não se fez entender.", "Pra ser bom é preciso sentir raiva da mediocridade.", "Nem que nada sei eu sei, Sócrates errou.",
     "Seu respeito já não basta, só seu medo bastará", "Só quem se arrisca merece viver o extraordinário.", "Sábios dizem foda-se."
    ,"Eles querem o bem, eu quero a verdade.", "Os loucos românticos sempre riem por último.", "Apesar se tudo vou viver sorrindo.", "Vivo de pressa, em outro nível. Só o impossível me interresa."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String> (
                getApplicationContext(),
                R.layout.lista,
                R.id.textView,
                itens
        );

        listView.setAdapter(adaptador);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int codigoPosicao = i;
                String clicado = listView.getItemAtPosition(codigoPosicao).toString();

                // COPIA A FRASE PRESSIONADA
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("frase", clicado);
                clipboard.setPrimaryClip(clip);

                // MOSTRA UM TOAST
                Toast.makeText(MainActivity.this, "Frase copiada com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
