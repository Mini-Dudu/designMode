package com.Coco.combination.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OriganizationComponent {
    List<OriganizationComponent> origanizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    //实际业务中的 College 和 University 的 add、remove方法不一定完全相同
    @Override
    protected void add(OriganizationComponent origanizationComponent) {
        origanizationComponents.add(origanizationComponent);
    }

    @Override
    protected void remove(OriganizationComponent origanizationComponent) {
        origanizationComponents.remove(origanizationComponent);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void print() {
        System.out.println("----------" + getName() + "----------");
        //遍历origanizationComponents
        for (OriganizationComponent origanizationComponent : origanizationComponents) {
            origanizationComponent.print();
        }
    }
}
