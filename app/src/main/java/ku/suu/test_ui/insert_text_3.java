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
import android.widget.Toast;

public class insert_text_3 extends AppCompatActivity {


    private Button btnClickForInput3;
    private EditText edtInput;
    private TextView TextAnswer;
    int text;
    String name;
    String b;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_text_3);

        edtInput = (EditText) findViewById(R.id.editText3);//<---------รับค่าจาก_______ช่องว่าง
        TextAnswer = (TextView) findViewById(R.id.tt3);


        btnClickForInput3 = (Button) findViewById(R.id.bt_insert_text_3);
        btnClickForInput3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtInput.getText().toString();
                TextAnswer.setText("Data text = " + name);

                SharedPreferences sa = getSharedPreferences("Data_compare_text3", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sa.edit();
                editor.putString("Data_compare_text3", name);
                editor.commit();

                //Pref_name = Data_compare_text1 = ชื่ออะไรก็ได้ เพราะมันจะไปกลายเป็นชื่อไฟล์ที่เก็บลงในเครื่อง
                //Context.MODE_PRIVATE = การกำหนดรูปแบบของการสร้างไฟล์ ซึ่งในที่นี้คือการสร้างไฟล์โดยให้ไฟล์นั้นสามารถเข้าถึงได้จากแอปพลิเคชันนี้เท่านั้น
                 /*กำหนดให้เก็บข้อมูลลงไปโดยใช้ชื่อว่า Data_compare_text1 ส่วนค่าที่เก็บก็คือค่าจากตัวแปร  currentNumber */
                //- My_Value = Data_compare_text1 = เป็นชื่อ Shared Preferences ที่ต้องการ ซึ่งเป็นชื่ออะไรก็ได้
                //เพราะมันจะไปกลายเป็นชื่อไฟล์ที่เก็บลงในเครื่อง เพราะงั้นถ้าจะดึงข้อมูลมาใช้งานก็เรียกชื่อไฟล์ให้ถูกด้วยล่ะส่วน
                //- Context.MODE_PRIVATE = เป็นการกำหนดรูปแบบของการสร้างไฟล์
                //ซึ่งในที่นี้คือการสร้างไฟล์โดยให้ไฟล์นั้นสามารถเข้าถึงได้จากแอปพลิเคชัน นี้เท่านั้น (หรือแอปพลิเคชันที่มี UID เหมือนกัน)
                /* Commit เพื่อทำการบันทึกข้อมูลลงใน Shared Preferences*/

                Intent b = new Intent(insert_text_3.this, countdown_lv4.class);
                startActivity(b);
            }
        });// SetOnclick

    }// Mathoud onCreate
}//Main Class
