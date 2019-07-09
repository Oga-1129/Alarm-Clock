package com.example.ogatafutoshikawa.alarm_clock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Prefecture_Activity extends AppCompatActivity
                                    implements View.OnClickListener{

    /**
     * Prefecture_Activityの画面を構成するメソッド
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prefecture);

        Button btnHokkaido = this.findViewById(R.id.Hokkaido);
        Button btnAomori = this.findViewById(R.id.Aomori);
        Button btnIwate = this.findViewById(R.id.Iwate);
        Button btnMiyagi = this.findViewById(R.id.Miyagi);
        Button btnAkita = this.findViewById(R.id.Akita);
        Button btnYamagata = this.findViewById(R.id.Yamagata);
        Button btnFukushima = this.findViewById(R.id.Fukushima);
        Button btnTokyo = this.findViewById(R.id.Tokyo);
        Button btnKanagawa = this.findViewById(R.id.Kanagawa);
        Button btnSaitama = this.findViewById(R.id.Saitama);
        Button btnChiba = this.findViewById(R.id.Chiba);
        Button btnIbaraki = this.findViewById(R.id.Ibaraki);
        Button btnTochigi = this.findViewById(R.id.Tochigi);
        Button btnGunma = this.findViewById(R.id.Gunma);
        Button btnYamanashi = this.findViewById(R.id.Yamanashi);
        Button btnNigata = this.findViewById(R.id.Nigata);
        Button btnNagano = this.findViewById(R.id.Nagano);
        Button btnToyama = this.findViewById(R.id.Toyama);
        Button btnIshikawa = this.findViewById(R.id.Ishikawa);
        Button btnFukui = this.findViewById(R.id.Fukui);
        Button btnAichi = this.findViewById(R.id.Aichi);
        Button btnGifu = this.findViewById(R.id.Gifu);
        Button btnShizuoka = this.findViewById(R.id.Shizuoka);
        Button btnMie = this.findViewById(R.id.Mie);
        Button btnOsaka = this.findViewById(R.id.Osaka);
        Button btnHyogo = this.findViewById(R.id.Hyogo);
        Button btnKyoto= this.findViewById(R.id.Kyoto);
        Button btnShiga = this.findViewById(R.id.Shiga);
        Button btnNara = this.findViewById(R.id.Nara);
        Button btnWakayama = this.findViewById(R.id.Wakayama);
        Button btnTotori = this.findViewById(R.id.Totori);
        Button btnShimane = this.findViewById(R.id.Shimane);
        Button btnOkayama = this.findViewById(R.id.Okayama);
        Button btnHiroshima = this.findViewById(R.id.Hiroshima);
        Button btnYamaguchi = this.findViewById(R.id.Yamaguchi);
        Button btnTokushima = this.findViewById(R.id.Tokushima);
        Button btnKagawa = this.findViewById(R.id.Kagawa);
        Button btnEhime = this.findViewById(R.id.Ehime);
        Button btnKouchi = this.findViewById(R.id.Kouchi);
        Button btnFukuoka = this.findViewById(R.id.Fukuoka);
        Button btnOita = this.findViewById(R.id.Oita);
        Button btnNagasaki = this.findViewById(R.id.Nagasaki);
        Button btnSaga = this.findViewById(R.id.Saga);
        Button btnKumamoto = this.findViewById(R.id.Kumamoto);
        Button btnMiyazaki = this.findViewById(R.id.Miyazaki);
        Button btnKagoshima = this.findViewById(R.id.Kagoshima);
        Button btnOkinawa = this.findViewById(R.id.Okinawa);



        btnHokkaido.setOnClickListener(this);
        btnAomori.setOnClickListener(this);
        btnIwate.setOnClickListener(this);
        btnMiyagi.setOnClickListener(this);
        btnAkita.setOnClickListener(this);
        btnYamagata.setOnClickListener(this);
        btnFukushima.setOnClickListener(this);
        btnTokyo.setOnClickListener(this);
        btnKanagawa.setOnClickListener(this);
        btnSaitama.setOnClickListener(this);
        btnChiba.setOnClickListener(this);
        btnIbaraki.setOnClickListener(this);
        btnTochigi.setOnClickListener(this);
        btnGunma.setOnClickListener(this);
        btnYamanashi.setOnClickListener(this);
        btnNigata.setOnClickListener(this);
        btnNagano.setOnClickListener(this);
        btnToyama.setOnClickListener(this);
        btnIshikawa.setOnClickListener(this);
        btnFukui.setOnClickListener(this);
        btnAichi.setOnClickListener(this);
        btnGifu.setOnClickListener(this);
        btnShizuoka.setOnClickListener(this);
        btnMie.setOnClickListener(this);
        btnOsaka.setOnClickListener(this);
        btnHyogo.setOnClickListener(this);
        btnKyoto.setOnClickListener(this);
        btnShiga.setOnClickListener(this);
        btnNara.setOnClickListener(this);
        btnWakayama.setOnClickListener(this);
        btnTotori.setOnClickListener(this);
        btnShimane.setOnClickListener(this);
        btnOkayama.setOnClickListener(this);
        btnHiroshima.setOnClickListener(this);
        btnYamaguchi.setOnClickListener(this);
        btnTokushima.setOnClickListener(this);
        btnKagawa.setOnClickListener(this);
        btnEhime.setOnClickListener(this);
        btnKouchi.setOnClickListener(this);
        btnFukuoka.setOnClickListener(this);
        btnOita.setOnClickListener(this);
        btnNagasaki.setOnClickListener(this);
        btnSaga.setOnClickListener(this);
        btnKumamoto.setOnClickListener(this);
        btnMiyazaki.setOnClickListener(this);
        btnKagoshima.setOnClickListener(this);
        btnOkinawa.setOnClickListener(this);

    }

    /**
     * クリックイベントのメソッド
     * @param v
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        switch(v.getId()){
            case R.id.Hokkaido:
                bundle.putString("prefecture","北海道");
                bundle.putString("pre_key","01");
                bundle.putInt("pre_num",1);
                break;




            case R.id.Aomori:
                bundle.putString("prefecture","青森県");
                bundle.putString("pre_key","02");
                bundle.putInt("pre_num",2);
                break;

            case R.id.Iwate:
                bundle.putString("prefecture","岩手県");
                bundle.putString("pre_key","03");
                bundle.putInt("pre_num",3);
                break;

            case R.id.Miyagi:
                bundle.putString("prefecture","宮城県");
                bundle.putString("pre_key","04");
                bundle.putInt("pre_num",4);
                break;

            case R.id.Akita:
                bundle.putString("prefecture","秋田県");
                bundle.putString("pre_key","05");
                bundle.putInt("pre_num",5);
                break;

            case R.id.Yamagata:
                bundle.putString("prefecture","山形県");
                bundle.putString("pre_key","06");
                bundle.putInt("pre_num",6);
                break;

            case R.id.Fukushima:
                bundle.putString("prefecture","福島県");
                bundle.putString("pre_key","07");
                bundle.putInt("pre_num",7);
                break;




            case R.id.Tokyo:
                bundle.putString("prefecture","東京都");
                bundle.putString("pre_key","13");
                bundle.putInt("pre_num",8);
                break;

            case R.id.Kanagawa:
                bundle.putString("prefecture","神奈川県");
                bundle.putString("pre_key","14");
                bundle.putInt("pre_num",9);
                break;

            case R.id.Saitama:
                bundle.putString("prefecture","埼玉県");
                bundle.putString("pre_key","11");
                bundle.putInt("pre_num",10);
                break;

            case R.id.Chiba:
                bundle.putString("prefecture","千葉県");
                bundle.putString("pre_key","12");
                bundle.putInt("pre_num",11);
                break;

            case R.id.Ibaraki:
                bundle.putString("prefecture","茨城県");
                bundle.putString("pre_key","08");
                bundle.putInt("pre_num",12);
                break;

            case R.id.Tochigi:
                bundle.putString("prefecture","栃木県");
                bundle.putString("pre_key","09");
                bundle.putInt("pre_num",13);
                break;

            case R.id.Gunma:
                bundle.putString("prefecture","群馬県");
                bundle.putString("pre_key","10");
                bundle.putInt("prenum",14);
                break;

            case R.id.Yamanashi:
                bundle.putString("prefecture","山梨県");
                bundle.putString("pre_key","19");
                bundle.putInt("pre_num",15);
                break;







            case R.id.Nigata:
                bundle.putString("prefecture","新潟県");
                bundle.putString("pre_key","15");
                bundle.putInt("pre_num",16);
                break;

            case R.id.Nagano:
                bundle.putString("prefecture","長野県");
                bundle.putString("pre_key","20");
                bundle.putInt("pre_num",17);
                break;

            case R.id.Toyama:
                bundle.putString("prefecture","富山県");
                bundle.putString("pre_key","16");
                bundle.putInt("pre_num",18);
                break;

            case R.id.Ishikawa:
                bundle.putString("prefecture","石川県");
                bundle.putString("pre_key","17");
                bundle.putInt("pre_num",19);
                break;

            case R.id.Fukui:
                bundle.putString("prefecture","福井県");
                bundle.putString("pre_key","18");
                bundle.putInt("pre_num",20);
                break;






            case R.id.Aichi:
                bundle.putString("prefecture","愛知県");
                bundle.putString("pre_key","23");
                bundle.putInt("pre_num",21);
                break;

            case R.id.Gifu:
                bundle.putString("prefecture","岐阜県");
                bundle.putString("pre_key","21");
                bundle.putInt("pre_num",22);
                break;

            case R.id.Shizuoka:
                bundle.putString("prefecture","静岡県");
                bundle.putString("pre_key","22");
                bundle.putInt("pre_num",23);
                break;

            case R.id.Mie:
                bundle.putString("prefecture","三重県");
                bundle.putString("pre_key","24");
                bundle.putInt("pre_num",24);
                break;






            case R.id.Osaka:
                bundle.putString("prefecture","大阪府");
                bundle.putString("pre_key","27");
                bundle.putInt("pre_num",25);
                break;

            case R.id.Hyogo:
                bundle.putString("prefecture","兵庫県");
                bundle.putString("pre_key","28");
                bundle.putInt("pre_num",26);
                break;

            case R.id.Kyoto:
                bundle.putString("prefecture","京都府");
                bundle.putString("pre_key","26");
                bundle.putInt("pre_num",27);
                break;

            case R.id.Shiga:
                bundle.putString("prefecture","滋賀県");
                bundle.putString("pre_key","25");
                bundle.putInt("pre_num",28);
                break;

            case R.id.Nara:
                bundle.putString("prefecture","奈良県");
                bundle.putString("pre_key","29");
                bundle.putInt("pre_num",29);
                break;

            case R.id.Wakayama:
                bundle.putString("prefecture","和歌山県");
                bundle.putString("pre_key","30");
                bundle.putInt("pre_num",30);
                break;






            case R.id.Totori:
                bundle.putString("prefecture","鳥取県");
                bundle.putString("pre_key","31");
                bundle.putInt("pre_num",31);
                break;

            case R.id.Shimane:
                bundle.putString("prefecture","島根県");
                bundle.putString("pre_key","32");
                bundle.putInt("pre_num",32);
                break;

            case R.id.Okayama:
                bundle.putString("prefecture","岡山県");
                bundle.putString("pre_key","33");
                bundle.putInt("pre_num",33);
                break;

            case R.id.Hiroshima:
                bundle.putString("prefecture","広島県");
                bundle.putString("pre_key","34");
                bundle.putInt("pre_num",34);
                break;

            case R.id.Yamaguchi:
                bundle.putString("prefecture","山口県");
                bundle.putString("pre_key","35");
                bundle.putInt("pre_num",35);
                break;




            case R.id.Tokushima:
                bundle.putString("prefecture","徳島県");
                bundle.putString("pre_key","36");
                bundle.putInt("pre_num",36);
                break;

            case R.id.Kagawa:
                bundle.putString("prefecture","香川県");
                bundle.putString("pre_key","37");
                bundle.putInt("pre_num",37);
                break;

            case R.id.Ehime:
                bundle.putString("prefecture","愛媛県");
                bundle.putString("pre_key","38");
                bundle.putInt("pre_num",38);
                break;

            case R.id.Kouchi:
                bundle.putString("prefecture","高知県");
                bundle.putString("pre_key","39");
                bundle.putInt("pre_num",39);
                break;




            case R.id.Fukuoka:
                bundle.putString("prefecture","福岡県");
                bundle.putString("pre_key","40");
                bundle.putInt("pre_num",40);
                break;

            case R.id.Oita:
                bundle.putString("prefecture","大分県");
                bundle.putString("pre_key","44");
                bundle.putInt("pre_num",41);
                break;

            case R.id.Nagasaki:
                bundle.putString("prefecture","長崎県");
                bundle.putString("pre_key","42");
                bundle.putInt("pre_num",42);
                break;

            case R.id.Saga:
                bundle.putString("prefecture","佐賀県");
                bundle.putString("pre_key","41");
                bundle.putInt("pre_num",43);
                break;

            case R.id.Kumamoto:
                bundle.putString("prefecture","熊本県");
                bundle.putString("pre_key","43");
                bundle.putInt("pre_num",44);
                break;

            case R.id.Miyazaki:
                bundle.putString("prefecture","宮崎県");
                bundle.putString("pre_key","45");
                bundle.putInt("pre_num",45);
                break;

            case R.id.Kagoshima:
                bundle.putString("prefecture","鹿児島県");
                bundle.putString("pre_key","46");
                bundle.putInt("pre_num",46);
                break;




            case R.id.Okinawa:
                bundle.putString("prefecture","沖縄県");
                bundle.putString("pre_key","47");
                bundle.putInt("pre_num",47);
                break;

        }
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        finish();
    }
}
