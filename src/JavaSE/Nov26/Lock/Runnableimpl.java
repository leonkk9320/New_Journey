package JavaSE.Nov26.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
解决线程安全问题的第三种方法：使用Lock锁
java.util.concurrent.locks.Lock
Lock实现提供了比使用 synchronized 方法和语句可获得更广泛的锁定操作。
Lock接口中的方法：
    void lock()获取锁
    void unlock()释放锁

    java.util.concurrent.locks.ReentrantLock implements Lock 接口
使用步骤：
    1.在成员位置创建一个ReentrantLock对象
    2.在可能出现安全问题的代码前调用Lock接口中的方法lock获取锁
    3.在可能出现安全问题的代码后调用Lock接口中的方法unlock释放锁
 */
public class Runnableimpl implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    //设置线程任务：卖票
    @Override
    public void run() {
        while (true) {
//            //2.在可能出现安全问题的代码前调用Lock接口中的方法lock获取锁
//            l.lock();
//
//            if(ticket > 0){
//                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
//                ticket--;
//            }
//
//            //3.在可能出现安全问题的代码后调用Lock接口中的方法unlock释放锁
//            l.unlock();

            /*
            高级写法

            无论是否出现异常，锁都会被释放掉

            Java 中的 Finally 关键一般与try一起使用，在程序进入try块之后，
            无论程序是因为异常而中止或其它方式返回终止的，finally块的内容一定会被执行。
            */
            try {
                l.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }finally {
                l.unlock();
            }
        }
    }
}
