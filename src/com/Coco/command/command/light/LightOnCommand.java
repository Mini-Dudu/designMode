package com.Coco.command.command.light;

import com.Coco.command.command.Command;

//开灯命令
public class LightOnCommand implements Command {
    private LightReceiver light;

    //构造器
    public LightOnCommand(LightReceiver receiver) {
        light = receiver;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
