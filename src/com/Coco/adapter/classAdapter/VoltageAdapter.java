package com.Coco.adapter.classAdapter;

//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获得源220V电压
        int srcV = output220V();

        //适配后的目标电压
        int dstV = srcV / (srcV / 5);

        return dstV;
    }
}
