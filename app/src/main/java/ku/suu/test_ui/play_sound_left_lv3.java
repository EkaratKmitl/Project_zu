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

public class play_sound_left_lv3 extends Activity {
    MediaPlayer mpBgm;
    Timer timer;
    Button btnOK;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_sound_3);//<---------พูกเข้ากับ  play_sound_2.xml

        timer = new Timer();
        timer.schedule(new MyTask(), 0, 2000);// <==== Relay 2 วินาที



        btnOK = (Button)findViewById(R.id.bt_play_sound_3);
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent a = new Intent(play_sound_left_lv3.this, insert_text_left_lv3.class);
                startActivity(a);
                timer.cancel();
            }
        }); // OnClick
    }// OnCreate

    public class MyTask extends TimerTask {
        int x = 1;

        int currentNumber = 0;
        int[] sound_left = {R.raw.z_left_lv3,R.raw.i_left_lv3
                           ,R.raw.p_left_lv3,R.raw.g_left_lv3
                           ,R.raw.k_left_lv3
        };

        @Override
        public void run() {
            play_sound_left_lv3.this.runOnUiThread(new Runnable() {// <-------- รัน Runnable ในเธรดหลัก เพื่อจะได้เข้าถึง UI ได้
                @Override
                public void run() {

                    if (x == 0) {
                        mpBgm = MediaPlayer.create(play_sound_left_lv3.this, sound_left[currentNumber++]);
                        mpBgm.start();

                        x=1;}
                    else {
                        mpBgm = MediaPlayer.create(play_sound_left_lv3.this, sound_left[currentNumber]);
                        mpBgm.start();

//**************************************************************************************************************************
                        SharedPreferences sp = getSharedPreferences("Data_compare_sound_left_lv3", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putInt("Data_compare_sound_left_lv3", currentNumber);
                        editor.commit();

//**************************************************************************************************************************
                        x--; }
                    if (currentNumber == 9) {
                        timer.cancel();}
                }
            });
        }// Object run

    } //Class MyTask

}// Main Class play_sound_2

