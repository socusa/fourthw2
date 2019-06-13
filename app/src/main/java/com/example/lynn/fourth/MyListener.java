package com.example.lynn.fourth;

import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class MyListener implements View.OnTouchListener {
    private int offsetX;
    private int offsetY;

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)view.getLayoutParams();

        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            offsetX = (int)(motionEvent.getRawX() - params.leftMargin);
            offsetY = (int)(motionEvent.getRawY() - params.topMargin);
        } else if (motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
            params.leftMargin = (int)(motionEvent.getRawX() - offsetX);
            params.topMargin = (int)(motionEvent.getRawY() - offsetY);

            view.setLayoutParams(params);
        }

        return (true);
    }
}
