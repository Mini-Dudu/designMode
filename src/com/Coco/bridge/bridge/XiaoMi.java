package com.Coco.bridge.bridge;

//小米手机
//public class XiaoMi extends Brand {
public class XiaoMi implements Brand {
    @Override
    public String getBrandName() {
        return "小米";
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
