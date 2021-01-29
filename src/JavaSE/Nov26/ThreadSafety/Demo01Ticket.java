package JavaSE.Nov26.ThreadSafety;
//卖票案例
/*
共享了同一个Runnable实现类，【共享票源】，意味着会出现安全问题
出现安全问题：出现了重复的票和不存在的票
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        Runnableimpl run = new Runnableimpl();

        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();
    }
}
