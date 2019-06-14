package com.example.lynn.fourth;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StateView extends RelativeLayout {
    private ImageView state;
    private TextView name;
    private Context context;
    private int width;
    private int id;

    private int maxTextSize(String text,
                            TextView view,
                            int length) {
        Rect bounds = new Rect();

        int textSize = 10;

        while (bounds.width() < length) {
            Paint paint = view.getPaint();

            view.setTextSize(textSize);

            paint.getTextBounds(text,0,text.length(),bounds);

            textSize++;
        }

        return(textSize);
    }

    public StateView(Context context,
                     int width,
                     int height) {
        super(context);

        this.width = width;

        this.context = context;

        state = new ImageView(context);

        state.setId(View.generateViewId());

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width,2*height/3);

        state.setLayoutParams(layoutParams);

        name = new TextView(context);

        layoutParams = new RelativeLayout.LayoutParams(width,height/3);

        layoutParams.addRule(RelativeLayout.BELOW,state.getId());

        name.setLayoutParams(layoutParams);

        name.setTypeface(null,Typeface.BOLD);

        addView(state);
        addView(name);
    }

    public int getId() {
        return(id);
    }

    public void getState() {
        Map<Integer,String> map = State.getReverseMap(this);

        List<Integer> list = new ArrayList<>();

        for (int code : map.keySet())
            list.add(code);

        id = list.get((int)(list.size()*Math.random()));

        state.setImageDrawable(ContextCompat.getDrawable(context,id));

        name.setText(map.get(id));

        name.setTextSize(maxTextSize(map.get(id),name,width - 50));
    }

}
