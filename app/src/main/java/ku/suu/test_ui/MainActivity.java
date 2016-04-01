package ku.suu.test_ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
                        implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = (Button) findViewById(R.id.bt_start);
        btnStart.setOnClickListener(this);

        Button btnHistory = (Button) findViewById(R.id.bt_history);
        btnHistory.setOnClickListener(this);

        Button btnAbout = (Button) findViewById(R.id.bt_about);
        btnAbout.setOnClickListener(this);

        Button btnExit = (Button) findViewById(R.id.bt_exit);
        btnExit.setOnClickListener(this);

    }// Mathoud onCreate

    public void onClick(View view){
        switch (view.getId()){
            case  R.id.bt_start:
                Intent a = new Intent(this, start.class);
                startActivity(a);
                break;
            case  R.id.bt_history:
                Intent b = new Intent(this, myhistory.class);
                startActivity(b);
                break;
            case  R.id.bt_about:
                Intent c = new Intent(this, aboutapp.class);
                startActivity(c);
                break;
            case  R.id.bt_exit:
                finish();
                break;

        }//Swith-Case
    } // Mathoud on Click

}//Main Class
