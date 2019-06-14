package com.example.lynn.fourth;

import java.util.Comparator;
import java.util.Map;

public class StateComparator implements Comparator<StateView> {

    @Override
    public int compare(StateView stateView, StateView t1) {
        Map<Integer,String> reverseMap = State.getReverseMap(null);

        Map<String,Double> areas = State.getAreas();

        if (areas.get(reverseMap.get(stateView.getId())) > areas.get(reverseMap.get(t1.getId())))
            return(1);
        else if (areas.get(reverseMap.get(stateView.getId())) < areas.get(reverseMap.get(t1.getId())))
            return(-1);
        else
            return 0;
    }

}
