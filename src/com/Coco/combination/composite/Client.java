package com.Coco.combination.composite;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        //学校
        OriganizationComponent university = new University("清华大学", "中国顶尖的大学!");

        //学院...
        OriganizationComponent college1 = new College("计算机学院", "学计算机很好,薪资高!");
        OriganizationComponent college2 = new College("土木工程学院", "土木工程也很好,可以......");

        //系, 专业
        college1.add(new Department("软件工程系", "软件工程系是计算机学院的王牌系!"));
        college1.add(new Department("网络工程系", "网络工程系是计算机安全的命脉!"));
        college1.add(new Department("计算机科学与技术", "计算机科学与技术老牌专业!"));

        college2.add(new Department("土木工程1","土木工程1>>>>>>>>"));
        college2.add(new Department("土木工程2","土木工程2>>>>>>>>"));
        college2.add(new Department("土木工程3","土木工程3>>>>>>>>"));
        college2.add(new Department("土木工程4","土木工程4>>>>>>>>"));

        //将学院加入学校
        university.add(college1);
        university.add(college2);

        university.print();
    }
}
