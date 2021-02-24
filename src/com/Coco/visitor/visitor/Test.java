package com.Coco.visitor.visitor;

import com.Coco.visitor.visitor.estimate.Action;
import com.Coco.visitor.visitor.estimate.Fail;
import com.Coco.visitor.visitor.estimate.Success;
import com.Coco.visitor.visitor.estimate.Undetermined;
import com.Coco.visitor.visitor.spectator.Man;
import com.Coco.visitor.visitor.spectator.Woman;

public class Test {
    public static void main(String[] args) {
        //创建 ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //estimate: 估计，估价；判断，看法；估计，估量；判断，评价；

        //成功
        Action estimate = new Success();
        objectStructure.show(estimate);


        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());

        //成功
        estimate = new Fail();
        objectStructure.show(estimate);

        //扩展待定评价
        estimate = new Undetermined();
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());

        objectStructure.show(estimate);
    }
}
