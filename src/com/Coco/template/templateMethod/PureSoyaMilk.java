package com.Coco.template.templateMethod;

//纯豆浆
public class PureSoyaMilk extends SoyaMilk {
    @Override
    public void add() {
        //空实现即可
    }

    @Override
    boolean isAdd() {
        return false;
    }
}
