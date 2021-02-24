package com.Coco.singleton.type8;


public class test {
    public static void main(String[] args) {
        System.out.println("方式八: 枚举");
        singleton instance1 = singleton.Instance;
        singleton instance2 = singleton.Instance;

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.print("instance1 == instance2: ");
        System.out.println(instance1 == instance2);


        System.out.println("instance1.hashCode:"+instance1.hashCode());
        System.out.println("instance2.hashCode:"+instance2.hashCode());
        System.out.print("HashCode是否相等:");
        System.out.println(instance1.hashCode() == instance2.hashCode());
    }
}
