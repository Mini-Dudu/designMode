package com.Coco.builder.builder;

//高楼大厦
public class HighBuilding extends HouseBuilder {
    @Override
    public void builderBasic() {
        house.setBaise("高楼地基100米!");
        System.out.println("高楼打地基100米!");
    }

    @Override
    public void builderWall() {
        house.setWall("高楼墙25厘米厚!");
        System.out.println("高楼砌墙25厘米厚!");
    }

    @Override
    public void roofed() {
        house.setRoofed("高楼的透明屋顶!");
        System.out.println("高楼透明屋顶封顶!");
    }
}
