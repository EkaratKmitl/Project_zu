package ku.suu.test_ui;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Myhistory extends Activity {
    SQLiteDatabase mDb;
    DatabaseHelper mHelper;
    Cursor mCursor;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.myhistory);

        mHelper = new DatabaseHelper(this);
        mDb = mHelper.getWritableDatabase();
        mCursor = mDb.rawQuery("SELECT " + DatabaseHelper.COL_IDL + ", "  + DatabaseHelper.COL_DATE
                + " FROM " + DatabaseHelper.TABLE_NAME_LEFT, null);

        ArrayList<String> dirArray = new ArrayList<String>();
        mCursor.moveToFirst();

        while ( !mCursor.isAfterLast() ){
            dirArray.add(mCursor.getString(mCursor.getColumnIndex(DatabaseHelper.COL_IDL)) + "\t\t"
                    + "Date : " + mCursor.getString(mCursor.getColumnIndex(DatabaseHelper.COL_DATE)));
            mCursor.moveToNext();
        }

//************************************************************************************************************************
        ArrayAdapter adapterDir = new ArrayAdapter (this, android.R.layout.simple_list_item_1, dirArray);

        ListView listView1 = (ListView)findViewById(R.id.listView1);
        listView1.setAdapter(adapterDir);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView,View view,int i ,long l) {
                myIntentToDatail(i);
            }
        });
//************************************************************************************************************************
    }//OnCreate

private void myIntentToDatail(int intClick) {
    Intent objIntent = new Intent(Myhistory.this, detail_myhistory.class);
   // objIntent.putExtra("Click", intClick);
    startActivity(objIntent);

}//myIntentToDatail


  /*  public void onClick(View view){
        switch (view.getId()){
            case  R.id.bt_home:
                Intent a = new Intent(this, MainActivity.class);
                startActivity(a);
                break;
        }//Swith-Case
    } // Mathoud on Click   */



    public void onPause() {
        super.onPause();
        mHelper.close();
        mDb.close();
    }//OnPause
}