package com.Coco.interpreter;

import java.util.HashMap;

/**
 * 变量解析器
 */
public class VarExpression extends Expression {
    //key 为 a, b, c等变量
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    //var 是 HashMap
    //interpreter 根据 变量名返回对应的值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
