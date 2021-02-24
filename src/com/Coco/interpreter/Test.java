package com.Coco.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);

        System.out.println("运算结果: " + expStr + " = " + calculator.run(var));
    }

    //获取输入表达式
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式: ");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    //获取值映射
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入 " + String.valueOf(ch) + " 的值");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
//                else {
//                    System.out.println("重复的表达式变量 " + String.valueOf(ch));
//                    return null;
//                }
            }
        }
        return map;
    }
}
