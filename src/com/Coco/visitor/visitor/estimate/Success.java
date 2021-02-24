package com.Coco.visitor.visitor.estimate;

import com.Coco.visitor.visitor.spectator.Man;
import com.Coco.visitor.visitor.spectator.Woman;

//成功
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("Man 给的评价是 非常棒!");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman 给的评价是 非常棒!");
    }
}
