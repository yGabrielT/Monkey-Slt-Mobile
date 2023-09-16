package com.example.monkeysltmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    public static MediaPlayer mediaPlayer;

    public ImageButton play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.imageButtonPlay);


    }

    public void MusicaPlay (View view){
        /** Inicia musica e troca para imagem de pausa**/
        if(mediaPlayer == null ){
            mediaPlayer =  MediaPlayer.create(this,(R.raw.musicmonkey));

        }

        /** Caso esteja tocando uma musica e se clica o botão: pausa e troca imagem para o play
         * senão a toca **/
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
            play.setImageResource(R.drawable.img_play);
        }
        else{
            mediaPlayer.start();
            play.setImageResource(R.drawable.img_pause);
        }


        /** Quando a musica terminar para a musica e troca a imagem para o play**/
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mediaPlayer){
                mediaPlayer.stop();
                play.setImageResource(R.drawable.img_play);
            }
        });


    }
    public void MusicaParar(View view){
        mediaPlayer.stop();
        play.setImageResource(R.drawable.img_play);
        mediaPlayer =  MediaPlayer.create(this,(R.raw.music_outer));

    }

    public void IrPlanetas (View view){
        Intent intent1 = new Intent(this, TelaPlanetas.class);
        startActivity(intent1);

    }
    public void IrPersonagem (View view){
        Intent intent2 = new Intent(this, TelaPersonagem.class);
        startActivity(intent2);

    }


    public void IrMapa (View view){
        Uri linkmapa = Uri.parse("https://maps.app.goo.gl/zrn8BsXfUbCPwz926");
        Intent it = new Intent(Intent.ACTION_VIEW,linkmapa);
        startActivity(it);
    }

    public void IrEmail (View view){
        String uriText = "mailto:contact@monkeysltcorp.com" +"?subject=" + URLEncoder.encode("assunto do email") +"&body=" + URLEncoder.encode("texto do email");
        Uri uri= Uri.parse(uriText);
        //inicia a Intent
        Intent it = new Intent(Intent.ACTION_SENDTO);
        // Define o conteúdo
        it.setData(uri);
        // Inicia a activity para enviar o email
        startActivity(Intent.createChooser(it, "Enviar Email"));
    }




}
