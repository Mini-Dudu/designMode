package com.Coco.memo.game;

public class Test {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole(100, 100);

        System.out.println("大战前的状态:" );
        gameRole.show();


        //保存当前状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("大战中......");
        System.out.println();

        gameRole.setAttack(45);
        gameRole.setPhylactic(45);


        System.out.println("大战后的状态:");
        gameRole.show();


        //恢复状态
        gameRole.recordsGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后后的状态:");
        gameRole.show();

    }
}
