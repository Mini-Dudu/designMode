package com.Coco.bridge.bridge;

//public class Vivo extends Brand {
public class Vivo implements Brand {
    @Override
    public String getBrandName() {
        return "Vivo";
    }

    @Override
    public void open() {
        System.out.println(getBrandName() + "手机开机!");
    }

    @Override
    public void close() {
        System.out.println(getBrandName() + "手机关机!");
    }

    @Override
    public void call() {
        System.out.println(getBrandName() + "打电话!");
    }
}
