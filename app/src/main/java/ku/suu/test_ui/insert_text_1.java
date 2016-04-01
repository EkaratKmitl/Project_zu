package ku.suu.test_ui;


import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Objects;

public class insert_text_1 extends AppCompatActivity {


    TextView TextAnswer;

    int text;
    int num;

    String a;
    String b;
    String c;

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_text_1);

        final EditText edtInput = (EditText) findViewById(R.id.editText1);
        TextAnswer = (TextView) findViewById(R.id.tt1);
        final Button btnClickForInput = (Button) findViewById(R.id.bt_insert_text_1);



        btnClickForInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edtInput.getText().toString();

                if(Objects.equals(str, a)){
                    num = 0;
                }else if (Objects.equals(str, b)) {
                    num = 1;
                }else if (Objects.equals(str, c)) {
                    num = 2;
                }
                TextAnswer.setText("Data text ="+ num);

              /*  SharedPreferences sp = getSharedPreferences("Data_compare_text1", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("Data_compare_text1", name);
                editor.commit();

                //Pref_name = Data_compare_text1 = ชื่ออะไรก็ได้ เพราะมันจะไปกลายเป็นชื่อไฟล์ที่เก็บลงในเครื่อง
                //Context.MODE_PRIVATE = การกำหนดรูปแบบของการสร้างไฟล์ ซึ่งในที่นี้คือการสร้างไฟล์โดยให้ไฟล์นั้นสามารถเข้าถึงได้จากแอปพลิเคชันนี้เท่านั้น
                 /*กำหนดให้เก็บข้อมูลลงไปโดยใช้ชื่อว่า Data_compare_text1 ส่วนค่าที่เก็บก็คือค่าจากตัวแปร  currentNumber */
                //- My_Value = Data_compare_text1 = เป็นชื่อ Shared Preferences ที่ต้องการ ซึ่งเป็นชื่ออะไรก็ได้
                //เพราะมันจะไปกลายเป็นชื่อไฟล์ที่เก็บลงในเครื่อง เพราะงั้นถ้าจะดึงข้อมูลมาใช้งานก็เรียกชื่อไฟล์ให้ถูกด้วยล่ะส่วน
                //- Context.MODE_PRIVATE = เป็นการกำหนดรูปแบบของการสร้างไฟล์
                //ซึ่งในที่นี้คือการสร้างไฟล์โดยให้ไฟล์นั้นสามารถเข้าถึงได้จากแอปพลิเคชัน นี้เท่านั้น (หรือแอปพลิเคชันที่มี UID เหมือนกัน)
                /* Commit เพื่อทำการบันทึกข้อมูลลงใน Shared Preferences*/

                // Intent a = new Intent(insert_text_1.this, sum5.class);
                // startActivity(a);
            }
        });// SetOnclick

    }// Mathoud onCreate
}//Main Class
