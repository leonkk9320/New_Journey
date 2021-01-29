package JavaSE.Nov24.ThreadGetName;

public class Main {
    public static void main(String[] args) {
        Demo05MyThread mt = new Demo05MyThread();
        mt.start();
        new Demo05MyThread().start();
        new Demo05MyThread().start();

        //main方法没有继承Thread，不能使用getName()方法，必须先获取对象，再getName()
        System.out.println(Thread.currentThread().getName());//main 非本类当中静态方法，需要用类名调用
    }
}
