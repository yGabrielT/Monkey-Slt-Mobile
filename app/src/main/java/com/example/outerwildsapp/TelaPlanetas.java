package com.example.outerwildsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TelaPlanetas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_planetas);
    }

    public void IrAbrolho (View view){
        Intent intent = new Intent(this, Planeta_abrolho.class);
        startActivity(intent);

    }

    public void IrProfundezas (View view){
        Intent intent = new Intent(this, Planeta_profundezas.class);
        startActivity(intent);

    }

    public void IrVale (View view){
        Intent intent = new Intent(this, Planeta_vale.class);
        startActivity(intent);

    }

    public void IrRecanto (View view){
        Intent intent = new Intent(this, Planeta_recanto.class);
        startActivity(intent);

    }

    public void Voltar (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}