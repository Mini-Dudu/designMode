package com.Coco.memo.game;

//备忘录对象
public class Memento {
    //攻击力
    private int attack;

    //防御力
    private int phylactic;

    public Memento(int attack, int phylactic) {
        this.attack = attack;
        this.phylactic = phylactic;
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
