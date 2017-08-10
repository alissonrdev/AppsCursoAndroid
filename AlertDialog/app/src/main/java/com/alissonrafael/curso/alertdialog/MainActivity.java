package com.alissonrafael.curso.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               alertDialog = new AlertDialog.Builder(getApplicationContext());
                alertDialog.setTitle("Alert Dialog");
                alertDialog.setMessage("Isto é um Alert Dialog");
                alertDialog.setPositiveButton("POSITIVO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "BOTÃO POSITIVO PRESSIONADO!", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.setNegativeButton("NEGATIVO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "BOTAO NEGATIVO PRESSIONADO!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
