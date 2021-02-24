# 接口适配器



### 基本介绍

1. 一些书籍称**接口适配器模式**为 **缺省适配器模式.
2. 当**不需要全部实现接口提供的方法时**, 可先**设计**一个**抽象类实现接口**, 并为该接口中每一个方法提供一个**默认实现**(空方法),那么该抽象类的子类可以有选择地覆盖父类的某些方法来实现需求.
3. 适用于一个接口不想使用其所有方法的请况.




* Go语言框架中的接口适配器
  * Beego 框架中的 Controller 就使用到了接口适配器模式.
