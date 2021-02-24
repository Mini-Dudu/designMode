package com.Coco.template.templateMethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");

        SoyaMilk red = new RedBeanSoyaMilk();
        red.make();

        System.out.println();
        System.out.println("制作花生豆浆");

        SoyaMilk peanut = new PeanutSoyaMilk();
        peanut.make();

        System.out.println();
        System.out.println("制作纯豆浆");

        SoyaMilk pure = new PureSoyaMilk();
        pure.make();
    }
}
