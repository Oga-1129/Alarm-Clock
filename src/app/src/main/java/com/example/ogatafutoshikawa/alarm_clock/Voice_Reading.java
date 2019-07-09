package com.example.ogatafutoshikawa.alarm_clock;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;

public class Voice_Reading extends AppCompatActivity
                            implements TextToSpeech.OnInitListener {

    /**TextToSpeechのインスタンス化*/
    private TextToSpeech tts;

    /**ログを表示させるフィールド*/
    private static final String TAG = "TestTTS";

    /**「おはようございます」の文字列データを格納するフィールド*/
    String v_data;

    /**天気の情報の文字列データを格納するフィールド*/
    String weather;

    /**最高気温の情報の文字列データを格納するフィールド*/
    String max;

    /**最低気温の情報の文字列データを格納するフィールド*/
    String min;

    /**
     * Voice_Readingアクティビティの画面を構成するメソッド
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather);

        // TTS インスタンス生成
        tts = new TextToSpeech(this, this);

        Intent intent = getIntent();
        weather = intent.getStringExtra(Weather_Activity.WEATHER_DATA);
        max = intent.getStringExtra(Weather_Activity.MAX_DATA);
        min = intent.getStringExtra(Weather_Activity.MIN_DATA);
        v_data = "おはようございます";

        TextView tv1 = findViewById(R.id.weather);
        tv1.setText(weather);
        TextView tv2 = findViewById(R.id.max);
        tv2.setText(max);
        TextView tv3 = findViewById(R.id.min);
        tv3.setText(min);
    }

    /**
     * TextToSpeechの初期化
     * @param status
     */
    @Override
    public void onInit(int status) {
        // TTS初期化
        if (TextToSpeech.SUCCESS == status) {
            Log.d(TAG, "initialized");
        } else {
            Log.e(TAG, "failed to initialize");
        }
        speechText(v_data);

        HandlerThread handlerThread = new HandlerThread("foo");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // ここに３秒後に実行したい処理
                speechText(weather);
            }
        }, 3000);


        new Handler(handlerThread.getLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // ここに３秒後に実行したい処理
                speechText(max);
            }
        }, 8000);
        new Handler(handlerThread.getLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // ここに３秒後に実行したい処理
                speechText(min);
            }
        }, 15000);
    }

    /**TTSのリソースを解放するメソッド*/
    private void shutDown() {
        if (null != tts) {
            // to release the resource of TextToSpeech
            tts.shutdown();
        }
    }

    /**
     * 文字列を読むメソッド
     * @param v_data
     */
    private void speechText(String v_data) {

        if (0 < v_data.length()) {
            if (tts.isSpeaking()) {
                tts.stop();
                return;
            }
            setSpeechRate();
            setSpeechPitch();

            if (Build.VERSION.SDK_INT >= 21) {
                // SDK 21 以上
                tts.speak(v_data, TextToSpeech.QUEUE_FLUSH, null, "messageID");
            } else {
                // tts.speak(text, TextToSpeech.QUEUE_FLUSH, null) に
                // KEY_PARAM_UTTERANCE_ID を HasMap で設定
                HashMap<String, String> map;
                map = new HashMap<>();
                map.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "messageID");
                tts.speak(v_data, TextToSpeech.QUEUE_FLUSH, map);
            }

            setTtsListener();
        }
    }

    /**読み上げのスピードを設定するメソッド*/
    // 読み上げのスピード
    private void setSpeechRate() {
        if (null != tts) {
            tts.setSpeechRate((float) 1.0);
        }
    }

    /**読み上げのピッチを設定をするメソッド*/
    private void setSpeechPitch() {
        if (null != tts) {
            tts.setPitch((float) 1.0);
        }
    }

    /**読み上げの始まりと終わりを取得するメソッド*/
    private void setTtsListener() {
        int listenerResult =
                tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                    @Override
                    public void onDone(String utteranceId) {
                        Log.d(TAG, "progress on Done " + utteranceId);
                    }

                    @Override
                    public void onError(String utteranceId) {
                        Log.d(TAG, "progress on Error " + utteranceId);
                    }

                    @Override
                    public void onStart(String utteranceId) {
                        Log.d(TAG, "progress on Start " + utteranceId);
                    }
                });

        if (listenerResult != TextToSpeech.SUCCESS) {
            Log.e(TAG, "failed to add utterance progress listener");
        }
    }

    /**
     *
     */
    protected void onDestroy() {
        super.onDestroy();
        shutDown();
    }
}
