package JavaSE.Nov24.MultiThread;
/*
创建多线程的第一种方式：创建Thread类的子类
java.lang.Thread: 描述线程的类，想实现多线程程序，必须继承Thread类

实现步骤：
    1.创建Thread类子类
    2.在子类当中重写Thread类中的run方法，设置线程任务（开启线程要做什么）
    3.创建Thread类子类的对象
    4.调用Thread类中的start方法，开启新的线程，执行run方法。
        void start() 使得该线程开始执行；Java虚拟机调用该线程的run方法
        结果是两个线程并发运行；当前线程（main）和另一线程（创建的新线程，执行run方法）
        多次启动一个线程是非法的。特别是当前线程结束以后，不能再重新启动
 */
public class Demo04Thread {
    public static void main(String[] args) {
        //3.创建Thread类子类的对象
        MyThread mt = new MyThread();//开辟了新路径（新线程）

        //4.调用Thread类中的start方法，开启新的线程，执行run方法。
        mt.start();

        /*
        run()是在当前线程（main线程）执行run()
        start()会【先】创建新的栈空间，【再】在新的栈空间执行run()
         */

        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }
    }
}
/*
JVM 执行main方法，找OS开辟一条main通向CPU的路径（main线程 or 主线程）
new MyThread() 开辟一条通向CPU的新路径，来执行run方法

对于CPU而言：两个线程一起抢夺CPU执行权（执行时间），谁抢到谁执行，所以就有随机打印的结果
 */
