package com.example.lynn.fourth;

import android.content.Context;
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

    public StateView(Context context,
                     int width,
                     int height) {
        super(context);

        this.context = context;

        state = new ImageView(context);

        state.setId(View.generateViewId());

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width,3*height/4);

        state.setLayoutParams(layoutParams);

        name = new TextView(context);

        layoutParams = new RelativeLayout.LayoutParams(width,height/4);

        layoutParams.addRule(RelativeLayout.BELOW,state.getId());

        name.setLayoutParams(layoutParams);

        addView(state);
        addView(name);
    }

    public void getState() {
        Map<Integer,String> map = State.getReverseMap(this);

        List<Integer> list = new ArrayList<>();

        for (int code : map.keySet())
            list.add(code);

        int id = list.get((int)(list.size()*Math.random()));

        state.setImageDrawable(ContextCompat.getDrawable(context,id));

        name.setText(map.get(id));
    }


}
