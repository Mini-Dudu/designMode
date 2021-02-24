package com.Coco.iterator.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//土木工程系
public class CivilEngineering implements College {
    List<Department> departmentList;

    public CivilEngineering() {
        //为了测试方便; 这里直接写死
        departmentList = new ArrayList<Department>();
        addDepartment("房屋建筑", "房屋建筑很吃香");
        addDepartment("铁路建筑", "铁流建筑很吃香");
    }

    @Override
    public String getName() {
        return "土木工程系";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new civilIterator(departmentList);
    }
}
