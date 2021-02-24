package com.Coco.singleton.type4;

public class test {
    public static void main(String[] args) {
        System.out.println("方式四: 懒汉式(线程安全, 同步方法)");
        singleton instance1 = singleton.getInstance();
        singleton instance2 = singleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.print("instance1 == instance2: ");
        System.out.println(instance1 == instance2);

        System.out.print("HashCode:");
        System.out.println(instance1.hashCode() == instance2.hashCode());
    }
}
