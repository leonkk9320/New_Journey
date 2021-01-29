package JavaSE.Nov28;
/*
包子线程和包子铺线程关系-->通信(互斥)
必须使用同步技术保证只有一个线程在执行
锁对象必须保证唯一，可以用包子对象作为锁对象
包子铺类和吃货类就需要把包子对象作为参数传递进来
    1.需要在成员位置创建一个包子变量
    2.使用带参数的构造方法，为包子变量赋值
 */
public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz){
        this.bz = bz;
    }

    @Override
    public void run(){
        int count = 0;
        for (int i = 0; i < 4; i++) {
            synchronized (bz){
                if(bz.flag == true){
                    //有包子进行等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行或者没有包子，包子铺生产包子
                //增加趣味性，交替生产两种包子
                if(count%2 == 0){
                    bz.pi = "薄皮";
                    bz.xian = "三鲜";
                }else{
                    bz.pi = "冰皮";
                    bz.xian = "牛肉";
                }
                count++;
                System.out.println("包子铺正在生产： " + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺生产好了： " + bz.pi + bz.xian + "吃货可以开吃了");
            }
        }

    }

}
