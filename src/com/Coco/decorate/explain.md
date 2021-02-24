# 装饰者模式

### 问题引出

* 星巴克咖啡订单项目(咖啡馆)
  1. 咖啡种类/单品咖啡: Espresso (意大利浓咖啡)、ShortBlack、LongBlack (美式咖啡)、Decaf (无因咖啡)
  2. 调料: Milk、Soy(豆浆)、Chocolate
  3. 要求在扩展新的咖啡种类时， 具有良好的扩展性、改动方便、维护方便.
  4. 使用 OO 的来计算不同种类咖啡的费用: 客户可以点单品咖啡, 也可以点单品咖啡+调料组合.



### 传统解决方案一

* 类图:

  ![](E:\IdeaProjects\DesignMode\src\com\Coco\_img\咖啡问题方案一.png) 

* 问题分析

  1. Drink 是一个抽象类, 表示饮料.
  2. des 就是对咖啡的描述, 不如咖啡的名字.
  3. cost() 方法就是计算费用, Drink 类中做成一个抽象方法.
  4. Decaf 是单品咖啡, 继承 Drink 并实现 cost().
  5. Espresso && Milk 是单品咖啡+调料组合, 组合方式很多.
  6. 问题: 这样设计, 会有很多类, 当我们增加一个单品咖啡或者一个新的调料时, 类的数量会倍增,会出现类爆炸.



### 传统解决方案二

* 方案一因为 **单品咖啡 + 调味品** 组合会造成类的倍增, 因此可以做改进, 将调味品内置到 Drink 类中, 这样就不会造成类数量够多.从而提高项目的维护性.


* 类图:

  ![](E:\IdeaProjects\DesignMode\src\com\Coco\_img\咖啡问题方案二.png)

* 说明:

  调味品可以设计为 Boolean , 表示是否添加调味品, 或者设计为 int , 表示调味品的数量.

* 问题分析

  1. 可以控制类的数量, 不至于造成过多的类
  2. **在增加或者删除咖啡、调味品时代码的维护量还是很大.**
  3. 考虑到用户可以添加多分调料, 可以将hasMilk() 等返回一个对应 int.
  4. 解决方式: 使用装饰者模式. 



### 装饰者模式

* 基本介绍

  1. 装饰者模式: **动态** 的将新功能 **附加到对象上** . 在对象功能扩展方面, 它比继承更有弹性, 装饰者模式也体现了 **开闭原则** .
  2. 这里提到的 **动态的将新功能附加到对象** 和 **OCP原则** , 在后面的应用实例中会以代码的形式体现. 请注意体会.

* 原理

  1. 装饰者模式就像打包一个快递.

     主体 (被装饰者):例如陶瓷、衣服......

     包装 (装饰者): 例如报纸填充、塑料泡沫、纸板......

  2. 主体 (Component) : 类似前面方案中的 Drink

  3.  具体的主体 (ConcreteComponent) : 例如前面的单品咖啡

  4. 装饰者 (Decorator) : 例如各种调料

  5. 在如下图的 Component 与 ConcreteComponent 之间, 如果 ConcreteComponent 类很多, 还可以设计一个缓冲层, 将共有的部分提取出来, 抽象成一个类.

* 原理类图:

  ![](E:\IdeaProjects\DesignMode\src\com\Coco\_img\桥接模式原理类图2.png)

* 设计方案

  ![](E:\IdeaProjects\DesignMode\src\com\Coco\_img\装饰者模式设计方案.png) 

  * Drink 类就是前面说的抽象类, Component
  * ShortBlank 就是单品咖啡
  * Decorator 是一个装饰者类, 含有一个被装饰的对象 Drink
  * Decorator 的 cost() 方法进行费用的叠加计算, 递归的计算价格.

* 装饰者模式下的订单: 两份巧克力 + 一份牛奶的LongBlank

  ![](E:\IdeaProjects\DesignMode\src\com\Coco\_img\订单例子.png) 

  * 说明
    1. Milk 包含了 LongBlank
    2. 一份 Chocolate 包含了 (Milk + LongBlank)
    3. 一份 Chocolate 包含了 (Chocolate +Milk + LongBlank)
    4. 这样不管是什么形式的单品咖啡 + 调味品组合, 通过递归凡是可以方便的组合和维护.
