package com.Coco.visitor.visitor.estimate;

import com.Coco.visitor.visitor.spectator.Man;
import com.Coco.visitor.visitor.spectator.Woman;

//失败, 不及格
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("Man 给的评价是 继续努力!");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Waman 给的评价是 继续努力!");
    }
}
