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
import android.widget.TextView;
import java.util.Objects;

public class insert_text_left_lv2 extends AppCompatActivity {

    // TextView TextAnswer1;
    // TextView TextAnswer2;
    //int text;
    int num ;

    String z = "z";
    String i = "i";
    String p = "p";
    String g = "g";
    String k = "k";

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_text_2);

        final EditText edtInput = (EditText) findViewById(R.id.editText2);

        //  TextAnswer1 = (TextView) findViewById(R.id.tt1);
        //  TextAnswer2 = (TextView) findViewById(R.id.tt2);

        // SharedPreferences sp = getSharedPreferences("Data_compare_sound_left_lv1", Context.MODE_PRIVATE);
        // final int Data_compare_sound_left_lv1 = sp.getInt("Data_compare_sound_left_lv1", -1);
        //TextAnswer2.setText("Data sound  ="+ Data_compare_sound_left_lv1);


        final Button btnClickForInput = (Button) findViewById(R.id.bt_insert_text_2);
        btnClickForInput.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String str = edtInput.getText().toString();

                if(str.equals(z)){
                    num = 0;
                }else if (str.equals(i)) {
                    num  = 1;
                }else if (str.equals(p)) {
                    num  = 2;
                }else if (str.equals(g)) {
                    num  = 3;
                }else if (str.equals(k)) {
                    num  = 4;
                }
                else{
                    num  = 99;
                }

                SharedPreferences sp = getSharedPreferences("Data_compare_text_left_lv2", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("Data_compare_text_left_lv2", num );
                editor.commit();

                Intent a = new Intent(insert_text_left_lv2.this, play_sound_right_lv2.class);
                startActivity(a);

                //    TextAnswer1.setText("Data insert  =" + Data_compare_text_left_lv1);
            }
        });// SetOnclick

    }// Mathoud onCreate
}//Main Class
