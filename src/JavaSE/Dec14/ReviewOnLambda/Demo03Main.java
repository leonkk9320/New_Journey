package JavaSE.Dec14.ReviewOnLambda;
/*
    函数式接口的使用：作为方法的参数和返回值使用
 */
public class Demo03Main {
    public static void show(Demo01FunctionalInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，可以传递接口的实现类对象
        show(new Demo02FunctionalInterfaceimpl());

        //传递接口的匿名内部类
        show(new Demo01FunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写接口中的抽象方法");
            }
        });

        //传递lambda表达式
        show(() -> System.out.println("lambda表达式重写接口中的抽象方法"));
    }
}
