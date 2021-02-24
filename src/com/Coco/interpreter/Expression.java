package com.Coco.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式, 通过HashMap 键值对, 可以获取到变量的值
 */
public abstract class Expression {
    // a+b-c
    //解释公式和数值, key 解释公式(表达式) 参数[a, b, c] value就是具体的值
    //例如: HashMap {a=10, b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
