package JavaSE.Nov24.MultiThread;
//1. 创建Thread类子类
public class MyThread extends Thread{
    //2.在子类当中重写Thread类中的run方法，设置线程任务（开启线程要做什么）
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);
        }
    }
}
