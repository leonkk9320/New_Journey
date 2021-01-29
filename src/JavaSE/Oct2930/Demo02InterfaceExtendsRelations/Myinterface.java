package JavaSE.Oct2930.Demo02InterfaceExtendsRelations;
/*
这个子接口有几个方法？ 答：4个
methodA 来源于A
methodB 来源于B
methodCommon 来源于A和B
method
 */
public interface Myinterface extends MyinterfaceA, MyinterfaceB {
    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
