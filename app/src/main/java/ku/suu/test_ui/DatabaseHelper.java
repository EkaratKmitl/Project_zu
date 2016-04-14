package ku.suu.test_ui;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String TAG = DatabaseHelper.class.getSimpleName();

    private static final String DATABASE_NAME = "Test Sound.db";
    private static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME_LEFT = "SoundLeft";
    public static final String TABLE_NAME_RIGHT = "SoundRight";
    public static final String COL_IDL = "_id";
    public static final String COL_IDR = "_id";

    public static final String COL_SOUND_LEFT_LV1 = "sound_left_lv1";
    public static final String COL_SOUND_LEFT_LV2 = "sound_left_lv2";
    public static final String COL_SOUND_LEFT_LV3 = "sound_left_lv3";
    public static final String COL_SOUND_LEFT_LV4 = "sound_left_lv4";
    public static final String COL_SOUND_LEFT_LV5 = "sound_left_lv5";

    public static final String COL_SOUND_RIGHT_LV1 = "sound_right_lv1";
    public static final String COL_SOUND_RIGHT_LV2 = "sound_right_lv2";
    public static final String COL_SOUND_RIGHT_LV3 = "sound_right_lv3";
    public static final String COL_SOUND_RIGHT_LV4 = "sound_right_lv4";
    public static final String COL_SOUND_RIGHT_LV5 = "sound_right_lv5";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_TABLE_LEFT = "CREATE TABLE " + TABLE_NAME_LEFT + "("
                + COL_IDL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_SOUND_LEFT_LV1 + " TEXT, "
                + COL_SOUND_LEFT_LV2 + " TEXT, "
                + COL_SOUND_LEFT_LV3 + " TEXT, "
                + COL_SOUND_LEFT_LV4 + " TEXT, "
                + COL_SOUND_LEFT_LV5 + " TEXT " + ")";
        db.execSQL(SQL_CREATE_TABLE_LEFT);

        String SQL_CREATE_TABLE_RIGHT = "CREATE TABLE " + TABLE_NAME_RIGHT + "("
                + COL_IDR + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_SOUND_RIGHT_LV1 + " TEXT, "
                + COL_SOUND_RIGHT_LV2 + " TEXT, "
                + COL_SOUND_RIGHT_LV3 + " TEXT, "
                + COL_SOUND_RIGHT_LV4 + " TEXT, "
                + COL_SOUND_RIGHT_LV5 + " TEXT " + ")";
        db.execSQL(SQL_CREATE_TABLE_RIGHT);

        Log.d(TAG, "Inserting initial data");

        ContentValues cv = new ContentValues();
        cv.put(COL_SOUND_LEFT_LV1, "test");
        cv.put(COL_SOUND_LEFT_LV2, "test");
        cv.put(COL_SOUND_LEFT_LV3, "test");
        cv.put(COL_SOUND_LEFT_LV4, "test");
        cv.put(COL_SOUND_LEFT_LV5, "test");
        db.insert(TABLE_NAME_LEFT, null, cv);

        ContentValues ck = new ContentValues();
        ck.put(COL_SOUND_RIGHT_LV1, "test");
        ck.put(COL_SOUND_RIGHT_LV2, "test");
        ck.put(COL_SOUND_RIGHT_LV3, "test");
        ck.put(COL_SOUND_RIGHT_LV4, "test");
        ck.put(COL_SOUND_RIGHT_LV5, "test");
        db.insert(TABLE_NAME_RIGHT, null, ck);



    }//onCreate

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String msg = "Upgrading database from version " + oldVersion + " to " +
                newVersion;
        Log.d(TAG, msg);
    }
}