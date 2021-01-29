package JavaSE.Nov02.Demo01NestedInnerClass;

/*
如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类
例如：身体和心脏，汽车和发动机

分类：
1. 成员内部类
2. 局部内部类（包含匿名内部类）

成员内部类格式：
修饰符 class 外类名称{
    修饰符 class 内类名称{
    //...
    }
    //...
}
注意： 内用外，随意访问；外用内，需要内部类对象（心脏可以给身体其他器官提要求，身体其他部件不能随便进入心脏）
======================
如何使用成员内部类？两种方法：
1. 间接方式：在外部类的方法中，使用内部类，然后main只是调用外部类的方法
2. 直接方式：公式：
类名称 对象名 = new 类名称（）；
【外部类名称.内部类名称 对象名 = new 外部类名称().new内部类名称();】其实就是【外.内】
 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();

        System.out.println("=========");

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
