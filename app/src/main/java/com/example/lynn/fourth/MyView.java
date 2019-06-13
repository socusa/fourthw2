package com.example.lynn.fourth;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.RelativeLayout;

import static com.example.lynn.fourth.MainActivity.*;

public class MyView extends RelativeLayout {

    public MyView(Context context) {
        super(context);

        Drawable drawable = getResources().getDrawable(R.drawable.shape);

        button = new Button(context);

        button.setBackground(drawable);

        addView(button);
    }

}
