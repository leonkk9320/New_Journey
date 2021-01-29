package JavaSE.Nov24.ThreadGetName;
/*
获取线程的名称：
    1.使用Thread类中的方法getName()
    2.可以现获取到当前正在执行的线程，使用线程中的getName()获取线程名称
        static Thread currentThread() 返回当前正在执行的线程对象的引用

 */
public class Demo05MyThread extends Thread{
    @Override
    public void run(){
//        String name = getName(); //使用父类方法
//        System.out.println(name);


//        Thread t = currentThread();
//        System.out.println(t);//Thread[Thread-0,5,main]
//        System.out.println(t.getName());

        System.out.println(currentThread().getName());//本类（或者父类）当中静态方法，不需要用类名可以直接调用
    }
}
