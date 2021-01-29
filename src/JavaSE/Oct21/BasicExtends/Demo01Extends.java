package JavaSE.Oct21.BasicExtends;

/*
继承！
在继承的关系中，"子类就是一个父类"，也就是说，子类可以当作一个父类来看。
i.e.父类是员工，子类是讲师，那么"讲师就是一个员工" 关系：is a

父类定义：（与普通类一模一样）
public class 父类名称{
    //...
}
子类定义：
public class 子类名称 extends 父类名称{
    //...
}
*/
public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //teacher 类当中什么也没写，继承employee方法
        teacher.method();
        //另一个子类对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
