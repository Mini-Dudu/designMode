package com.Coco.adapter.objectAdapter;

public class Phone {
    //充电功能
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 手机可以充电了!");
        }else {
            System.out.println("电压不为5V, 手机无法进行充电!");
        }
    }
}
