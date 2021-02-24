package com.Coco.builder.builder;

//指挥者, 指定制作流程
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过 settet 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程,交给指挥者
    public House construtHouse() {
        if (houseBuilder == null) {
            return null;
        }
        houseBuilder.builderBasic();
        houseBuilder.builderWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
