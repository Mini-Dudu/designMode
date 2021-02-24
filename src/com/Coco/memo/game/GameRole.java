package com.Coco.memo.game;

//游戏角色
public class GameRole {
    //攻击力
    private int attack;

    //防御力
    private int phylactic;

    //构造器
    public GameRole(int attack, int phylactic) {
        this.attack = attack;
        this.phylactic = phylactic;
    }

    //根据当前的游戏角色的状态创建 Memento
    public Memento createMemento() {
        return new Memento(attack, phylactic);
    }

    //从备忘录对象, 恢复游戏角色的状态
    public void recordsGameRoleFromMemento(Memento memento) {
        this.attack = memento.getAttack();
        this.phylactic = memento.getPhylactic();
    }

    //显示当前游戏角色的属性
    public void show() {
        System.out.println("攻击力: " + this.attack + "  防御力: " + this.phylactic);
        System.out.println();
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getPhylactic() {
        return phylactic;
    }

    public void setPhylactic(int phylactic) {
        this.phylactic = phylactic;
    }
}
