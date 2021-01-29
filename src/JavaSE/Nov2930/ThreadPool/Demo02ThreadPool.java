package JavaSE.Nov2930.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
线程池：JDK 1.5之后提供的
java.util.concurrent.Executors: 线程池工厂类，用来生产线程池
 */

public class Demo02ThreadPool {
    public static void main(String[] args) {
        //1.使用线程池工厂类Executors里面提供的静态方法newFixedThreadPool生产一个指定线程池数量的线程池
        //ExecutorService 是一个接口， es是接口实现类对象
        ExecutorService es = Executors.newFixedThreadPool(2);

        //3.调用ExecutorService中的方法submit，传递线程任务（实现类），开启线程，执行run方法
        //线程池会【一直开启】，使用完了线程，会自动把线程归还给线程池，线程可以继续使用
        es.submit(new Runnableimpl());
        es.submit(new Runnableimpl());
        es.submit(new Runnableimpl());

        //4.关闭线程池（不建议执行）
        es.shutdown();
    }
}
