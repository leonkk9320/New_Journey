package JavaSE.Nov24.SingleThread;

/*
主线程：执行主（main）方法的线程。 CPU与栈内存中main方法的路径叫主线程。

单线程：java程序中只有一个程序
执行从main方法，由上到下依次执行
 */
public class Demo03Thread {
    public static void main(String[] args) {
        Person p1 = new Person("xiaoqiang");
        p1.run();

        //作为单线程程序，main线程报错，之后的p2.run();无法执行
        System.out.println(0/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero

        Person p2 = new Person("wangcai");
        p2.run();
    }
}
