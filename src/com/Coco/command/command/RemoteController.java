package com.Coco.command.command;

//遥控器
public class RemoteController {
    //开关按钮的命令数组
    Command[] onCommand;
    Command[] offCommand;

    //撤销命令
    Command undoCommand;

    //构造器
    public RemoteController() {
        //暂时先设置5个智能家电的遥控
        onCommand = new Command[5];
        offCommand = new Command[5];

        //初始化遥控按钮
        for (int i = 0; i < onCommand.length; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
    }

    //设置按钮控制的家电
    public void setCommand(int no, Command onCommand, Command offCommand) {
        if (no > this.onCommand.length - 1) {
            System.out.println("设置失败! 遥控器没有" + no + "个按钮! 请重试!" );
            return;
        }
        this.onCommand[no] = onCommand;
        this.offCommand[no] = offCommand;
    }

    //当对应家电的开按钮被按下
    public void onButtonWasPushed(int no) {
        if (no > this.onCommand.length - 1) {
            System.out.println("打开失败! 没有" + no + "号按钮! 请重试!" );
            return;
        }

        //找到按下的家电, 并调用对应的 开 方法
        onCommand[no].execute();

        //记录本次操作, 用于撤销
        undoCommand = onCommand[no];
    }

    //当对应家电的关按钮被按下
    public void offButtonWasPushed(int no) {
        if (no > this.onCommand.length - 1) {
            System.out.println("关闭失败! 没有" + no + "号按钮! 请重试!" );
            return;
        }

        //找到按下的家电, 并调用对应的 关 方法
        onCommand[no].undo();

        //记录本次操作, 用于撤销
        undoCommand = offCommand[no];
    }

    //撤销按钮被按下
    public void undoButtonPushed() {
        undoCommand.undo();
    }
}
