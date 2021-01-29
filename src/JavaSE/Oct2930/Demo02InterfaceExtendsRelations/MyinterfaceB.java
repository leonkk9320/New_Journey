package JavaSE.Oct2930.Demo02InterfaceExtendsRelations;

public interface MyinterfaceB {
    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
