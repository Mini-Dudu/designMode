package com.Coco.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    //表达式
    private Expression expression;

    //构造函数, 传参并解析
    public Calculator(String expStr) {
        //安排运算栈先后顺序
        Stack<Expression> stack = new Stack<>();

        //将表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;

        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //如果是一个变量, 就创建一个 VarExpression 对象, 并 push 到 stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个 charArray 数组后, stack 就得到了最后的 Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //最后将表达式(a+b) 和 var{a=10, b=20} 绑定
        //然后传递给 expression 的 interpreter 进行解析执行
        return this.expression.interpreter(var);
    }
}
