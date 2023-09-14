package com.example.outerwildsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Planeta_vale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
    }

    public void IrVoltarPlanetas (View view){
        Intent intent = new Intent(this, TelaPlanetas.class);
        startActivity(intent);

    }
}