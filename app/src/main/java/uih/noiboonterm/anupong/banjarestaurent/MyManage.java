package uih.noiboonterm.anupong.banjarestaurent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by anupong_n on 29/2/2559.
 */
public class MyManage {

    // Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public MyManage(Context context) {

        // create Database
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getWritableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    }   // Constructor
}   // Main Class
