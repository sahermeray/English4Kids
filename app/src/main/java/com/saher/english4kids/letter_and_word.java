package com.saher.english4kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class letter_and_word extends AppCompatActivity {
    ImageView fiv,siv,thiv;
    TextView ftv,stv,thtv;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_and_word);
        fiv=findViewById(R.id.first_iv);
        siv=findViewById(R.id.second_iv);
        thiv=findViewById(R.id.third_iv);
        ftv=findViewById(R.id.first_tv);
        stv=findViewById(R.id.second_tv);
        thtv=findViewById(R.id.third_tv);
        Intent x=getIntent();
        final int firstsound=x.getIntExtra("firstSound",0);
        final int secondsound=x.getIntExtra("secondSound",0);
        final int thirdsound=x.getIntExtra("thirdSound",0);
        int firstIV=x.getIntExtra("firstImage",0);
        int secondIV=x.getIntExtra("secondImage",0);
        int thirdIV=x.getIntExtra("thirdImage",0);
        String firstTV=x.getStringExtra("firstText");
        String secondTV=x.getStringExtra("secondText");
        String thirdTV=x.getStringExtra("thirdText");
        fiv.setImageResource(firstIV);
        siv.setImageResource(secondIV);
        thiv.setImageResource(thirdIV);
        ftv.setText(firstTV);
        stv.setText(secondTV);
        thtv.setText(thirdTV);
        ftv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releasemp();
                mp=MediaPlayer.create(getBaseContext(),firstsound);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releasemp();
                    }
                });
            }
        });
        stv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releasemp();
                mp=MediaPlayer.create(getBaseContext(),secondsound);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releasemp();
                    }
                });
            }
        });
        thtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releasemp();
                mp=MediaPlayer.create(getBaseContext(),thirdsound);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releasemp();
                    }
                });
            }
        });

    }
    private void releasemp(){
        if(mp!=null){
            mp.release();
            mp=null;
        }
    }
}