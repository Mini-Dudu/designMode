package com.Coco.adapter.objectAdapter;

public class test {
    public static void main(String[] args) {
        System.out.println("=====对象适配器=====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
