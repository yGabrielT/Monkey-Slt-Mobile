package com.example.monkeysltmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class TelaPersonagem extends AppCompatActivity {

    ScrollView char1;
    ScrollView char2;
    ScrollView char3;
    ScrollView char4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_personagem);
        char1 = findViewById(R.id.char1scroll);
        char2 = findViewById(R.id.char2scroll);
        char3 = findViewById(R.id.char3scroll);
        char4 = findViewById(R.id.char4scroll);
    }

    public void IrVoltar (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }



    public void MostrarLay1(View view){
        char1.setVisibility(View.VISIBLE);
        char2.setVisibility(View.INVISIBLE);
        char3.setVisibility(View.INVISIBLE);
        char4.setVisibility(View.INVISIBLE);
    }

    public void MostrarLay2(View view){
        char1.setVisibility(View.INVISIBLE);
        char2.setVisibility(View.VISIBLE);
        char3.setVisibility(View.INVISIBLE);
        char4.setVisibility(View.INVISIBLE);
    }

    public void MostrarLay3(View view){
        char1.setVisibility(View.INVISIBLE);
        char2.setVisibility(View.INVISIBLE);
        char3.setVisibility(View.VISIBLE);
        char4.setVisibility(View.INVISIBLE);
    }

    public void MostrarLay4(View view){
        char1.setVisibility(View.INVISIBLE);
        char2.setVisibility(View.INVISIBLE);
        char3.setVisibility(View.INVISIBLE);
        char4.setVisibility(View.VISIBLE);
    }
}