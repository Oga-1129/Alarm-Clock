package com.example.ogatafutoshikawa.alarm_clock;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class Alarm_Service extends Service {
    private static final String TAG = Alarm_Service.class.getSimpleName();

    /**
     *
     * @param intent
     * @return
     */
    public IBinder onBind(Intent intent){
        return null;
    }

    /**
     *
     */
    public void onCreate(){
        Thread thread = new Thread(null, task,"AlarmService");
        thread.start();
        Log.v(TAG,"スレッド開始");
    }


    //アラーム用のサービス
    Runnable task = new Runnable() {
        /**
         *
         */
        @Override
        public void run() {
            //アラームを受け取るActivityを指定
            Intent messageBroadcast = new Intent();

            //ここでActionをセットする
            messageBroadcast.setAction("MyAlarmAction");

            //レシーバーへ渡す
            sendBroadcast(messageBroadcast);

            //役目を終えたサービスを止める
            Alarm_Service.this.stopSelf();
        }
    };
}
