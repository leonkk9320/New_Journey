package JavaSE.Oct2930.Demo02InterfaceExtendsRelations;

public interface MyinterfaceA {
    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("AAA");
    }
}
