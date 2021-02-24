package com.Coco.adapter.interfaceAdapter;

public class Test {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            //只去实现我们关心的方法, 即我们需要使用的方法.
            //例如我们只关心method1

            @Override
            public void method1() {
                System.out.println("具体实现并使用method1");
            }
        };

        absAdapter.method1();
    }
}
