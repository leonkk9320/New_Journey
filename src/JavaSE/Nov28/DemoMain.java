package JavaSE.Nov28;

public class DemoMain {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();

        new BaoZiPu(bz).start();

        new ChiHuo(bz).start();
    }
}
