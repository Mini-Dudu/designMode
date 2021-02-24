package com.Coco.command.command;

//命令接口
public interface Command {
    //执行动作
    public void execute();

    //撤销
    public void undo();
}
