package JavaSE.Oct26.Demo04Interface.Part1;

/*
接口就是代码当中的公共规范。
接口是一种引用数据类型，最重要的就是其中的抽象方法
定义接口：
public interface 接口名称{
    //接口内容
}

备注：换成了关键字interface之后，编译生成的字节码文件仍是：.java -> .class

如果是Java7,那么接口可以包含的内容有：
1.常量
2.抽象方法

如果是Java8，还可以额外拥有：
3.默认方法
4.静态方法

如果是Java9，还可以额外拥有：
5.私有方法

接口使用步骤：
1. 不能直接使用，必须有一个"实现类"来"实现"接口
格式：
public Class 实现类名称 implements 接口名称{
    //...
}
2. 接口的实现类必须覆盖重写（实现）接口中所有的抽象方法
实现：去掉abstract关键字，加上方法体大括号
3.创建实现类，进行使用

注意事项：
如果实现类没有覆盖重写所有抽象方法，那么这个实现类就必须是抽象类
*/
public class Interface {
    public static void main(String[] args) {
        //MyInterfaceAbstract inter = new MyInterfaceAbstract(); 错！接口不可

        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.m1();
        impl.m2();
        impl.m3();
        impl.m4();
    }
}
