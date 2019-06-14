package com.example.lynn.fourth;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.lynn.fourth.MainActivity.*;

public class MyView extends RelativeLayout {
    public StateView[] states;

    public MyView(Context context) {
        super(context);

        Point sizeOfScreen = Util.sizeOfScreen(context);

        width = sizeOfScreen.x;
        height = sizeOfScreen.y;

        widthOfRectangle = (int)((width - 0.05*width)/4);

        rectangles = new Rect[4];

        int space = (int)(0.05*width/5);

        int startX = space;

        for (int counter=0;counter<rectangles.length;counter++) {
            rectangles[counter] = new Rect(startX, 100, startX + widthOfRectangle, 500);

            startX += widthOfRectangle + space;
        }

        labels = new TextView[4];

        String[] temp = {"Largest","2nd Largest","3rd Largest","Smallest"};

        startX = space + 180;

        for (int counter=0;counter<labels.length;counter++) {
            labels[counter] = new TextView(context);

            labels[counter].setText(temp[counter]);

            labels[counter].setTextSize(20);

            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(widthOfRectangle, 100);

            layoutParams.leftMargin = startX;
            layoutParams.topMargin = 0;

            labels[counter].setLayoutParams(layoutParams);

            labels[counter].setTypeface(null, Typeface.BOLD);

            addView(labels[counter]);

            startX += widthOfRectangle + space;
        }

        setWillNotDraw(false);

        invalidate();

        message = new TextView(context);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(400,200);

        message.setX(100);

        message.setY(700);

        addView(message);

        start = new Button(context);

        start.setText("Start");

        start.setOnClickListener(listener);

        layoutParams = new RelativeLayout.LayoutParams(200,100);

        layoutParams.topMargin = 600;

        start.setLayoutParams(layoutParams);

        addView(start);

        test = new Button(context);

        test.setOnClickListener(listener);

        layoutParams = new RelativeLayout.LayoutParams(200,100);

        layoutParams.leftMargin = 500;
        layoutParams.topMargin = 600;

        test.setLayoutParams(layoutParams);

        addView(test);
    }

    public void removeViews() {
        if (this.states != null) {
            for (int counter = 0; counter < states.length; counter++)
                removeView(states[counter]);
        }
    }

    public void setStates(StateView[] states) {

        this.states = states;

        for (StateView stateView : states)
            addView(stateView);
    }

    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();

        paint.setColor(0xFF000000);

        paint.setStyle(Paint.Style.STROKE);

        paint.setStrokeWidth(5);

        for (int counter=0;counter<rectangles.length;counter++)
            canvas.drawRect(rectangles[counter],paint);
    }

}
