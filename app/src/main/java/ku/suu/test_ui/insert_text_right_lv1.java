package ku.suu.test_ui;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class insert_text_right_lv1 extends AppCompatActivity {

    DatabaseHelper mHelper;
    SQLiteDatabase mDb;

    int num;
    String z = "z";
    String i = "i";
    String p = "p";
    String g = "g";
    String k = "k";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        mHelper = new DatabaseHelper(this);
        mDb = mHelper.getWritableDatabase();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_text_1);

        final EditText edtInput = (EditText) findViewById(R.id.editText1);

        final Button btnClickForInput = (Button) findViewById(R.id.bt_insert_text_1);
        btnClickForInput.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String str = edtInput.getText().toString();
                if (str.equals(z)) {
                    num = 0;
                } else if (str.equals(i)) {
                    num = 1;
                } else if (str.equals(p)) {
                    num = 2;
                } else if (str.equals(g)) {
                    num = 3;
                } else if (str.equals(k)) {
                    num = 4;
                } else {
                    num = 99;
                }

                SharedPreferences sp = getSharedPreferences("Data_compare_text_right_lv1", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("Data_compare_text_right_lv1", num);
                editor.commit();

//***************บรรทึกค่สลง SQLit ******************************************************************

                SharedPreferences sa = getSharedPreferences("Data_compare_sound_left_lv1", Context.MODE_PRIVATE);
                int Data_compare_sound_left_lv1 = sa.getInt("Data_compare_sound_left_lv1", -1);


                SharedPreferences ta = getSharedPreferences("Data_compare_text_left_lv1", Context.MODE_PRIVATE);
                int Data_compare_text_left_lv1 = ta.getInt("Data_compare_text_left_lv1", -1);


                SharedPreferences sb = getSharedPreferences("Data_compare_sound_right_lv1", Context.MODE_PRIVATE);
                int Data_compare_sound_right_lv1 = sb.getInt("Data_compare_sound_right_lv1", -1);


                SharedPreferences tb = getSharedPreferences("Data_compare_text_right_lv1", Context.MODE_PRIVATE);
                int Data_compare_text_right_lv1 = tb.getInt("Data_compare_text_right_lv1", -1);

//*************แสดงการเปรียบเทียบค่าที่ได้ (sound Text) Left and  (sound Text) Right *********************
                int result_true = 1;
                int result_fale = 0;


                if (Data_compare_text_left_lv1 == Data_compare_sound_left_lv1) {

                    if (Data_compare_text_right_lv1 == Data_compare_sound_right_lv1) {

                        SharedPreferences ca = getSharedPreferences("Data_result_left_lv1", Context.MODE_PRIVATE);
                        editor = ca.edit();
                        editor.putInt("Data_result_left_lv1", result_true);
                        editor.commit();

                        SharedPreferences cb = getSharedPreferences("Data_result_right_lv1", Context.MODE_PRIVATE);
                        editor = cb.edit();
                        editor.putInt("Data_result_right_lv1", result_true);
                        editor.commit();

                        ContentValues cv;
                        cv = new ContentValues();
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV1, Data_compare_sound_left_lv1);
                        mDb.insert(DatabaseHelper.TABLE_NAME_LEFT, null, cv);

                        ContentValues ck;
                        ck = new ContentValues();
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV1, Data_compare_sound_right_lv1);
                        mDb.insert(DatabaseHelper.TABLE_NAME_RIGHT, null, ck);
//**************************************************************************************************
                        Intent a = new Intent(insert_text_right_lv1.this, sum1.class);
                        startActivity(a);

                    } else {
                        SharedPreferences cc = getSharedPreferences("Data_result_left_lv1", Context.MODE_PRIVATE);
                        editor = cc.edit();
                        editor.putInt("Data_result_left_lv1", result_true);
                        editor.commit();
                        SharedPreferences cd = getSharedPreferences("Data_result_right_lv1", Context.MODE_PRIVATE);
                        editor = cd.edit();
                        editor.putInt("Data_result_right_lv1", result_fale);
                        editor.commit();

                        Intent b = new Intent(insert_text_right_lv1.this, play_sound_left_lv2.class);
                        startActivity(b);

                    }

                } else {
                    if (Data_compare_text_right_lv1 == Data_compare_sound_right_lv1) {

                        SharedPreferences ce = getSharedPreferences("Data_result_left_lv1", Context.MODE_PRIVATE);
                        editor = ce.edit();
                        editor.putInt("Data_result_left_lv1", result_fale);
                        editor.commit();


                        SharedPreferences cae = getSharedPreferences("Data_result_right_lv1", Context.MODE_PRIVATE);
                        editor = cae.edit();
                        editor.putInt("Data_result_right_lv1", result_true);
                        editor.commit();

                        Intent a = new Intent(insert_text_right_lv1.this, play_sound_left_lv2.class);
                        startActivity(a);


                    } else {

                        SharedPreferences cg = getSharedPreferences("Data_result_left_lv1", Context.MODE_PRIVATE);
                        editor = cg.edit();
                        editor.putInt("Data_result_left_lv1", result_fale);
                        editor.commit();

                        SharedPreferences cd = getSharedPreferences("Data_result_right_lv1", Context.MODE_PRIVATE);
                        editor = cd.edit();
                        editor.putInt("Data_result_right_lv1", result_fale);
                        editor.commit();

                        Intent b = new Intent(insert_text_right_lv1.this, play_sound_left_lv2.class);
                        startActivity(b);

                    }
                }
//*************************************************************************************************
            }

        });
        }// Mathoud onCreate

@Override
protected void onDestroy() {
        super.onDestroy();
         mHelper.close();
        }

        }//Main Class
