package ku.suu.test_ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class countdown_lv5 extends Activity {
    //ประกาศคลาสที่จะใช้งานในตัวอย่างนี้ทั้งหมด โดยจะมี CountDownTimer ที่เป็นคลาสสำหรับจับเวลา
// Text View, Progress Bar และ Toggle Button ในหน้า Layout
    CountDownTimer cdt;
    TextView tvTimer;
    ToggleButton btnCount;
    ProgressBar pbTimer;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.countdown_lv5);
//กำหนดค่าให้กับ Text View ตามที่สร้างไว้ในหน้า Layout
        tvTimer = (TextView)findViewById(R.id.tvTimer);
//กำหนดค่าให้กับ Progress Bar โดยจะให้ทำการซ่อนไว้ก่อน
        pbTimer = (ProgressBar)findViewById(R.id.pbTimer);
        pbTimer.setVisibility(View.INVISIBLE);

//กำหนดค่าให้กับ Button และเรียกใช้ OnCheckedChangeListener***********************************************
        btnCount = (ToggleButton)findViewById(R.id.bt_countdown_lv5);
        btnCount.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                if (isChecked) {
                    //กำหนดค่าให้กับ Progress Bar โดยจะให้ทำแสดงเมื่อมีการ ..กด
                    pbTimer.setVisibility(View.VISIBLE);
                    cdt = new CountDownTimer(2000, 50) {
                        public void onTick(long millisUntilFinished) {
                            String strTime = String.format("%.1f", (double) millisUntilFinished / 1000);
                            tvTimer.setText(String.valueOf(strTime));
                        }
                        public void onFinish() {
                            Intent intent = new Intent(countdown_lv5.this,play_sound_5.class);
                            startActivity(intent);

                            cdt.cancel();
                            tvTimer.setText("0");
                            pbTimer.setVisibility(View.INVISIBLE);
                        }
                    }.start();
                }
                // ในกรณีที่เกิดเงื่อนไข Finish จะให้กำหนด Text View แสดงเลข 0 เปลี่ยนสถานะของ Toggle Button
                // เป็น Off เพื่อรอให้กดจับเวลาใหม่ และก็อย่าลืมทำการซ่อน Progress Bar ทุกครั้งที่หยุดหรือนับเสร็จด้วย
                else {
                    cdt.cancel();
                    tvTimer.setText("0");
                    pbTimer.setVisibility(View.INVISIBLE);
                }
            }
//**********************************************************************************
        });
//**************************************************************************************************
    }//Main OnCreate
}// Main Class