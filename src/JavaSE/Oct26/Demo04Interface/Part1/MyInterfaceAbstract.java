package JavaSE.Oct26.Demo04Interface.Part1;
/*
任何版本Java，接口都可以定义抽象方法。
格式：public abstract 返回值类型 方法名称（参数列表）；

注意事项：
1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：
public abstract
2. 可以选择性省略
*/
public interface MyInterfaceAbstract {
    //以下都对
    public abstract void m1();
    public void m2();
    abstract void m3();
    void m4();
}
