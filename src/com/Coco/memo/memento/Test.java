package com.Coco.memo.memento;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        originator.setState("状态*1 攻击力:100");

        //保存当前状态
        caretaker.add(originator.saveStateMemento());


        //玩游戏的过程状态改变
        originator.setState("状态*2 攻击力:37");
        //保存当前状态
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态*3 攻击力:250");
        //保存当前状态
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前的状态:" + originator.getState());

        //恢复状态到 状态2
        originator.getStateFromMemento(caretaker.getMemento(1));

        System.out.println("恢复后的状态: " + originator.getState());


        /**
         * 说明:
         * 1. originator: 对象(需要保存状态的对象)
         * 2. Memento 备忘录对象, 负责保存记录, 即保存Originator内部状态
         * 3. Caretaker: 守护者对象, 负责保存多个备忘录对象, 使用集合管理, 提高效率
         * 4. 如果希望保存多个 originator 对象的不同时间的状态, 也可以, 使用 HashMap<String, 集合>即可
         */

    }
}
