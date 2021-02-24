package com.Coco.bridge.bridge;

public class Client {
    public static void main(String[] args) {
        //获取折叠样式手机(样式+品牌)
        Phone phone = new FoldedPhone(new Vivo());

        System.out.println(phone.getBrandName());
        phone.open();
        phone.call();
        phone.close();

        System.out.println();

        //获取折直立式手机(样式+品牌)
        phone = new UpRightPhone(new Vivo());

        System.out.println(phone.getBrandName());
        phone.open();
        phone.call();
        phone.close();

        System.out.println();

        //获取折直立式手机(样式+品牌)
        phone = new UpRightPhone(new XiaoMi());

        System.out.println(phone.getBrandName());
        phone.open();
        phone.call();
        phone.close();

        System.out.println();

        //获取折直立式手机(样式+品牌)
        phone = new FoldedPhone(new Vivo());

        System.out.println(phone.getBrandName());
        phone.open();
        phone.call();
        phone.close();
    }

}
