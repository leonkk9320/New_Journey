package JavaSE.Nov24;
/*
public static void sleep(long millis): 使当前正在执行的线程以指定的毫秒数暂停，毫秒结束后继续执行
 */
public class Demo06Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i <= 60; i++) {
            System.out.println(i);

            //sleep方法让程序睡眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
