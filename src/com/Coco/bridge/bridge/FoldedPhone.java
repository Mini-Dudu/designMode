package com.Coco.bridge.bridge;

//折叠手机, 继承了抽象类 Phone
public class FoldedPhone extends Phone {
    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
        setStyle("折叠式");
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
