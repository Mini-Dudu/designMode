package com.Coco.adapter.objectAdapter;

//被适配者
public class Voltage220V {
    //输出220V电压
    public int output220V() {
        int srcV = 220;
        System.out.println("电压=" + srcV + "伏");
        return srcV;
    }
}
