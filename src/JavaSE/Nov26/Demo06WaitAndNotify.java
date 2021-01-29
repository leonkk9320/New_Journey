package JavaSE.Nov26;
/*
等待唤醒案例：线程之间的通信
    创建一个顾客线程（消费者）：告知老板要的包子数量和种类，调用wait()方法，放弃CPU执行，进入Waiting状态（无限等待）
    创建一个老板线程（生产者）：花了5秒钟做包子，做好了之后，调用notify()方法，唤醒顾客吃包子

注意：
    顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
    同步使用的锁对象必须是唯一
    只有锁对象可以调用wait和notify方法

Object类中的方法：
    void wait() 会释放锁，让其他线程抢夺锁
    void notify()
 */
public class Demo06WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        //创建顾客线程
        new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized (obj){
                    System.out.println("告知包子种类和数量");
                    //无限等待
                    try {
                        obj.wait();//睡眠
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了，开吃！");
                }
            }
        }).start();

        //创建老板线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                //花了5秒做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("老板5秒钟之后做好包子，告知顾客可以吃了");
                    obj.notify();//唤醒
                }
            }
        }).start();
    }
}

/*
老板在执行同步代码块之前先睡了5秒，
因此，顾客先执行，顾客得到锁，调用wait()进入等待状态 并 释放锁
老板抢得锁，老板做包子并调用notify()唤醒顾客
 */
