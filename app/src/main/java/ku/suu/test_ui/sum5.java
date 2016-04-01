package ku.suu.test_ui;


import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Objects;

public class sum5 extends AppCompatActivity {
    String data_sound;
    EditText edtInput;
    TextView txtInput;
    Button btnClick_next;

    int sound_1;
    int a;
    int b;
    int intValue;
    int X;



    int x;
    char text_1;

    String Y;
    private GoogleApiClient client;

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sum5);
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
      int x = text_1;
                         /* ImageView image = ( ImageView ) this.findViewById ( R.id.image_A_left );
                            image.setImageResource ( R.drawable.button_start );  */

//********Play sound ส่งค่ามา ******************************************************************************************

        /* PREF_NAME = Data_compare_sound xx  ตัวแปรอ้างอิ้งจากหน้าที่ส่งมา */
        SharedPreferences sa = getSharedPreferences("Data_compare_sound1", Context.MODE_PRIVATE);
        int sound_1 = sa.getInt("Data_compare_sound1", X);

        SharedPreferences sb = getSharedPreferences("Data_compare_sound2", Context.MODE_PRIVATE);
        int sound_2 = sb.getInt("Data_compare_sound2", X);

        SharedPreferences sc = getSharedPreferences("Data_compare_sound3", Context.MODE_PRIVATE);
        int sound_3 = sc.getInt("Data_compare_sound3", X);

        SharedPreferences sd = getSharedPreferences("Data_compare_sound4", Context.MODE_PRIVATE);
        int sound_4 = sd.getInt("Data_compare_sound4", X);

        SharedPreferences se = getSharedPreferences("Data_compare_sound5", Context.MODE_PRIVATE);
        int sound_5 = se.getInt("Data_compare_sound5", X);

//________________ตรวจสอบค่าที่ส่งมาจา play_sound_XX.java ให้แสดงออกหน้าจอ________________________________

        TextView a = (TextView) findViewById(R.id.show_sound1);
        a.setText("data sound = " + String.valueOf(sound_1));

        TextView b = (TextView) findViewById(R.id.show_sound2);
        b.setText("data sound = " + String.valueOf(sound_2));

        TextView c = (TextView) findViewById(R.id.show_sound3);
        c.setText("data sound = " + String.valueOf(sound_3));

        TextView d = (TextView) findViewById(R.id.show_sound4);
        d.setText("data sound = " + String.valueOf(sound_4));

        TextView e = (TextView) findViewById(R.id.show_sound5);
        e.setText("data sound = " + String.valueOf(sound_5));

//********Insert text  ส่งค่ามา ****************************************************************************************

        /* PREF_NAME ตัวแปรอ้างอิ้งจากหน้าที่ส่งมา */
        SharedPreferences sh = getSharedPreferences("Data_compare_text1", Context.MODE_PRIVATE);
        String text_1 = sh.getString("Data_compare_text1", Y);

        SharedPreferences si = getSharedPreferences("Data_compare_text2", Context.MODE_PRIVATE);
        String text_2 = si.getString("Data_compare_text2", Y);

        SharedPreferences sj = getSharedPreferences("Data_compare_text3", Context.MODE_PRIVATE);
        String text_3 = sj.getString("Data_compare_text3", Y);

        SharedPreferences sk = getSharedPreferences("Data_compare_text4", Context.MODE_PRIVATE);
        String text_4 = sk.getString("Data_compare_text4", Y);

        SharedPreferences sl = getSharedPreferences("Data_compare_text5", Context.MODE_PRIVATE);
        String text_5 = sl.getString("Data_compare_text5", Y);


//________________ตรวจสอบค่าที่ส่งมาจา Isert Text_XX.java ให้แสดงออกหน้าจอ________________________________

        //ตรวจสอบค่าที่ส่งมาจา play_sound_XX.java ให้แสดงออกหน้าจอ
        TextView o = (TextView) findViewById(R.id.show_text1);
        o.setText("data text = " + String.valueOf(x));

        TextView p = (TextView) findViewById(R.id.show_text2);
        p.setText("data text = " + String.valueOf(text_2));

        TextView q = (TextView) findViewById(R.id.show_text3);
        q.setText("data text = " + String.valueOf(text_3));

        TextView r = (TextView) findViewById(R.id.show_text4);
        r.setText("data text = " + String.valueOf(text_4));

        TextView s = (TextView) findViewById(R.id.show_text5);
        s.setText("data text = " + String.valueOf(text_5));

//***************************************************************************************************************

        btnClick_next = (Button) findViewById(R.id.bt_sum5);
        btnClick_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(sum5.this, MainActivity.class);
                startActivity(z);
            }
        });// SetOnclick



    }// onCreate
}//Main Class