package ku.suu.test_ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start extends Activity
                    implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        Button btnTest1 = (Button) findViewById(R.id.bt_start);
        btnTest1.setOnClickListener (this);

    }//Main Object onCreate

    public void onClick(View view) {
       switch (view.getId()){
            case  R.id.bt_start:
                Intent f = new Intent(this,countdown_lv1.class);
                startActivity(f);
                break;

        }//Swith-Case
    }//Main onClick
}//Main Class
