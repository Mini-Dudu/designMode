package com.Coco.flyweight.flyweight;

import java.security.PublicKey;
import java.util.HashMap;

//网站工厂类, 根据需要返回一个网站
public class WebSiteFactory {
    //集合, 充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型, 返回一个网站, 如果没有就创建一个网站, 并放入池中
    public WebSite getWebSiteCategory(String type) {
        if(!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    //获取池中网站分类的总数
    public int getWebSiteCount() {
        return pool.size();
    }
}
