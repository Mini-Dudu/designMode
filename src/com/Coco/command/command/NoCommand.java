package com.Coco.command.command;

//空命令. 没有任何命令, 用于初始化每个遥控器按钮, 当调用空命令时, 什么都不做,
//这也是一种设计模式, 可以沈略对空的判断
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
