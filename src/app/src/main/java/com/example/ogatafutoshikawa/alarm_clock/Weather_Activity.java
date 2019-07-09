package com.example.ogatafutoshikawa.alarm_clock;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.net.MalformedURLException;
import java.net.URL;

public class Weather_Activity extends AppCompatActivity {

    /**デバイスに保存していたデータを格納するフィールド*/
    String URL = "";

    /**非同期処理で受け取った天気のデータを格納するフィールド*/
    String voice_we = "";

    /**非同期処理で受け取った最高気温のデータを格納するフィールド*/
    String voice_max = "";

    /**非同期処理で受け取った最低気温のデータを格納するフィールド*/
    String voice_min = "";

    /**天気の非同期処理のキー*/
    public static final String WEATHER_DATA= "weather";

    /**最高気温の非同期処理のキー*/
    public static final String MAX_DATA= "max";

    /**最低気温の非同期処理のキー*/
    public static final String MIN_DATA= "min";

    /**
     * Weather_Activityの画面を構成するメソッド
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load);

        SharedPreferences data = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
        URL = data.getString("Save","失敗");

        final Intent intent = new Intent(this,Voice_Reading.class);

        AsyncHttpWeather A_Weather_Class = new AsyncHttpWeather();
        A_Weather_Class.setOnCallBack1(new AsyncHttpWeather.CallBackTask1() {

            @Override
            public void CallBack1(String result) {
                super.CallBack1(result);
                // ※１
                // resultにはdoInBackgroundの返り値が入ります。
                // ここからAsyncTask処理後の処理を記述します。
                TextView tv = findViewById(R.id.load_w);
                tv.setText("更新しました");
                voice_we = result;
                intent.putExtra(WEATHER_DATA,voice_we);

            }
        });


        AsyncHttpMax A_Max_Class = new AsyncHttpMax();
        A_Max_Class.setOnCallBack2(new AsyncHttpMax.CallBackTask2() {

            @Override
            public void CallBack2(String result) {
                super.CallBack2(result);
                // ※１
                // resultにはdoInBackgroundの返り値が入ります。
                // ここからAsyncTask処理後の処理を記述します。
                if(result != null) {
                    TextView tv = findViewById(R.id.load_max);
                    tv.setText("更新しました");
                    voice_max = result;
                }else{
                    TextView tv = findViewById(R.id.load_max);
                    tv.setText("データがありません");
                }
                intent.putExtra(MAX_DATA,voice_max);
            }
        });


        AsyncHttpMin A_Min_Class = new AsyncHttpMin();
        A_Min_Class.setOnCallBack3(new AsyncHttpMin.CallBackTask3() {

            @Override
            public void CallBack3(String result) {
                super.CallBack3(result);
                // ※１
                // resultにはdoInBackgroundの返り値が入ります。
                // ここからAsyncTask処理後の処理を記述します。
                if(result != null) {
                    TextView tv = findViewById(R.id.load_min);
                    tv.setText("更新しました");
                    voice_min = result;
                }else{
                    TextView tv = findViewById(R.id.load_min);
                    tv.setText("データがありません");
                }
                intent.putExtra(MIN_DATA,voice_min);
                startActivity(intent);
            }
        });

        try {
            A_Weather_Class.execute(new URL("http://weather.livedoor.com/forecast/webservice/json/v1?city=" + URL));
            A_Max_Class.execute(new URL("http://weather.livedoor.com/forecast/webservice/json/v1?city=" + URL));
            A_Min_Class.execute(new URL("http://weather.livedoor.com/forecast/webservice/json/v1?city=" + URL));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
