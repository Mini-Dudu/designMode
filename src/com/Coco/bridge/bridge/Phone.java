package com.Coco.bridge.bridge;

public abstract class Phone {
    //聚合品牌
    private Brand brand;

    //手机样式, 折叠、直立……
    private static String style;

    public String getBrandName() {
        return brand.getBrandName();
    }

    //构造器
    public Phone(Brand brand) {
        this.brand = brand;
    }

    //手机开机
    protected void open() {
        brand.open();
    }

    //手机关机
    protected void close() {
        brand.close();
    }

    //打电话
    protected void call() {
        brand.call();
    }

    public Brand getBrand() {
        return brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
