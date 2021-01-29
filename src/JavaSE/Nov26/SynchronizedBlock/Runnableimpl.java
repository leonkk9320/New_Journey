package JavaSE.Nov26.SynchronizedBlock;
/*
解决线程安全问题
方案1：使用同步代码块
格式：
    synchronized(锁对象){
        可能出现线程安全问题的代码（访问了共享数据的代码）
    }

注意：
    1.同步代码块中的锁对象，可以使用任意对象
    2.但是必须保证多个线程使用的锁对象是同一个
    3.锁对象的作用：把同步代码块锁住，只让一个线程在同步代码块执行
 */
public class Runnableimpl implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //创建锁对象
    Object obj = new Object();

    //设置线程任务：卖票
    @Override
    public void run() {
        while(true){
            synchronized (obj){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
/*
t0 t1 t2抢夺CPU执行权。
t1抢到了，t1开始判断有没有锁对象。有!           同时，t2, t0可能在t1执行时候抢到了执行权
获取锁锁对象，执行代码块。                     判断没有锁对象（被t1获取），进入阻塞状态
出了同步代码块，释放锁对象。

t0 t1 t2抢夺CPU执行权。
...

同步保证了只有一个线程在同步中执行共享数据，保证了安全
程序频繁的【判断锁】，【获取锁】， 【释放锁】，降低效率
 */