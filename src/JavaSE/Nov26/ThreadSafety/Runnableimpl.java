package JavaSE.Nov26.ThreadSafety;

public class Runnableimpl implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;
    //设置线程任务：卖票
    @Override
    public void run() {
        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
