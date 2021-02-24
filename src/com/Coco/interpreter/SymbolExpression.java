package com.Coco.interpreter;

import java.util.HashMap;

/**
 * 抽象 运算符号解析器, 这里每个运算符号都只和自己左右两个数字相关,
 * 但左右两个数字可能也是一个解析的结果, 无论何种类型, 都是 Expression 类的实现类
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为 SymbolExpression 是一个抽象类, 因此 interpreter 是一个默认实现(空实现)
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
