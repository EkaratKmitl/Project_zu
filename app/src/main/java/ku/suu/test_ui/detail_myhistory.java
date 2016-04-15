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

public class detail_myhistory extends AppCompatActivity {
    EditText edtInput;
    Button btnClick_next1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sum5);

        SharedPreferences aa = getSharedPreferences("Data_result_left_lv1", Context.MODE_PRIVATE);
        int Data_result_left_lv1 = aa.getInt("Data_result_left_lv1", -1);
        int left_lv1 = Data_result_left_lv1;
        SharedPreferences ab = getSharedPreferences("Data_result_right_lv1", Context.MODE_PRIVATE);
        int Data_result_right_lv1 = ab.getInt("Data_result_right_lv1", -1);
        int right_lv1 = Data_result_right_lv1;

        SharedPreferences ba = getSharedPreferences("Data_result_left_lv2", Context.MODE_PRIVATE);
        int Data_result_left_lv2 = ba.getInt("Data_result_left_lv2", -1);
        int left_lv2 = Data_result_left_lv2;
        SharedPreferences bb = getSharedPreferences("Data_result_right_lv2", Context.MODE_PRIVATE);
        int Data_result_right_lv2 = bb.getInt("Data_result_right_lv2", -1);
        int right_lv2 = Data_result_right_lv2;

        SharedPreferences ca = getSharedPreferences("Data_result_left_lv3", Context.MODE_PRIVATE);
        int Data_result_left_lv3 = ca.getInt("Data_result_left_lv3", -1);
        int left_lv3 = Data_result_left_lv3;
        SharedPreferences cb = getSharedPreferences("Data_result_right_lv3", Context.MODE_PRIVATE);
        int Data_result_right_lv3 = cb.getInt("Data_result_right_lv3", -1);
        int right_lv3 = Data_result_right_lv3;

        SharedPreferences da = getSharedPreferences("Data_result_left_lv4", Context.MODE_PRIVATE);
        int Data_result_left_lv4 = da.getInt("Data_result_left_lv4", -1);
        int left_lv4 = Data_result_left_lv4;
        SharedPreferences db = getSharedPreferences("Data_result_right_lv4", Context.MODE_PRIVATE);
        int Data_result_right_lv4 = db.getInt("Data_result_right_lv4", -1);
        int right_lv4 = Data_result_right_lv4;

        SharedPreferences ea = getSharedPreferences("Data_result_left_lv5", Context.MODE_PRIVATE);
        int Data_result_left_lv5 = ea.getInt("Data_result_left_lv5", -1);
        int left_lv5 = Data_result_left_lv5;
        SharedPreferences eb = getSharedPreferences("Data_result_right_lv5", Context.MODE_PRIVATE);
        int Data_result_right_lv5 = eb.getInt("Data_result_right_lv5", -1);
        int right_lv5 = Data_result_right_lv5;

        Log.d("result_left1", "sum5 =" + Data_result_left_lv1);
        Log.d("result_right1", "sum5 =" + Data_result_right_lv1);

        Log.d("result_left2", "sum5 =" + Data_result_left_lv2);
        Log.d("result_right2", "sum5 =" + Data_result_right_lv2);

        Log.d("result_left3", "sum5 =" + Data_result_left_lv3);
        Log.d("result_right3", "sum5 =" + Data_result_right_lv3);

        Log.d("result_left4", "sum5 =" + Data_result_left_lv4);
        Log.d("result_right4", "sum5 =" + Data_result_right_lv4);

        Log.d("result_left5", "sum5 =" + Data_result_left_lv5);
        Log.d("result_right5", "sum5 =" + Data_result_right_lv5);


        final ImageView imgShow1=(ImageView)findViewById(R.id.image_lv1_left);
        final ImageView imgShow2=(ImageView)findViewById(R.id.image_lv1_right);

        final ImageView imgShow3=(ImageView)findViewById(R.id.image_lv2_left);
        final ImageView imgShow4=(ImageView)findViewById(R.id.image_lv2_right);

        final ImageView imgShow5=(ImageView)findViewById(R.id.image_lv3_left);
        final ImageView imgShow6=(ImageView)findViewById(R.id.image_lv3_right);

        final ImageView imgShow7=(ImageView)findViewById(R.id.image_lv4_left);
        final ImageView imgShow8=(ImageView)findViewById(R.id.image_lv4_right);

        final ImageView imgShow9=(ImageView)findViewById(R.id.image_lv5_left);
        final ImageView imgShow10=(ImageView)findViewById(R.id.image_lv5_right);


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
        if(Data_result_left_lv2 == 1 ){

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
        if(Data_result_left_lv3 == 1 ){

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
        if(Data_result_left_lv4 == 1 ){

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


//**************************************************************************************************


    }// onCreate

    public void onClick(View view){
        switch (view.getId()){
            case  R.id.bt_back_myhistory:
                Intent a = new Intent(this, Myhistory.class);
                startActivity(a);
                break;
            case  R.id.bt_grape:



                finish();
                break;

        }//Swith-Case
    } // Mathoud on Click
}//Main Class
