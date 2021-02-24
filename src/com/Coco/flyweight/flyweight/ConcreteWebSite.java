package com.Coco.flyweight.flyweight;

//具体的网站
public class ConcreteWebSite extends WebSite {
   //发布形式,内部状态
    public String type = "";

    public ConcreteWebSite(String type) {
       this.type = type;
    }

   @Override
   public void use(User user) {
      System.out.println("网站的发布形式为: " + type +"\n" +user +": 正在使用中...");
   }
}
