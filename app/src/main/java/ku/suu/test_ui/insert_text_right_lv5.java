package ku.suu.test_ui;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class insert_text_right_lv5 extends AppCompatActivity {
    DatabaseHelper mHelper;
    SQLiteDatabase mDb;
    int num;

    String z = "z";
    String i = "i";
    String p = "p";
    String g = "g";
    String k = "k";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final Date date = new Date();
        mHelper = new DatabaseHelper(this);
        mDb = mHelper.getWritableDatabase();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_text_5);

        final EditText edtInput = (EditText) findViewById(R.id.editText5);

        final Button btnClickForInput = (Button) findViewById(R.id.bt_insert_text_5);
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

                SharedPreferences sp = getSharedPreferences("Data_compare_text_right_lv5", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("Data_compare_text_right_lv5", num);
                editor.commit();
//***************บรรทึกค่สลง SQLit ******************************************************************
                SharedPreferences sa = getSharedPreferences("Data_compare_sound_left_lv1", Context.MODE_PRIVATE);
                int Data_compare_sound_left_lv1 = sa.getInt("Data_compare_sound_left_lv1", -1);
                SharedPreferences sb = getSharedPreferences("Data_compare_sound_right_lv1", Context.MODE_PRIVATE);
                int Data_compare_sound_right_lv1 = sb.getInt("Data_compare_sound_right_lv1", -1);
                SharedPreferences sc = getSharedPreferences("Data_compare_sound_left_lv2", Context.MODE_PRIVATE);
                int Data_compare_sound_left_lv2 = sc.getInt("Data_compare_sound_left_lv2", -1);
                SharedPreferences sd = getSharedPreferences("Data_compare_sound_right_lv2", Context.MODE_PRIVATE);
                int Data_compare_sound_right_lv2 = sd.getInt("Data_compare_sound_right_lv2", -1);
                SharedPreferences se = getSharedPreferences("Data_compare_sound_left_lv3", Context.MODE_PRIVATE);
                int Data_compare_sound_left_lv3 = se.getInt("Data_compare_sound_left_lv3", -1);
                SharedPreferences sg = getSharedPreferences("Data_compare_sound_right_lv3", Context.MODE_PRIVATE);
                int Data_compare_sound_right_lv3 = sg.getInt("Data_compare_sound_right_lv3", -1);
                SharedPreferences sh = getSharedPreferences("Data_compare_sound_left_lv4", Context.MODE_PRIVATE);
                int Data_compare_sound_left_lv4 = sh.getInt("Data_compare_sound_left_lv4", -1);
                SharedPreferences si = getSharedPreferences("Data_compare_sound_right_lv4", Context.MODE_PRIVATE);
                int Data_compare_sound_right_lv4 = si.getInt("Data_compare_sound_right_lv4", -1);


                SharedPreferences sj = getSharedPreferences("Data_compare_sound_left_lv5", Context.MODE_PRIVATE);
                int Data_compare_sound_left_lv5 = sj.getInt("Data_compare_sound_left_lv5", -1);

                SharedPreferences sk = getSharedPreferences("Data_compare_text_left_lv5", Context.MODE_PRIVATE);
                int Data_compare_text_left_lv5 = sk.getInt("Data_compare_text_left_lv5", -1);


                SharedPreferences sl = getSharedPreferences("Data_compare_sound_right_lv5", Context.MODE_PRIVATE);
                int Data_compare_sound_right_lv5 = sl.getInt("Data_compare_sound_right_lv5", -1);


                SharedPreferences sm = getSharedPreferences("Data_compare_text_right_lv5", Context.MODE_PRIVATE);
                int Data_compare_text_right_lv5 = sm.getInt("Data_compare_text_right_lv5", -1);


//*************แสดงการเปรียบเทียบค่าที่ได้ (sound Text) Left and  (sound Text) Right *********************
                int result_true = 1;
                int result_fale = 0;

                if (Data_compare_text_left_lv5 == Data_compare_sound_left_lv5) {

                    if (Data_compare_text_right_lv5 == Data_compare_sound_right_lv5) {

                        SharedPreferences ca = getSharedPreferences("Data_result_left_lv5", Context.MODE_PRIVATE);
                        editor = ca.edit();
                        editor.putInt("Data_result_left_lv5", result_true);
                        editor.commit();
                        SharedPreferences cb = getSharedPreferences("Data_result_right_lv5", Context.MODE_PRIVATE);
                        editor = cb.edit();
                        editor.putInt("Data_result_right_lv5", result_true);
                        editor.commit();
//**********************************************************************************************
                        ContentValues cv;
                        cv = new ContentValues();
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV1, Data_compare_sound_left_lv1);
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV2, Data_compare_sound_left_lv2);
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV3, Data_compare_sound_left_lv3);
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV4, Data_compare_sound_left_lv4);
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV5, Data_compare_sound_left_lv5);
                        mDb.insert(DatabaseHelper.TABLE_NAME_LEFT, null, cv);

                        ContentValues ck;
                        ck = new ContentValues();
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV1, Data_compare_sound_right_lv1);
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV2, Data_compare_sound_right_lv2);
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV3, Data_compare_sound_right_lv3);
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV4, Data_compare_sound_right_lv4);
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV5, Data_compare_sound_right_lv5);
                        mDb.insert(DatabaseHelper.TABLE_NAME_RIGHT, null, ck);

