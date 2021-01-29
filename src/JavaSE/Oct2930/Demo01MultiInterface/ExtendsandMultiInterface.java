package JavaSE.Oct2930.Demo01MultiInterface;

/*
使用接口时要注意：
1. 接口没有构造方法或静态代码块, 抽象类有
2. 一个类父类唯一，但可以实现多个接口 //MyinterfaceA, MyinterfaceB, MyinterfaceImpl
3. 如果实现类所实现的多个接口当中，存在重复的抽象方法， 那么只需要覆盖重写一次即可 //MyinterfaceA, MyinterfaceB, MyinterfaceImpl
4. 如果实现类 没有覆盖重写 所有接口当中的 所有抽象方法，那么实现类就必须是一个抽象类 //MyinterfaceA, MyinterfaceB, MyinterfaceImpl
5. 如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写 //MyinterfaceA, MyinterfaceB, MyinterfaceImpl
6. 一个类直接父类的方法，和接口当中的默认方法产生冲突，会优先使用父类当中的方法 // Fu Zi InterfaceFor6
 */
public class ExtendsandMultiInterface {
    public static void main(String[] args) {
        MyinterfaceImpl impl = new MyinterfaceImpl();
        impl.methodA();//2
        impl.methodB();

        System.out.println("========");

        impl.methodCommon();//3

        System.out.println("========");

        impl.methodDefault();//5

        System.out.println("==========");

        Zi zi = new Zi();//6
        zi.method();
    }
}
