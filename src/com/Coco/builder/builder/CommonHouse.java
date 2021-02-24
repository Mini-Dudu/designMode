package com.Coco.builder.builder;

//普通房子----具体建造者
public class CommonHouse extends HouseBuilder {

    @Override
    public void builderBasic() {
        house.setBaise("普通房子地基5米!");
        System.out.println("普通房子打地基5米!");
    }

    @Override
    public void builderWall() {
        house.setWall("普通房子墙10厘米厚!");
        System.out.println("普通房子砌墙10厘米厚!");
    }

    @Override
    public void roofed() {
        house.setRoofed("普通房子屋顶!");
        System.out.println("普通房子盖屋顶!");
    }
}
