package com.Coco.command.command.light;

import com.Coco.command.command.Command;

//关灯命令
public class LightOffCommand implements Command {
    private LightReceiver light;

    //构造器
    public LightOffCommand(LightReceiver receiver) {
        light = receiver;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
