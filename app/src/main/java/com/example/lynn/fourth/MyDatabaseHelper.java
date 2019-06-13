package com.example.lynn.fourth;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "StateAreas";

    private static final int DATABASE_VERSION = 2;

    private static final String DATABASE_CREATE = "CREATE TABLE stateinfo(state TEXT NOT NULL,area REAL NOT NULL,dateofadmission TEXT NOT NULL,capital TEXT NOT NULL);";

    public MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);

        db.execSQL("INSERT INTO stateinfo VALUES('Alaska','665384.04','January 3, 1959','Juneau');");
        db.execSQL("INSERT INTO stateinfo VALUES('Texas','268596.46','December 29, 1845','Austin');");
        db.execSQL("INSERT INTO stateinfo VALUES('California','163694.74','September 9, 1850','Sacramento');");
        db.execSQL("INSERT INTO stateinfo VALUES('Montana','147039.71','November 8, 1889','Helena');");
        db.execSQL("INSERT INTO stateinfo VALUES('New Mexico','121590.30','January 6, 1912','Santa Fe');");
        db.execSQL("INSERT INTO stateinfo VALUES('Arizona','113990.30','February 14, 1912','Phoenix');");
        db.execSQL("INSERT INTO stateinfo VALUES('Nevada','110571.82','October 31, 1864','Carson City');");
        db.execSQL("INSERT INTO stateinfo VALUES('Colorado','104093.67','August 1, 1876','Denver');");
        db.execSQL("INSERT INTO stateinfo VALUES('Oregon','98378.54','February 14, 1859','Salem');");
        db.execSQL("INSERT INTO stateinfo VALUES('Wyoming','97813.01','July 10, 1890','Cheyenne');");
        db.execSQL("INSERT INTO stateinfo VALUES('Michigan','96713.51','January 26, 1837','Lansing');");
        db.execSQL("INSERT INTO stateinfo VALUES('Minnesota','86935.83','May 11, 1858','Saint Paul');");
        db.execSQL("INSERT INTO stateinfo VALUES('Utah','84896.88','January 4, 1896','Salt Lake City');");
        db.execSQL("INSERT INTO stateinfo VALUES('Idaho','83568.95','July 3, 1890','Boise');");
        db.execSQL("INSERT INTO stateinfo VALUES('Kansas','82278.36','January 29, 1861','Topeka');");
        db.execSQL("INSERT INTO stateinfo VALUES('Nebraska','77347.81','March 1, 1867','Lincoln');");
        db.execSQL("INSERT INTO stateinfo VALUES('South Dakota','77115.68','November 2, 1889','Pierre');");
        db.execSQL("INSERT INTO stateinfo VALUES('Washington','71297.95','November 11, 1889','Olympia');");
        db.execSQL("INSERT INTO stateinfo VALUES('North Dakota','70698.32','November 2, 1889','Bismarck');");
        db.execSQL("INSERT INTO stateinfo VALUES('Oklahoma','69898.87','November 16, 1907','Oklahoma City');");
        db.execSQL("INSERT INTO stateinfo VALUES('Missouri','69706.99','August 10, 1821','Jefferson City');");
        db.execSQL("INSERT INTO stateinfo VALUES('Florida','65757.70','March 3, 1845','Tallahassee');");
        db.execSQL("INSERT INTO stateinfo VALUES('Wisconsin','65496.38','May 29, 1848','Madison');");
        db.execSQL("INSERT INTO stateinfo VALUES('Georgia','59425.15','January 2, 1788','Atlanta');");
        db.execSQL("INSERT INTO stateinfo VALUES('Illinois','57913.55','December 3, 1818','Springfield');");
        db.execSQL("INSERT INTO stateinfo VALUES('Iowa','56272.81','December 28, 1846','Des Moines');");
        db.execSQL("INSERT INTO stateinfo VALUES('New York','54554.98','July 26, 1788','Albany');");
        db.execSQL("INSERT INTO stateinfo VALUES('North Carolina','53819.16','November 21, 1789','Raleigh');");
        db.execSQL("INSERT INTO stateinfo VALUES('Arkansas','53178.55','June 15, 1836','Little Rock');");
        db.execSQL("INSERT INTO stateinfo VALUES('Alabama','52420.07','December 14, 1819','Montgomery');");
        db.execSQL("INSERT INTO stateinfo VALUES('Louisiana','52378.13','April 30, 1812','Baton Rouge');");
        db.execSQL("INSERT INTO stateinfo VALUES('Mississippi','48431.78','December 10, 1817','Jackson');");
        db.execSQL("INSERT INTO stateinfo VALUES('Pennsylvania','46054.35','December 12, 1787','Harrisburg');");
        db.execSQL("INSERT INTO stateinfo VALUES('Ohio','44825.58','March 1, 1803','Columbus');");
        db.execSQL("INSERT INTO stateinfo VALUES('Virginia','42774.93','June 25, 1788','Richmond');");
        db.execSQL("INSERT INTO stateinfo VALUES('Tennessee','42144.25','June 1, 1796','Nashville');");
        db.execSQL("INSERT INTO stateinfo VALUES('Kentucky','40407.80','June 1, 1792','Frankfort');");
        db.execSQL("INSERT INTO stateinfo VALUES('Indiana','36419.55','December 11, 1816','Indianapolis');");
        db.execSQL("INSERT INTO stateinfo VALUES('Maine','35379.74','March 15, 1820','Augusta');");
        db.execSQL("INSERT INTO stateinfo VALUES('South Carolina','32020.49','May 23, 1788','Columbia');");
        db.execSQL("INSERT INTO stateinfo VALUES('West Virginia','24230.04','June 20, 1863','Charleston');");
        db.execSQL("INSERT INTO stateinfo VALUES('Maryland','12405.93','April 28, 1788','Annapolis');");
        db.execSQL("INSERT INTO stateinfo VALUES('Hawaii','10931.72','August 21, 1959','Honolulu');");
        db.execSQL("INSERT INTO stateinfo VALUES('Massachusetts','10554.39','February 6, 1788','Boston');");
        db.execSQL("INSERT INTO stateinfo VALUES('Vermont','9616.36','March 4, 1791','Montpelier');");
        db.execSQL("INSERT INTO stateinfo VALUES('New Hampshire','9349.16','June 21, 1788','Concord');");
        db.execSQL("INSERT INTO stateinfo VALUES('New Jersey','8722.58','December 18, 1787','Trenton');");
        db.execSQL("INSERT INTO stateinfo VALUES('Connecticut','5543.41','January 9, 1788','Hartford');");
        db.execSQL("INSERT INTO stateinfo VALUES('Delaware','2488.72','December 7, 1787','Dover');");
        db.execSQL("INSERT INTO stateinfo VALUES('Rhode Island','1544.89','May 29, 1790','Providence');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
