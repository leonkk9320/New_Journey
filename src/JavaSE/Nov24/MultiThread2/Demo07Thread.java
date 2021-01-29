package JavaSE.Nov24.MultiThread2;
/*
创建多线程程序的第二种方式： 实现Runnable接口
java.lang.Runnable
java.lang.Thread类的构造方法
    Thread(Runnable target) 分配新的Thread对象
    Thread(Runnable target, String name) 分配新的Thread对象

实现步骤：
    1.创建Runnable接口的实现类
    2.在实现类中重写Runnable接口的run方法，设置任务线程
    3.创建一个Runnable接口的实现类对象
    4.创建Thread类对象，构造方法中传递Runnable接口实现类对象
    5.调用Thread类中的start方法，开启新线程执行run()方法


    实现Runnable接口创建多线程程序的好处：
    1.避免了单继承的局限性
        类继承了Thread类，就不能继承其他的类了
        实现Runnable接口，还可以继承其他类，实现其他接口
    2.增强了程序的扩展性，降低了耦合性（解耦）
        实现Runnable接口，把 设置线程任务（override run()） 和 开启新线程（start()） 进行了分离
        比如说：
            Thread t1 = new Thread(new impl1());
            t1.start();
            Thread t2 = new Thread(new impl2());
            t2.start();
            //impl1 impl2的重写run()内容不同，那么就可以干不同的事情，设置任务和开启线程不再绑定
            ===========================================================================================
            Thread t3 = new Thread();
            t3.start();
            //t3【只能】进行创建的Thread子类的run()方法

 */
public class Demo07Thread {
    public static void main(String[] args) {
        //3.创建一个Runnable接口的实现类对象
        Runnableimpl run = new Runnableimpl();

        //4.创建Thread类对象，构造方法中传递Runnable接口实现类对象
        Thread t = new Thread(run);

        //5.调用Thread类中的start方法，开启新线程执行run()方法
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
