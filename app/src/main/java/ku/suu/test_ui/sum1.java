package ku.suu.test_ui;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;

import java.security.PublicKey;

public class sum1 extends AppCompatActivity {
    EditText edtInput;
    Button btnClick_next1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sum1);

        SharedPreferences aa = getSharedPreferences("Data_result_left_lv1", Context.MODE_PRIVATE);
        int Data_result_left_lv1 = aa.getInt("Data_result_left_lv1", -1);
        int left_lv1 = Data_result_left_lv1;
        SharedPreferences ab = getSharedPreferences("Data_result_right_lv1", Context.MODE_PRIVATE);
        int Data_result_right_lv1 = ab.getInt("Data_result_right_lv1", -1);
        int right_lv1 = Data_result_right_lv1;

        Log.d("result_left1", "sum1 =" +Data_result_left_lv1);
        Log.d("result_right1", "sum1 =" + Data_result_right_lv1);

        final ImageView imgShow1=(ImageView)findViewById(R.id.image_lv1_left);
        final ImageView imgShow2=(ImageView)findViewById(R.id.image_lv1_right);

//*****************************Process LV1**********************************************************
         if(Data_result_left_lv1 == 1 ){

                         if(Data_result_right_lv1 == 1){
                             //11
                             imgShow1.setImageResource(R.drawable.true1);
                             imgShow2.setImageResource(R.drawable.true1);
                         }else{
                             //10
                             imgShow1.setImageResource(R.drawable.true1);
                             imgShow2.setImageResource(R.drawable.fale);
                         }
        }else  {

                         if (Data_result_right_lv1 == 1) {
                             //01
                             imgShow1.setImageResource(R.drawable.fale);
                             imgShow2.setImageResource(R.drawable.true1);
                         } else {
                             //00
                             imgShow1.setImageResource(R.drawable.fale);
                             imgShow2.setImageResource(R.drawable.fale);
                         }
         }

//*****************************Process LV2**********************************************************
  /*      if(Data_result_left_lv2 == 1 ){

            if(Data_result_right_lv2 == 1){
                //11
                imgShow3.setImageResource(R.drawable.true1);
                imgShow4.setImageResource(R.drawable.true1);
            }else{
                //10
                imgShow3.setImageResource(R.drawable.true1);
                imgShow4.setImageResource(R.drawable.fale);
            }
        }else  {

            if (Data_result_right_lv2 == 1) {
                //01
                imgShow3.setImageResource(R.drawable.fale);
                imgShow4.setImageResource(R.drawable.true1);
            } else {
                //00
                imgShow3.setImageResource(R.drawable.fale);
                imgShow4.setImageResource(R.drawable.fale);
            }
        }

//*****************************Process LV3**********************************************************
    /*   if(Data_result_left_lv3 == 1 ){

            if(Data_result_right_lv3 == 1){
                //11
                imgShow5.setImageResource(R.drawable.true1);
                imgShow6.setImageResource(R.drawable.true1);
            }else{
                //10
                imgShow5.setImageResource(R.drawable.true1);
                imgShow6.setImageResource(R.drawable.fale);
            }
        }else  {

            if (Data_result_right_lv3 == 1) {
                //01
                imgShow5.setImageResource(R.drawable.fale);
                imgShow6.setImageResource(R.drawable.true1);
            } else {
                //00
                imgShow5.setImageResource(R.drawable.fale);
                imgShow6.setImageResource(R.drawable.fale);
            }
        }
//*****************************Process LV4**********************************************************
     /*    if(Data_result_left_lv4 == 1 ){

            if(Data_result_right_lv4 == 1){
                //11
                imgShow7.setImageResource(R.drawable.true1);
                imgShow8.setImageResource(R.drawable.true1);
            }else{
                //10
                imgShow7.setImageResource(R.drawable.true1);
                imgShow8.setImageResource(R.drawable.fale);
            }
        }else  {

            if (Data_result_right_lv4 == 1) {
                //01
                imgShow7.setImageResource(R.drawable.fale);
                imgShow8.setImageResource(R.drawable.true1);
            } else {
                //00
                imgShow7.setImageResource(R.drawable.fale);
                imgShow8.setImageResource(R.drawable.fale);
            }
        }
//*****************************Process LV5**********************************************************
        if(Data_result_left_lv5 == 1 ){

            if(Data_result_right_lv5 == 1){
                //11
                imgShow9.setImageResource(R.drawable.true1);
                imgShow10.setImageResource(R.drawable.true1);
            }else{
                //10
                imgShow9.setImageResource(R.drawable.true1);
                imgShow10.setImageResource(R.drawable.fale);
            }
        }else  {

            if (Data_result_right_lv5 == 1) {
                //01
                imgShow9.setImageResource(R.drawable.fale);
                imgShow10.setImageResource(R.drawable.true1);
            } else {
                //00
                imgShow9.setImageResource(R.drawable.fale);
                imgShow10.setImageResource(R.drawable.fale);
            }
        }

        */
//**************************************************************************************************
        btnClick_next1 = (Button) findViewById(R.id.bt_sum1);
        btnClick_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(sum1.this, MainActivity.class);
                startActivity(z);

            }
        });// SetOnclick


    }// onCreate
}//Main Class