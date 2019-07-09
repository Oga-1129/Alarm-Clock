package com.example.ogatafutoshikawa.alarm_clock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class City_Activity extends AppCompatActivity
                            implements View.OnClickListener{
    /**選択した県の市の数を格納するフィールド*/
    int city_num;

    /**受け取った県の番号を格納するフィールド*/
    int num;

    /**市の名前を格納するフィールド*/
    String[] city_name = new String[17];

    /**
     * 画面を構成するメソッド
     * @param saveInstanceState
     */
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.city);

        Intent intent = getIntent();
        num = intent.getIntExtra(Main_Activity.PRE_NUM,0);

        if(num == 1){
            city_num = 16;

        }else if(num == 47){
            city_num = 7;

        }else if(num == 6 || num == 8 || num == 16|| num == 23 || num == 35|| num == 40||num == 41||num == 42||num == 44|| num ==45|| num == 46){
            city_num = 4;

        }else if(num == 2 || num == 3 || num == 7 || num == 10|| num == 11 || num == 17|| num == 32|| num == 38|| num == 39){
            city_num = 3;

        }else if( num == 4||num == 5 || num == 9 || num == 12|| num == 13|| num == 14|| num == 15|| num == 18|| num == 19|| num == 20||num == 21|| num == 22 ||num == 24|| num == 26|| num == 27||num == 28|| num == 29|| num == 30|| num == 31|| num == 33|| num ==34|| num == 36 || num == 43){
            city_num = 2;

        }else if(num == 25|| num == 37){
            city_num = 1;
        }

        switch (num){
            case  1:
                city_name[ 0] = "稚内市";
                city_name[ 1] = "旭川市";
                city_name[ 2] = "留萌市";
                city_name[ 3] = "札幌市";
                city_name[ 4] = "石見沢市";
                city_name[ 5] = "倶知安市";
                city_name[ 6] = "網走市";
                city_name[ 7] = "北見市";
                city_name[ 8] = "紋別市";
                city_name[ 9] = "根室市";
                city_name[10] = "釧路市";
                city_name[11] = "帯広市";
                city_name[12] = "室蘭市";
                city_name[13] = "浦河市";
                city_name[14] = "函館市";
                city_name[15] = "江差市";
                break;

            case  2:
                city_name[0] = "青森市";
                city_name[1] = "むつ市";
                city_name[2] = "八戸市";
                break;

            case  3:
                city_name[0] = "盛岡市";
                city_name[1] = "宮古市";
                city_name[2] = "大船渡市";
                break;

            case  4:
                city_name[0] = "仙台市";
                city_name[1] = "白石市";
                break;

            case  5:
                city_name[0] = "秋田市";
                city_name[1] = "横手市";
                break;

            case  6:
                city_name[0] = "山形市";
                city_name[1] = "米沢市";
                city_name[2] = "酒田市";
                city_name[3] = "新庄市";
                break;

            case  7:
                city_name[0] = "福島市";
                city_name[1] = "小名浜市";
                city_name[2] = "若松市";
                break;




            case  8:
                city_name[0] = "東京";
                city_name[1] = "大島市";
                city_name[2] = "八丈島市";
                city_name[3] = "父島市";
                break;

            case  9:
                city_name[0] = "横浜市";
                city_name[1] = "小田原市";
                break;

            case 10:
                city_name[0] = "さいたま市";
                city_name[1] = "熊谷市";
                city_name[2] = "秩父市";
                break;

            case 11:
                city_name[0] = "千葉市";
                city_name[1] = "銚子市";
                city_name[2] = "館山市";
                break;

            case 12:
                city_name[0] = "水戸市";
                city_name[1] = "土浦市";
                break;

            case 13:
                city_name[0] = "宇都宮市";
                city_name[1] = "大田原市";
                break;

            case 14:
                city_name[0] = "前橋市";
                city_name[1] = "みなかみ市";
                break;

            case 15:
                city_name[0] = "甲府市";
                city_name[1] = "河口古市";
                break;



            case 16:
                city_name[0] = "新潟市";
                city_name[1] = "長岡市";
                city_name[2] = "高田市";
                city_name[3] = "相川市";
                break;

            case 17:
                city_name[0] = "長野市";
                city_name[1] = "松本市";
                city_name[2] = "飯田市";
                break;

            case 18:
                city_name[0] = "富山市";
                city_name[1] = "伏木市";
                break;

            case 19:
                city_name[0] = "金沢市";
                city_name[1] = "輪島市";
                break;

            case 20:
                city_name[0] = "福井市";
                city_name[1] = "敦賀市";
                break;

            case 21:
                city_name[0] = "名古屋市";
                city_name[1] = "富橋市";
                break;

            case 22:
                city_name[0] = "岐阜市";
                city_name[1] = "高山市";
                break;

            case 23:
                city_name[0] = "静岡市";
                city_name[1] = "苗代市";
                city_name[2] = "三島市";
                city_name[3] = "浜松市";
                break;

            case 24:
                city_name[0] = "津市";
                city_name[1] = "尾鷲市";
                break;

            case 25:
                city_name[0] = "大阪市";
                break;

            case 26:
                city_name[0] = "神戸市";
                city_name[1] = "豊岡市";
                break;

            case 27:
                city_name[0] = "京都市";
                city_name[1] = "舞鶴市";
                break;

            case 28:
                city_name[0] = "大津市";
                city_name[1] = "彦根市";
                break;

            case 29:
                city_name[0] = "奈良市";
                city_name[1] = "風屋市";
                break;

            case 30:
                city_name[0] = "和歌山市";
                city_name[1] = "潮岬市";
                break;




            case 31:
                city_name[0] = "鳥取市";
                city_name[1] = "米子市";
                break;

            case 32:
                city_name[0] = "松江市";
                city_name[1] = "浜田市";
                city_name[2] = "西郷市";
                break;

            case 33:
                city_name[0] = "岡山市";
                city_name[1] = "津山市";
                break;

            case 34:
                city_name[0] = "広島市";
                city_name[1] = "庄原市";
                break;

            case 35:
                city_name[0] = "下関市";
                city_name[1] = "山口市";
                city_name[0] = "柳井市";
                city_name[1] = "萩市";
                break;




            case 36:
                city_name[0] = "徳島市";
                city_name[1] = "日和佐市";
                break;

            case 37:
                city_name[0] = "高松市";
                break;

            case 38:
                city_name[0] = "松山市";
                city_name[1] = "新居浜市";
                city_name[2] = "宇和島市";
                break;

            case 39:
                city_name[0] = "高知市";
                city_name[1] = "屋戸岬市";
                city_name[2] = "清水市";
                break;



            case 40:
                city_name[0] = "福岡市";
                city_name[1] = "八幡市";
                city_name[2] = "飯塚市";
                city_name[3] = "久留米市";
                break;

            case 41:
                city_name[0] = "大分市";
                city_name[1] = "中津市";
                city_name[2] = "日田市";
                city_name[3] = "佐伯市";
                break;

            case 42:
                city_name[0] = "長崎市";
                city_name[1] = "佐世保市";
                city_name[2] = "厳原市";
                city_name[3] = "福江市";
                break;

            case 43:
                city_name[0] = "佐賀市";
                city_name[1] = "伊万里市";
                break;

            case 44:
                city_name[0] = "熊本市";
                city_name[1] = "阿蘇乙姫市";
                city_name[2] = "牛深市";
                city_name[3] = "人吉市";
                break;

            case 45:
                city_name[0] = "宮崎市";
                city_name[1] = "延岡市";
                city_name[2] = "都城市";
                city_name[3] = "高千穂市";
                break;

            case 46:
                city_name[0] = "鹿児島市";
                city_name[1] = "鹿谷市";
                city_name[2] = "種子島市";
                city_name[3] = "名瀬市";
                break;



            case 47:
                city_name[0] = "那覇市";
                city_name[1] = "名護市";
                city_name[2] = "久米島市";
                city_name[3] = "南大東市";
                city_name[4] = "宮古島市";
                city_name[5] = "石垣島市";
                city_name[6] = "与那国島市";
                break;
        }

        Button city1 = this.findViewById(R.id.city1);
        Button city2 = this.findViewById(R.id.city2);
        Button city3 = this.findViewById(R.id.city3);
        Button city4 = this.findViewById(R.id.city4);
        Button city5 = this.findViewById(R.id.city5);
        Button city6 = this.findViewById(R.id.city6);
        Button city7 = this.findViewById(R.id.city7);
        Button city8 = this.findViewById(R.id.city8);
        Button city9 = this.findViewById(R.id.city9);
        Button city10 = this.findViewById(R.id.city10);
        Button city11 = this.findViewById(R.id.city11);
        Button city12 = this.findViewById(R.id.city12);
        Button city13 = this.findViewById(R.id.city13);
        Button city14 = this.findViewById(R.id.city14);
        Button city15 = this.findViewById(R.id.city15);
        Button city16 = this.findViewById(R.id.city16);

        city1.setOnClickListener(this);
        city2.setOnClickListener(this);
        city3.setOnClickListener(this);
        city4.setOnClickListener(this);
        city5.setOnClickListener(this);
        city6.setOnClickListener(this);
        city7.setOnClickListener(this);
        city8.setOnClickListener(this);
        city9.setOnClickListener(this);
        city10.setOnClickListener(this);
        city11.setOnClickListener(this);
        city12.setOnClickListener(this);
        city13.setOnClickListener(this);
        city14.setOnClickListener(this);
        city15.setOnClickListener(this);
        city16.setOnClickListener(this);

        City(city_name[0],1);
        City(city_name[1],2);
        City(city_name[2],3);
        City(city_name[3],4);
        City(city_name[4],5);
        City(city_name[5],6);
        City(city_name[6],7);
        City(city_name[7],8);
        City(city_name[8],9);
        City(city_name[9],10);
        City(city_name[10],11);
        City(city_name[11],12);
        City(city_name[12],13);
        City(city_name[13],14);
        City(city_name[14],15);
        City(city_name[15],16);
        City(city_name[16],17);






        switch (city_num) {
            case 0:

            case 1:
                city2.setVisibility(View.INVISIBLE);

            case 2:
                city3.setVisibility(View.INVISIBLE);

            case 3:
                city4.setVisibility(View.INVISIBLE);

            case 4:
                city5.setVisibility(View.INVISIBLE);

            case 5:
                city6.setVisibility(View.INVISIBLE);

            case 6:
                city7.setVisibility(View.INVISIBLE);

            case 7:
                city8.setVisibility(View.INVISIBLE);

            case 8:
                city9.setVisibility(View.INVISIBLE);

            case 9:
                city10.setVisibility(View.INVISIBLE);

            case 10:
                city11.setVisibility(View.INVISIBLE);

            case 11:
                city12.setVisibility(View.INVISIBLE);

            case 12:
                city13.setVisibility(View.INVISIBLE);

            case 13:
                city14.setVisibility(View.INVISIBLE);

            case 14:
                city15.setVisibility(View.INVISIBLE);

            case 15:
                city16.setVisibility(View.INVISIBLE);
        }
    }

    /**
     * Cityのリストを表示させるメソッド
     * @param str
     * @param num
     */
    public void City(String str, int num) {
        switch (num){
            case  1:
                TextView tv1 = findViewById(R.id.city1);
                tv1.setText(str);
                break;

            case  2:
                TextView tv2 = findViewById(R.id.city2);
                tv2.setText(str);
                break;

            case  3:
                TextView tv3 = findViewById(R.id.city3);
                tv3.setText(str);
                break;

            case  4:
                TextView tv4 = findViewById(R.id.city4);
                tv4.setText(str);
                break;

            case  5:
                TextView tv5 = findViewById(R.id.city5);
                tv5.setText(str);
                break;

            case  6:
                TextView tv6 = findViewById(R.id.city6);
                tv6.setText(str);
                break;

            case  7:
                TextView tv7 = findViewById(R.id.city7);
                tv7.setText(str);
                break;

            case  8:
                TextView tv8 = findViewById(R.id.city8);
                tv8.setText(str);
                break;

            case  9:
                TextView tv9 = findViewById(R.id.city9);
                tv9.setText(str);
                break;

            case 10:
                TextView tv10 = findViewById(R.id.city10);
                tv10.setText(str);
                break;

            case 11:
                TextView tv11 = findViewById(R.id.city11);
                tv11.setText(str);
                break;

            case 12:
                TextView tv12 = findViewById(R.id.city12);
                tv12.setText(str);
                break;

            case 13:
                TextView tv13 = findViewById(R.id.city13);
                tv13.setText(str);
                break;

            case 14:
                TextView tv14 = findViewById(R.id.city14);
                tv14.setText(str);
                break;

            case 15:
                TextView tv15 = findViewById(R.id.city15);
                tv15.setText(str);
                break;

            case 16:
                TextView tv16 = findViewById(R.id.city16);
                tv16.setText(str);
                break;
        }
    }

    /**
     * クリックイベントのメソッド
     * @param v
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();

        switch (v.getId()){
            case R.id.city1:
                bundle.putString("city",city_name[0]);
                if(num != 1 && num != 47) {
                    bundle.putString("city_key", "0010");
                }else if(num == 1){
                    bundle.putString("city_key", "1000");
                }else {
                    bundle.putString("city_key", "1010");
                }
                break;

            case R.id.city2:
                bundle.putString("city",city_name[1]);
                if(num != 1 && num != 47) {
                    bundle.putString("city_key", "0020");
                }else if(num == 1){
                    bundle.putString("city_key", "2010");
                } else {
                    bundle.putString("city_key", "1020");
                }
                break;

            case R.id.city3:
                bundle.putString("city",city_name[2]);
                if(num != 1 && num != 47) {
                    bundle.putString("city_key", "0030");
                }else if(num == 1){
                    bundle.putString("city_key", "2020");
                }else {
                    bundle.putString("city_key", "1030");
                }
                break;

            case R.id.city4:
                bundle.putString("city",city_name[3]);
                if(num != 1 && num != 47) {
                    bundle.putString("city_key", "0040");
                }else if(num == 1){
                    bundle.putString("city_key", "6010");
                }
                break;

            case R.id.city5:
                bundle.putString("city",city_name[4]);
                if(num == 1){
                    bundle.putString("city_key", "6020");
                }else if(num == 47){
                    bundle.putString("city_key", "2000");
                }
                break;

            case R.id.city6:
                bundle.putString("city",city_name[5]);
                if(num == 1){
                    bundle.putString("city_key", "6030");
                }else if(num == 47){
                    bundle.putString("city_key", "3000");
                }
                break;

            case R.id.city7:
                bundle.putString("city",city_name[6]);
                if(num == 1){
                    bundle.putString("city_key", "3010");
                }else if(num == 47){
                    bundle.putString("city_key", "4010");
                }
                break;

            case R.id.city8:
                bundle.putString("city",city_name[7]);
                if(num == 1){
                    bundle.putString("city_key", "3020");
                }else if(num == 47){
                    bundle.putString("city_key", "4020");
                }
                break;

            case R.id.city9:
                bundle.putString("city",city_name[8]);
                if(num == 1){
                    bundle.putString("city_key", "3030");
                }
                break;

            case R.id.city10:
                bundle.putString("city",city_name[9]);
                if(num == 1){
                    bundle.putString("city_key", "4010");
                }
                break;

            case R.id.city11:
                bundle.putString("city",city_name[10]);
                if(num == 1){
                    bundle.putString("city_key", "4020");
                }
                break;

            case R.id.city12:
                bundle.putString("city",city_name[11]);
                if(num == 1){
                    bundle.putString("city_key", "4030");
                }
                break;

            case R.id.city13:

                if(num == 1){
                    bundle.putString("city_key", "5010");
                }
                break;

            case R.id.city14:
                bundle.putString("city",city_name[13]);
                if(num == 1){
                    bundle.putString("city_key", "5020");
                }
                break;

            case R.id.city15:
                bundle.putString("city",city_name[14]);
                if(num == 1){
                    bundle.putString("city_key", "7010");
                }
                break;

            case R.id.city16:
                bundle.putString("city",city_name[15]);
                if(num == 1){
                    bundle.putString("city_key", "7020");
                }
                break;
        }
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        finish();
    }
}