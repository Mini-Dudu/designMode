# 桥接模式

### 节基本介绍

1. 是一种结构型设计模式.
2. 桥接模式是指: 将实现与抽象放在两个不同的类层次中, 是两个层次可以独立改变.
3. Bridge 是基于 **类的最小设计原则** , 通过使用封装、聚合、继承等行为让不同的类承担不同的职责。 它的主要特点是把 **抽象**(Abstraction) 与 **行为实现** (Implementation) 分离开来, 从而可以保持各部分的独立性以及应对它们的功能扩展.



### 注意事项与细节

1. 实现了**抽象和实现的部分的分离**, 从而极大的提供了系统的灵活性, 让抽象部分和实现部分独立开来, 这有助于系统进行分层设计, 从而**产生更好的结构化系统**.
2. 对于系统的高层部分, 只需要知道抽象部分和实现部分的接口就行了, 其它的部分由具体业务来完成.
3. 桥接模式**替代多层继承**方案, 可以**减少子类的数量**, 降低系统的管理和维护成本.
4. 桥接模式的引入**增加了系统的理解和设计难度**, 由于**聚合关联关系**建立在抽象层, 要求开发者针对抽象进行设计和编程.
5. 桥接模式**要求正确识别出系统中两个独立变化的维度**, 因此其使用范围有一定的局限性, 即需要有这样的应用场景.



### 应用场景

* 对于那些**不希望使用继承**或因为**多层继承导致系统类的个数急剧增加**的系统, 桥接模式又为适用.

* 常见的应用场景:

  * JDBC 驱动程序

  * 银行转账系统

    转账分类: 网上转账、柜台转账、ATM转账.

    转账用户类型: 普通用户、银卡用户、金卡用户……

  * 消息管理

    消息类型: 即时消息、延时消息.

    消息分类: 手机短信、邮件消息、QQ消息……