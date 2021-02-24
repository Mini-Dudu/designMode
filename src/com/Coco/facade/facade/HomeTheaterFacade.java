package com.Coco.facade.facade;

//外观类
public class HomeTheaterFacade {
    //定义各个子系统的对象
    private Lamplight lamplight;
    private DVD dvd;
    private Projector projector;
    private Popcorn popcorn;
    private Stereo stereo;
    private Screen screen;

    //构造器
    public HomeTheaterFacade() {
        this.lamplight = Lamplight.getInstance();
        this.dvd = DVD.getInstance();
        this.projector = Projector.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.screen = Screen.getInstance();
    }

    //操作分四步

    //准备
    public void ready() {
        popcorn.on();
        popcorn.player();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvd.on();
        lamplight.on();
        lamplight.luminance(-10);
    }

    //播放
    public void play() {
        popcorn.player();
        dvd.player();
    }

    //暂停
    public void pause() {
        dvd.player();
    }

    //结束
    public void end() {
        popcorn.off();
        screen.up();
        projector.off();
        stereo.off();
        dvd.off();
        lamplight.luminance(10);
        lamplight.off();
    }
}
