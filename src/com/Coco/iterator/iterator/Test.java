package com.Coco.iterator.iterator;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建学院列表
        ArrayList<College> college = new ArrayList<>();

        //创建相应的系
        Computer computer = new Computer();
        CivilEngineering civilEngineering = new CivilEngineering();

        //将系添加到学校中
        college.add(computer);
        college.add(civilEngineering);

        //创建输出类
        Outputs outputs = new Outputs(college);

        outputs.printCollege();
    }
}
