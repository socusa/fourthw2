package com.example.lynn.fourth;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static com.example.lynn.fourth.MainActivity.*;

public class MyView extends RelativeLayout {

    public MyView(Context context) {
        super(context);

        Point sizeOfScreen = Util.sizeOfScreen(context);

        width = sizeOfScreen.x;
        height = sizeOfScreen.y;

        int widthOfRectangle = (int)((width - 0.05*width)/4);

        rectangles = new Rect[4];

        int space = (int)(0.05*width/5);

        int startX = space;

        for (int counter=0;counter<rectangles.length;counter++) {
            rectangles[counter] = new Rect(startX, 100, startX + widthOfRectangle, 500);

            startX += widthOfRectangle + space;
        }

        setWillNotDraw(false);

        invalidate();

        state = new ImageView(context);

        state.setImageDrawable(getResources().getDrawable(R.drawable.alabama));

        state.setY(1000);

        addView(state);
    }

    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();

        paint.setColor(0xFF000000);

        for (int counter=0;counter<rectangles.length;counter++)
            canvas.drawRect(rectangles[counter],paint);
    }

}
