package com.alissonrafael.curso.atmconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView menuEmpresa, menuContato, menuServico, menuClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuEmpresa = (ImageView) findViewById(R.id.menuEmpresa);
        menuContato = (ImageView) findViewById(R.id.menuContato);
        menuServico = (ImageView) findViewById(R.id.menuServico);
        menuClientes = (ImageView) findViewById(R.id.menuClientes);

        menuEmpresa.setOnClickListener(this);
        menuContato.setOnClickListener(this);
        menuServico.setOnClickListener(this);
        menuClientes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.menuEmpresa:
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
                break;
            case R.id.menuServico:
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
                break;
            case R.id.menuClientes:
                startActivity(new Intent(MainActivity.this, ClienteActivity.class));
                break;
            case R.id.menuContato:
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
                break;
        }
    }
}
