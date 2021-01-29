package JavaSE.Nov24.AnonymousInnerClassThread;
/*
匿名内部类实现线程的创建
作用：简化代码
    把子类继承父类，重写父类方法，创建子类对象，合成一步完成
 */
public class Demo08AICThread {
    public static void main(String[] args) {
        //Thread 类
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "Thread" + i);
                }
            }
        };
        t.start();

        //Runnable 接口
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->"  + "Runnable"+i);
                }
            }
        };
        new Thread(r).start();

        //疯狂套娃版
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->"  + "套娃"+i);
                }
            }
        }).start();

    }
}
