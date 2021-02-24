package com.Coco.command.command.tv;

import com.Coco.command.command.Command;

//关电视机命令
public class TvOffCommand implements Command {
    private TvReceiver tv;

    //构造器
    public TvOffCommand(TvReceiver receiver) {
        tv = receiver;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
