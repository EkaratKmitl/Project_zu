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

public class sum1 extends AppCompatActivity {
    String  data_sound;
    EditText edtInput;
    TextView txtInput;
    Button btnClick_next1;

    int X;
    String Y;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sum1);

//********Play sound ส่งค่ามา ************************************************************************

        /* PREF_NAME ตัวแปรอ้างอิ้งจากหน้าที่ส่งมา */
        SharedPreferences sp = getSharedPreferences("Data_compare_sound1", Context.MODE_PRIVATE);
        /* Data_compare_row ส่งค่าไปเก็บใน sound_1  */
        int sound_1 = sp.getInt("Data_compare_sound1", X);

        //ตรวจสอบค่าที่ส่งมาจา play_sound_XX.java ให้แสดงออกหน้าจอ
        TextView a = (TextView) findViewById(R.id.show_sound01);
        a.setText("data sound = " + Integer.valueOf(sound_1));


//********Insert text  ส่งค่ามา **********************************************************************

        /* PREF_NAME ตัวแปรอ้างอิ้งจากหน้าที่ส่งมา */
        SharedPreferences sk = getSharedPreferences("Data_compare_text1", Context.MODE_PRIVATE);
        /* Data_compare_row ส่งค่าไปเก็บใน sound_1  */
        String text_1 = sk.getString("Data_compare_text1", Y);


        //ตรวจสอบค่าที่ส่งมาจา play_sound_XX.java ให้แสดงออกหน้าจอ
        TextView b = (TextView) findViewById(R.id.show_text01);
        b.setText("data text = " + String.valueOf(text_1));

//**************************************************************************************************

        btnClick_next1 = (Button) findViewById(R.id.bt_sum1);
        btnClick_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(sum1.this, countdown_lv2.class);
                startActivity(z);
            }
        });// SetOnclick


    }// onCreate
}//Main Class