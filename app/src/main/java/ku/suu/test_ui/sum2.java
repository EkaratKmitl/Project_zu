package ku.suu.test_ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;

public class sum2 extends AppCompatActivity {
    String data_sound;
    EditText edtInput;
    TextView txtInput;
    Button btnClick_next2;

    int X;
    String Y;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sum2);

//********Play sound ส่งค่ามา ************************************************************************

        /* PREF_NAME ตัวแปรอ้างอิ้งจากหน้าที่ส่งมา */
        SharedPreferences sp = getSharedPreferences("Data_compare_sound2", Context.MODE_PRIVATE);
        /* Data_compare_row ส่งค่าไปเก็บใน sound_1  */
        int sound_2 = sp.getInt("Data_compare_sound2", X);

        //ตรวจสอบค่าที่ส่งมาจา play_sound_XX.java ให้แสดงออกหน้าจอ
        TextView b = (TextView) findViewById(R.id.show_sound02);
        b.setText("data sound = " + Integer.valueOf(sound_2));


//********Insert text  ส่งค่ามา **********************************************************************

        /* PREF_NAME ตัวแปรอ้างอิ้งจากหน้าที่ส่งมา */
        SharedPreferences sk = getSharedPreferences("Data_compare_text2", Context.MODE_PRIVATE);
        /* Data_compare_row ส่งค่าไปเก็บใน sound_1  */
        String text_2 = sk.getString("Data_compare_text2", Y);


        //ตรวจสอบค่าที่ส่งมาจา play_sound_XX.java ให้แสดงออกหน้าจอ
        TextView a = (TextView) findViewById(R.id.show_text02);
        a.setText("data text = " + String.valueOf(text_2));

//**************************************************************************************************

        btnClick_next2 = (Button) findViewById(R.id.bt_sum2);
        btnClick_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(sum2.this, countdown_lv3.class);
                startActivity(z);
            }
        });// SetOnclick


    }// onCreate
}//Main Class