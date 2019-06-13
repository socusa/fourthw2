package com.example.lynn.fourth;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static MyView myView;
    public static Button button;
    public static Rect[] rectangles;
    public static int width;
    public static int height;
    public static SQLiteDatabase database;
    public static MyDatabaseHelper helper;
    public static StateView state;
    public static TextView message;
    public static int widthOfRectangle;
    public static MyListener listener = new MyListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        helper = new MyDatabaseHelper(this);

        database = helper.getReadableDatabase();

        setContentView(myView = new MyView(this));
    }
}
