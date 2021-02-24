#简单工厂模式
### 基本介绍

* 简单工厂属于创建型模式, 是工厂模式的一种,简单工厂模式是由一个工厂对象决定创建出哪一种品类的实例.
  * 简单工厂是工厂模式家族中最简单使用的模式.
* 简单工厂模式: 定义了一个创建对象的类, 由这个类来 **封装实例化对象的行为** (的代码).
* 在软件开发中, 当我们会用到大量的创建某种、某类或者某批对象对象时，就会使用到工厂模式.



### 说明

* 简单工厂模式也叫静态工厂模式,即将 simpleFactory 中的 createPizza 设置成静态方法,然后 OrderPizza 类中只需要如下写也可实现简单工厂模式. 调用OrderPizza方法也无需传参.

  ```
  public OrderPizza(){
       //用户输入的 Pizza 类型
          String type = "";

         type = getType();
          pizza = simpleFactory.createPizza(type);
          
          if (pizza != null) {
              //输出 Pizza 制作过程
              pizza.prepare();
              pizza.bake();
              pizza.cut();
              pizza.box();
          } else {
              System.out.println("订购失败!");
          }
  }

  //获取用户想要订购的 Pizza
      private String getType() {
          try {
              BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("input Pizza Type:");
              String str = strIn.readLine();
              return str;
          } catch (IOException e) {
              e.printStackTrace();
              return "";
          }
      }
  ```

  ​