package com.Coco.state.money;

public class Test {
    public static void main(String[] args) {
        //创建 context 对象
        Context context = new Context();

        //将当前状态设置为 PublishState
        context.setState(new PublishState());
        System.out.println(context.getCurrentState());

        //Publish ---> notPay
        context.acceptOrderEvent(context);

        //notPay ---> paid
        context.payOrderEvent(context);

        //检测到失败时, 抛出异常
        try {
            context.checkFailEvent(context);
            System.out.println("流程正常执行...");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