//**********************************************************************************************


                        Intent a = new Intent(insert_text_right_lv5.this, sum5.class);
                        startActivity(a);

                    } else {
                        SharedPreferences cc = getSharedPreferences("Data_result_left_lv5", Context.MODE_PRIVATE);
                        editor = cc.edit();
                        editor.putInt("Data_result_left_lv5", result_true);
                        editor.commit();
                        SharedPreferences cd = getSharedPreferences("Data_result_right_lv5", Context.MODE_PRIVATE);
                        editor = cd.edit();
                        editor.putInt("Data_result_right_lv5", result_fale);
                        editor.commit();

//**********************************************************************************************
                        ContentValues cv;
                        cv = new ContentValues();
                        cv.put(DatabaseHelper.COL_DATE, dateFormat.format(date));
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV1, Data_compare_sound_left_lv1);
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV2, Data_compare_sound_left_lv2);
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV3, Data_compare_sound_left_lv3);
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV4, Data_compare_sound_left_lv4);
                        cv.put(DatabaseHelper.COL_SOUND_LEFT_LV5, Data_compare_sound_left_lv5);
                        mDb.insert(DatabaseHelper.TABLE_NAME_LEFT, null, cv);

                        ContentValues ck;
                        ck = new ContentValues();
                        ck.put(DatabaseHelper.COL_DATE, dateFormat.format(date));
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV1, Data_compare_sound_right_lv1);
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV2, Data_compare_sound_right_lv2);
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV3, Data_compare_sound_right_lv3);
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV4, Data_compare_sound_right_lv4);
                        ck.put(DatabaseHelper.COL_SOUND_RIGHT_LV5, Data_compare_sound_right_lv5);
                        mDb.insert(DatabaseHelper.TABLE_NAME_RIGHT, null, ck);

//**********************************************************************************************

                        Intent b = new Intent(insert_text_right_lv5.this,sum5.class);
                        startActivity(b);
                    }

                } else {
                    if(Data_compare_text_right_lv5 == Data_compare_sound_right_lv5){

                        SharedPreferences ce = getSharedPreferences("Data_result_left_lv5", Context.MODE_PRIVATE);
                        editor = ce.edit();
                        editor.putInt("Data_result_left_lv5", result_fale);
                        editor.commit();
                        SharedPreferences cae = getSharedPreferences("Data_result_right_lv5", Context.MODE_PRIVATE);
                        editor = cae.edit();
                        editor.putInt("Data_result_right_lv5", result_true);
                        editor.commit();
//**********************************************************************************************
                        ContentValues cv;
                        cv = new ContentValues();
                        cv.put(mHelper.COL_SOUND_LEFT_LV1, Data_compare_sound_left_lv1);
                        cv.put(mHelper.COL_SOUND_RIGHT_LV1, Data_compare_sound_right_lv1);
                        cv.put(mHelper.COL_SOUND_LEFT_LV2, Data_compare_sound_left_lv2);
                        cv.put(mHelper.COL_SOUND_RIGHT_LV2, Data_compare_sound_right_lv2);
                        cv.put(mHelper.COL_SOUND_LEFT_LV3, Data_compare_sound_left_lv3);
                        cv.put(mHelper.COL_SOUND_RIGHT_LV3, Data_compare_sound_right_lv3);
                        cv.put(mHelper.COL_SOUND_LEFT_LV4, Data_compare_sound_left_lv4);
                        cv.put(mHelper.COL_SOUND_RIGHT_LV4, Data_compare_sound_right_lv4);
                        cv.put(mHelper.COL_SOUND_LEFT_LV5, Data_compare_sound_left_lv5);
                        cv.put(mHelper.COL_SOUND_RIGHT_LV5, Data_compare_sound_right_lv5);

                        mDb.insert(mHelper.TABLE_NAME_LEFT, null, cv);
                        mDb.insert(mHelper.TABLE_NAME_RIGHT, null, cv);

//**********************************************************************************************
                        Intent a = new Intent(insert_text_right_lv5.this,sum5.class);
                        startActivity(a);


                    }else {

                        SharedPreferences cg = getSharedPreferences("Data_result_left_lv5", Context.MODE_PRIVATE);
                        editor = cg.edit();
                        editor.putInt("Data_result_left_lv5", result_fale);
                        editor.commit();
                        SharedPreferences cd = getSharedPreferences("Data_result_right_lv5", Context.MODE_PRIVATE);
                        editor = cd.edit();
                        editor.putInt("Data_result_right_lv5", result_fale);
                        editor.commit();
//**********************************************************************************************
                        ContentValues cv;
                        cv = new ContentValues();
                        cv.put(mHelper.COL_SOUND_LEFT_LV1, Data_compare_sound_left_lv1);
                        cv.put(mHelper.COL_SOUND_RIGHT_LV1, Data_compare_sound_right_lv1);
                        cv.put(mHelper.COL_SOUND_LEFT_LV2, Data_compare_sound_left_lv2);
                        cv.put(mHelper.COL_SOUND_RIGHT_LV2, Data_compare_sound_right_lv2);
                        cv.put(mHelper.COL_SOUND_LEFT_LV3, Data_compare_sound_left_lv3);
                        cv.put(mHelper.COL_SOUND_RIGHT_LV3, Data_compare_sound_right_lv3);
                        cv.put(mHelper.COL_SOUND_LEFT_LV4, Data_compare_sound_left_lv4);
                        cv.put(mHelper.COL_SOUND_RIGHT_LV4, Data_compare_sound_right_lv4);
                        cv.put(mHelper.COL_SOUND_LEFT_LV5, Data_compare_sound_left_lv5);
                        cv.put(mHelper.COL_SOUND_RIGHT_LV5, Data_compare_sound_right_lv5);

                        mDb.insert(mHelper.TABLE_NAME_LEFT, null, cv);
                        mDb.insert(mHelper.TABLE_NAME_RIGHT, null, cv);
//**********************************************************************************************
                        Intent b = new Intent(insert_text_right_lv5.this, sum5.class);
                        startActivity(b);

                    }
                }
                //*************************************************************************************************
            }// SetOnclick

        });

    }// Mathoud onCreate
}//Main Class

