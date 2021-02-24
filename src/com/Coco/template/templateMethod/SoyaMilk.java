package com.Coco.template.templateMethod;

//抽象类, 表示豆浆
public abstract class SoyaMilk {
    //模板方法, 可以做成 final, 不让子类覆盖
    public final void make() {
        select();
        if(isAdd()) {
            add();
        }
        soak();
        beat();
    }

    //方法可以是抽象的, 也可以是非抽象的; 是具体情况而定.

    //选材
    public void select() {
        System.out.println("选择上号的新鲜大豆!");
    }

    //添加配料, 抽象方法, 子类具体实现.
    public abstract void add();

    //浸泡
    public void soak() {
        System.out.println("浸泡制作豆浆的材料! 2小时...");
    }

    //打碎
    public void beat() {
        System.out.println("打碎制作豆浆!");
    }

    //钩子方法, 例如对是否添加配料增加钩子方法,
    boolean isAdd() {
        return true;
    }
}
