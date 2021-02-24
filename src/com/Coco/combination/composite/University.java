package com.Coco.combination.composite;

import java.util.ArrayList;
import java.util.List;

//学校, 就是 Composite , 可以管理 College
public class University extends OriganizationComponent {
    List<OriganizationComponent> origanizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

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
