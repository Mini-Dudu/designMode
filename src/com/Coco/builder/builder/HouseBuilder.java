package com.Coco.builder.builder;

//抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();

    //建造流程, 抽象方法
    public abstract void builderBasic();
    public abstract void builderWall();
    public abstract void roofed();

    //建造房子,并返回建造好的产品
    public House buildHouse() {
        return house;
    }
}
