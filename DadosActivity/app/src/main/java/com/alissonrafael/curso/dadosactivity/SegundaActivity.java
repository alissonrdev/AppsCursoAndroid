package com.alissonrafael.curso.dadosactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textView = (TextView)  findViewById(R.id.textView);

        // BUNDLE PARA PEGAR AS EXTRAS DA ACTIVITY ANTERIOR
        Bundle extra = getIntent().getExtras();

        // VERIFICA SE O EXTRA ESTÁ VAZIO
        if (extra != null) {
            // STRING PARA PEGAR A STRING PASSADA PELA ACTIVITY
            String textoPassado = extra.getString("nome");
            textView.setText(textoPassado);
        }

    }
}
