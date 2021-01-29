package JavaSE.Oct2930.Demo01MultiInterface;

public interface MyinterfaceA {
    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("默认方法A");
    }
}
