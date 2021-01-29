package JavaSE.Oct2930.Demo01MultiInterface;

public interface MyinterfaceB {
    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("默认方法B");
    }
}
