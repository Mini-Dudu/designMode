package com.Coco.adapter.objectAdapter;

//适配器类
public class VoltageAdapter  implements IVoltage5V {

    private Voltage220V voltage220V;

    //通过构造器传入 Voltage220V 实例,
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;

        if (voltage220V != null) {
            //获得源220V电压
            int srcV = voltage220V.output220V();

            //适配后的目标电压
            dstV = srcV / (srcV / 5);

            System.out.println("使用对象适配器进行适配! 输出电压为:" + dstV + "伏.");
        }


        return dstV;
    }
}
