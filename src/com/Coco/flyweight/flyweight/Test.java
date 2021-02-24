package com.Coco.flyweight.flyweight;

public class Test {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        //客户需要一个以新闻形式发布的网站
        WebSite web = factory.getWebSiteCategory("新闻");
        web.use(new User("Coco"));

        //客户需要一个以新闻形式发布的网站
        web = factory.getWebSiteCategory("博客");
        web.use(new User("Dudu"));

        //客户需要一个以新闻形式发布的网站
        web = factory.getWebSiteCategory("微博");
        web.use(new User("冰糖"));

        System.out.println("网站形式的总数: " + factory.getWebSiteCount());
    }
}
