package com.Coco.command.command.tv;

import com.Coco.command.command.Command;

//开灯命令
public class TvOnCommand implements Command {
    private TvReceiver tv;

    //构造器
    public TvOnCommand(TvReceiver receiver) {
        tv = receiver;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
