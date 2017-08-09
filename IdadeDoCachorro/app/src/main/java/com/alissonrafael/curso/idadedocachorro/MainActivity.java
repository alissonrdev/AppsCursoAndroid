package com.alissonrafael.curso.idadedocachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editIdade;
    private TextView idade;
    private Button btnDescobrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editIdade = (EditText) findViewById(R.id.editIdade);
        idade = (TextView) findViewById(R.id.txtIdade);
        btnDescobrir = (Button) findViewById(R.id.btnDescobrir);


        btnDescobrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textoDigitado = editIdade.getText().toString();

                if (textoDigitado.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Digite a idade...", Toast.LENGTH_SHORT).show();
                } else {

                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;
                    idade.setText("A idade do cachorro em anos humanos é: " + resultadoFinal + " anos!");
                }


            }
        });
    }
}
