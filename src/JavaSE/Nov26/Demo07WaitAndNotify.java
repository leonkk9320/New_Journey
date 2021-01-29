package JavaSE.Nov26;
/*
Timed_Waiting:
1.sleep(long m)，时间结束后进入Runnable/Blocked状态，且在等待期间【不】释放锁
2.wait(long m)，时间结束前可以被唤醒，若时间结束了还没有被唤醒，进入Runnable/Blocked状态，且在等待期间释放锁

唤醒方法：
notify(); 唤醒在此对象监视器(锁对象)上等待的单个线程（多个的话就是随机一个）
notifyAll(); 唤醒在此对象监视器上等待的所有线程
 */
public class Demo07WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        //创建顾客线程1
        new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized (obj){
                    System.out.println("1告知包子种类和数量");
                    //无限等待
                    try {
                        obj.wait();//睡眠
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了，1开吃！");
                }
            }
        }).start();

        //创建顾客线程2
        new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized (obj){
                    System.out.println("2告知包子种类和数量");
                    //无限等待
                    try {
                        obj.wait();//睡眠
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了，2开吃！");
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
                    obj.notifyAll();//唤醒
                }
            }
        }).start();
    }
}
