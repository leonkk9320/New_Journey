package JavaSE.Oct26.Demo04Interface.Part2Default;
/*
1.接口的默认方法，可以通过接口实现类的对象，直接调用
2.接口的默认方法，可以被接口实现类覆盖重写

 */
public class MyinterfaceMain {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodA();
        //默认类方法，如果实现类当中没有，会向上找接口
        a.methodAA();
        System.out.println("=======");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodA();
        //默认类方法，如果实现类当中没有，会向上找接口
        b.methodAA();
    }
}
