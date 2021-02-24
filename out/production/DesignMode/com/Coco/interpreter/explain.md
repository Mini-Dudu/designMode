# 解释器模式


### 问题引出

* 四则运算问题
  * 通过解释器模式来实现四则运算, 如计算 a+b-c 的值(只考虑 +, -), 具体要求如下:
    1. 先输入表达式的形式, 例如: a+b+c-d+e, 要求表达式中的字母不能重复;
    2. 在分别输入 a, b, c, d, e 的值;
    3. 最后求出结果.



### 传统方法解决四则运算问题分析

1. 编写一个方法, 接收表达式, 然后根据用户输入的数值进行解析, 得到结果;
2. 问题分析: 
   * 如果加入新的运算符, 比如 *, / , (等等, 不利于扩展, 另外让一个方法来接卸会造成程序结构混乱, 不够清晰.
3. 解决方案: 
   * 考虑使用解释器模式, 即: 表达式 --> 解释器(可以有多种) --> 结果.



### 基本介绍

1. 在编译原理中, 一个算术表达式通过 **词法分析器** 形成词法单元, 而后这些词法单元在通过 **语法分析器** 构建语法分析树, 最终形成一棵抽象的语法分析树. 这里的词法分析器、语法分析器都可以看作是 解释器.
2. 解释器模式: 是指给定一个语言(表达式), 定义它的文法的一种表示, 并定义一个解释器 ,使用该解释器来解释语言中的句子(表达式).
3. **应用场景**:
   * 应用可以将一个需要解释执行的语言中的句子表示为一个抽象的语法树;
   * 一些重复出现的问题可以用一种简单的语言来表达;
   * 一个简单语法需要解释的场景;
4. 例如: **编译器**、**运算表达式计算**、**正则表达式**、**机器人**等.



### Spring 框架中的解释器模式

* Spring 框架中 SeplExpressionParse 就使用到了解释器模式



### 注意事项及细节

* 当有一个语言需要解释执行时, 可将该语言中的句子表示为一个抽象语法树, 就可以考虑使用解释器模式, 让程序具有良好的扩展性;
* 应用场景: **编译器**、**运算表达式计算**、**正则表达式**、**机器人**等.
* 解释器模式用于解决的**问题本身比较复杂**.可能会带来一下问题:
  * 解释器模式可能会引起类膨胀、解释器模式采用递归调用方法， 将会导致调试非常复杂、效率可能降低.


