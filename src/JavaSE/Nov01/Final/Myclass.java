package JavaSE.Nov01.Final;
/*
public final class 类名称{
    //...
}

含义：当前类不能含有任何子类（太监类），一定有父类，至少object
注意：一个类如果是final 类，那么其中的所有成员方法都无法进行覆盖重写（因为没儿子）（当然 abstract 也不行）
 */
public final class Myclass {
    public void method(){
        System.out.println("方法执行");
    }
}
