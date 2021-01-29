package JavaSE.Nov28;

public class ChiHuo extends Thread{
    private BaoZi bz;

    public ChiHuo(BaoZi bz){
        this.bz = bz;
    }

    @Override
    public void run(){
        for (int i = 0; i < 4; i++) {
            synchronized (bz){
                if(bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后
                System.out.println("吃货正在吃： " + bz.pi + bz.xian + "的包子");
                //包子吃完了
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经把" + bz.pi + bz.xian + "的包子吃完了，开始生产包子");
                System.out.println("=============");
            }
        }

    }
}
