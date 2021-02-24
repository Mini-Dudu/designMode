package com.Coco.bridge.bridge;

public class UpRightPhone extends Phone {
    //构造器
    public UpRightPhone(Brand brand) {
        super(brand);
        setStyle("直立式");
    }

    @Override
    public void open() {
        System.out.print(getStyle());
        super.open();
    }

    @Override
    public void close() {
        System.out.print(getStyle());
        super.close();
    }

    @Override
    public void call() {
        System.out.print(getStyle());
        super.call();
    }
}
