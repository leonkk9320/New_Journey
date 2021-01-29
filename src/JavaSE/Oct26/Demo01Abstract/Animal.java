package JavaSE.Oct26.Demo01Abstract;
/*
抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束。
抽象类：抽象方法所在类，必须是抽象类。 在class前加abstract即可。

如何使用抽象类和抽象方法：
1. 不能直接new抽象类对象。 可以创建猫，狗，不能创建动物
2. 必须用一个子类继承抽象的父类
3. 子类必须覆盖重写抽象父类当中所有抽象方法。
覆盖重写（实现）：子类去掉抽象方法abstract关键字，然后补上方法体大括号
4. 创建子类对象进行使用。
 */
public abstract class Animal {
    //抽象类构造方法只能在子类构造方法中super()执行
    public Animal(int i ){
        System.out.println("抽象类构造方法执行！");
    }
    public abstract void eat();//猫吃鱼，狗吃屎，不能具体确定动物吃什么

    public void normalMethod(){
        System.out.println("普通方法仍可写！");
    }
}
