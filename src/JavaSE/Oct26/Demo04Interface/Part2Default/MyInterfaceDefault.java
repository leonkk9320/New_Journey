package JavaSE.Oct26.Demo04Interface.Part2Default;
/*
Java8开始，接口里允许定义默认方法
格式：
public default 返回值类型 方法名称（参数列表）{
    方法体
}

备注：接口当中的默认方法，可以解决接口当中的升级问题。
 */
public interface MyInterfaceDefault {
    public abstract void methodA();

    //新添加了一个方法，但不想改A，B里的已有代码，怎么办？（新添方法：接口升级）
   // public abstract void methodAA();

    public default void methodAA(){
        System.out.println("新添加的默认方法");
    }
}
