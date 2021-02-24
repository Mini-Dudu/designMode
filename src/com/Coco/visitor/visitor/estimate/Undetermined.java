package com.Coco.visitor.visitor.estimate;

import com.Coco.visitor.visitor.spectator.Man;
import com.Coco.visitor.visitor.spectator.Woman;

//待定的评价
public class Undetermined extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("Man 给的评价是 待定!");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman 给的评价是 待定!");
    }
}
