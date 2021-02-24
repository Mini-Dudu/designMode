package com.Coco.command.command;

import com.Coco.command.command.light.LightOffCommand;
import com.Coco.command.command.light.LightOnCommand;
import com.Coco.command.command.light.LightReceiver;
import com.Coco.command.command.tv.TvOffCommand;
import com.Coco.command.command.tv.TvOnCommand;
import com.Coco.command.command.tv.TvReceiver;

public class Test {
    public static void main(String[] args) {
        //使用命令模式, 完成通过遥控器, 对点灯的控制

        //创建电灯对象(接收者)
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //创建遥控器
        RemoteController remoteController = new RemoteController();

        //给遥控器设置命令
        //例如 no = 0 是点灯的开关操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("---------按下灯的开按钮---------");
        remoteController.onButtonWasPushed(0);

        System.out.println("---------按下灯的关按钮---------");
        remoteController.offButtonWasPushed(0);

        System.out.println("---------按撤销按钮---------");
        remoteController.undoButtonPushed();


        //创建电灯对象(接收者)
        TvReceiver receiver = new TvReceiver();

        //创建电视机的开关命令
        final TvOnCommand tvOnCommand = new TvOnCommand(receiver);
        TvOffCommand tvOffCommand = new TvOffCommand(receiver);

        //给遥控器设置命令
        //例如 no = 1 是电视机的开关操作
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("---------按下电视的开按钮---------");
        remoteController.onButtonWasPushed(1);

        System.out.println("---------按下电视的关按钮---------");
        remoteController.offButtonWasPushed(1);

        System.out.println("---------按撤销按钮---------");
        remoteController.undoButtonPushed();
    }
}
