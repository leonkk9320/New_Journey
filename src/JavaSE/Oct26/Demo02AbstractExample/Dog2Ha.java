package JavaSE.Oct26.Demo02AbstractExample;

public class Dog2Ha extends Dog{
    //对于本类的上一个父类，有一个抽象方法没写（该方法其实来自本类的父类的父类），完成唯一需要重写的抽象类
    //因此该类是一个普通类
    @Override
    public void sleep() {
        System.out.println("嘿嘿嘿。。。");
    }
}
