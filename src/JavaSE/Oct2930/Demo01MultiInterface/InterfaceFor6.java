package JavaSE.Oct2930.Demo01MultiInterface;

public interface InterfaceFor6 {
    public default void method(){
        System.out.println("接口默认方法比父类方法先执行");
    }
}
