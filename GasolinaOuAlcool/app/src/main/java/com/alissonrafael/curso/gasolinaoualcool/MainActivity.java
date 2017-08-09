package com.alissonrafael.curso.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnVerificar;
    private EditText editAlcool, editGasolina;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = (EditText) findViewById(R.id.editAlcool);
        editGasolina = (EditText) findViewById(R.id.editGasolina);
        textoResultado = (TextView) findViewById(R.id.textoResultado);

        btnVerificar = (Button) findViewById(R.id.btnVerificar);
        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Recupera os valores digitados
                String textoAlcool = editAlcool.getText().toString();
                String textoGasolina = editGasolina.getText().toString();

                if (textoAlcool.isEmpty()) {
                    textoResultado.setText("Digite o valor do álcool...");
                } else if (textoGasolina.isEmpty()) {
                    textoResultado.setText("Digite o valor da gasolina...");
                } else {

                    // Converte os valores String para numeros
                    Double valorAlcool = Double.parseDouble(textoAlcool);
                    Double valorGasolina = Double.parseDouble(textoGasolina);

                    double resultadoFinal = valorAlcool / valorGasolina;

                    // Verifica é melhor usar álcool ou gasolina
                    if (resultadoFinal >= 0.7) {
                        textoResultado.setText("É melhor usar gasolina!");
                    } else {
                        textoResultado.setText("É melhor usar álcool!");
                    }

                }

            }
        });
    }
}
