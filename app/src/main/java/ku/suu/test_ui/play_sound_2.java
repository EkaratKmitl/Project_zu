package ku.suu.test_ui;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import java.util.Timer;
import java.util.TimerTask;

public class play_sound_2 extends Activity {
    MediaPlayer mpBgm;
    Timer timer;
    Button btnOK;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_sound_2);//<---------พูกเข้ากับ  play_sound_1.xml

        timer = new Timer();
        timer.schedule(new MyTask(), 0, 2000);// <==== Relay 2 วินาที

        btnOK = (Button)findViewById(R.id.bt_play_sound_2);
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent a = new Intent(play_sound_2.this, insert_text_2.class);
                startActivity(a);
                timer.cancel();
            }
        }); // OnClick
    }// OnCreate


    public class MyTask extends TimerTask {
        int x = 1;
        int currentNumber = 0;
        int[] numbers = {R.raw.i_left_lv2,R.raw.i_right_lv2,
                         R.raw.p_left_lv2,R.raw.p_right_lv2,
                         R.raw.g_left_lv2,R.raw.g_right_lv2,
                         R.raw.k_left_lv2,R.raw.k_right_lv2,
                         R.raw.z_left_lv2,R.raw.z_right_lv2,
        };


        @Override
        public void run() {
            play_sound_2.this.runOnUiThread(new Runnable() {// <-------- รัน Runnable ในเธรดหลัก เพื่อจะได้เข้าถึง UI ได้
                @Override
                public void run() {

                    if (x == 0) {
                        mpBgm = MediaPlayer.create(play_sound_2.this, numbers[currentNumber++]);
                        mpBgm.start();

                        x=1;}
                    else {
                        mpBgm = MediaPlayer.create(play_sound_2.this, numbers[currentNumber]);
                        mpBgm.start();

//**************************************************************************************************************************

                        SharedPreferences sp = getSharedPreferences("Data_compare_sound2", Context.MODE_PRIVATE);//Pref_name = Sound A = ชื่ออะไรก็ได้ เพราะมันจะไปกลายเป็นชื่อไฟล์ที่เก็บลงในเครื่อง
                        SharedPreferences.Editor editor = sp.edit();                                //Context.MODE_PRIVATE = การกำหนดรูปแบบของการสร้างไฟล์ ซึ่งในที่นี้คือการสร้างไฟล์โดยให้ไฟล์นั้นสามารถเข้าถึงได้จากแอปพลิเคชันนี้เท่านั้น
//**************************************************************************************************************************
             /*กำหนดให้เก็บข้อมูลลงไปโดยใช้ชื่อว่า Data_compare_soundA ส่วนค่าที่เก็บก็คือค่าจากตัวแปร  currentNumber */

                        //- My_Value = Data_compare_soundA = เป็นชื่อ Shared Preferences ที่ต้องการ ซึ่งเป็นชื่ออะไรก็ได้
                        //เพราะมันจะไปกลายเป็นชื่อไฟล์ที่เก็บลงในเครื่อง เพราะงั้นถ้าจะดึงข้อมูลมาใช้งานก็เรียกชื่อไฟล์ให้ถูกด้วยล่ะส่วน
                        //- Context.MODE_PRIVATE = เป็นการกำหนดรูปแบบของการสร้างไฟล์
                        //ซึ่งในที่นี้คือการสร้างไฟล์โดยให้ไฟล์นั้นสามารถเข้าถึงได้จากแอปพลิเคชัน นี้เท่านั้น (หรือแอปพลิเคชันที่มี UID เหมือนกัน)
                        editor.putInt("Data_compare_sound2", currentNumber);
            /* Commit เพื่อทำการบันทึกข้อมูลลงใน Shared Preferences*/
                        editor.commit();
//**************************************************************************************************************************
            /*เมื่อบรรทึกค่าเก็บลงในตัวแปรแล้ว ก็ทำการลบค่า X ออกไป 1 เพื่อให้เสียงวนเล่นซ่ำ 3 ครัง แล้วค่อยเล่น ไฟล์เสียงถัดไป */
                        x--; }

                    if (currentNumber == 9) {
                        timer.cancel();}
                }
            });
        }// Object run

    } //Class MyTask

}// Main Class play_sound_2