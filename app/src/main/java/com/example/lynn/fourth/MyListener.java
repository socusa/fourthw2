package com.example.lynn.fourth;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Collections;

import static com.example.lynn.fourth.MainActivity.*;

public class MyListener implements View.OnTouchListener,View.OnClickListener {
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

            Rect rectangle = new Rect(params.leftMargin,params.topMargin,params.leftMargin + view.getWidth(),params.topMargin + view.getHeight());

//            message.setText(String.valueOf(rectangles[0]) + " " + String.valueOf(rectangle));

//            message.setText("offsetY is " + offsetY);

            if (rectangles[0].contains(rectangle))
                message.setText("Contains");

        }



        return (true);
    }

    @Override
    public void onClick(View view) {
        if (view == start) {
            for (StateView temp : views)
                myView.removeView(temp);

            views.clear();

            StateView[] states = new StateView[4];

            for (int counter = 0; counter < states.length; counter++) {
                states[counter] = new StateView(view.getContext(), widthOfRectangle - 100, 300);

                states[counter].getState();

                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(widthOfRectangle - 100, 300);

                layoutParams.leftMargin = 50 + counter * widthOfRectangle;
                layoutParams.topMargin = 950;

                states[counter].setLayoutParams(layoutParams);

                states[counter].setOnTouchListener(listener);

                views.add(states[counter]);
            }

            viewsOrderedByArea = new ArrayList<>();

            for (StateView temp : views)
                viewsOrderedByArea.add(temp);

            Collections.sort(viewsOrderedByArea,new StateComparator());

            for (StateView temp : views)
                myView.addView(temp);
        } else if (view == test) {
            myView.removeViews();
        }
    }
}
