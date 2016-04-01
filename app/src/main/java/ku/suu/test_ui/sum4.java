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

public class sum4 extends AppCompatActivity {
    String data_sound;
    EditText edtInput;
    TextView txtInput;
    Button btnClick_next;

    int X;
    String Y;
    private GoogleApiClient client;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sum4);

//********Play sound ส่งค่ามา ************************************************************************

        /* PREF_NAME ตัวแปรอ้างอิ้งจากหน้าที่ส่งมา */
        SharedPreferences sp = getSharedPreferences("Data_compare_sound4", Context.MODE_PRIVATE);
        /* Data_compare_row ส่งค่าไปเก็บใน sound_1  */
        int sound_4 = sp.getInt("Data_compare_sound4", X);

        //ตรวจสอบค่าที่ส่งมาจา play_sound_XX.java ให้แสดงออกหน้าจอ
        TextView a = (TextView) findViewById(R.id.show_sound04);
        a.setText("data sound = " + String.valueOf(sound_4));


//********Insert text  ส่งค่ามา **********************************************************************

        /* PREF_NAME ตัวแปรอ้างอิ้งจากหน้าที่ส่งมา */
        SharedPreferences sk = getSharedPreferences("Data_compare_text4", Context.MODE_PRIVATE);
        /* Data_compare_row ส่งค่าไปเก็บใน sound_1  */
        String text_4 = sk.getString("Data_compare_text4", Y);


        //ตรวจสอบค่าที่ส่งมาจา play_sound_XX.java ให้แสดงออกหน้าจอ
        TextView b = (TextView) findViewById(R.id.show_text04);
        b.setText("data text = " + String.valueOf(text_4));

//**************************************************************************************************

        btnClick_next = (Button) findViewById(R.id.bt_sum4);
        btnClick_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(sum4.this, countdown_lv5.class);
                startActivity(z);
            }
        });// SetOnclick


    }// onCreate
}//Main Class
