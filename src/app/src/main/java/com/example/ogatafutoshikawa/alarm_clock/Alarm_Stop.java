package com.example.ogatafutoshikawa.alarm_clock;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Alarm_Stop extends AppCompatActivity
                        implements View.OnClickListener{

    private MediaPlayer mp;

    /**
     * Alarm_Stopアクティビティの画面を構成するメソッド
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stop_alarm);

        Button btnStop = this.findViewById(R.id.stop);
        btnStop.setOnClickListener(this);
    }

    /**
     *
     */
    @Override
    public void onStart(){
        super.onStart();
        if(mp == null) {
            mp = MediaPlayer.create(this, R.raw.alarm);
        }
        mp.start();
    }


    /**
     *
     */
    @Override
    public void onDestroy(){
        super.onDestroy();
        stopAndRelease();
    }

    /**
     *
     */
    private  void stopAndRelease(){
        if (mp != null) {
            mp.stop();
            mp.release();
        }
    }

    /**
     *
     */
    @Override
    protected void onResume(){
        super.onResume();
    }

    /**
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Alarm_Stop.this, Weather_Activity.class);
        stopAndRelease();
        startActivity(intent);
    }
}
