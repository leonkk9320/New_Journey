package JavaSE.Nov26.SynchronizedMethods;
/*
解决线程安全问题
方案2：使用同步方法
步骤：
    1.把访问了共享数据的代码抽取出来，放到一个方法当中
    2.在方法上添加Synchronized修饰符
 */
public class Runnableimpl implements Runnable{
    //定义一个多个线程共享的票源
    private static int ticket = 100;

    //创建锁对象
    Object obj = new Object();

    //设置线程任务：卖票
    @Override
    public void run() {
        while(true){
               pay1();
        }
    }

    /*
    静态方法的锁不是this，
    this是创建对象之后产生的，静态方法优先于对象
    静态方法的锁对象是本类的class属性-->class文件对象（反射）
     */
    public static synchronized void pay1(){
        if(ticket > 0){
            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
            ticket--;
        }
    }


    /*
    同步方法会把方法内部的代码锁住
    只让一个线程执行
    同步方法的锁对象：
    就是实现类对象 new Runnableimpl()
    就是 this
     */
    public synchronized void pay(){
        if(ticket > 0){
            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}

