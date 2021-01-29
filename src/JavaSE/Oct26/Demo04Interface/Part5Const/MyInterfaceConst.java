package JavaSE.Oct26.Demo04Interface.Part5Const;
/*
接口当中也可以定义"成员变量"，但是必须使用public static final三个关键字修饰
从效果上看，这其实就是接口的【常量】
格式：
public static final 数据类型 常量名称 = 数据值；

注意：
1. public static final可以省略，但是不写也是public static final
2. 必须赋值，不能不赋值。因为是final 修饰，不赋值默认0，不能改变，无意义
3. 必须全大写，并用underscore隔开
*/
public interface MyInterfaceConst {
    //接口名.num 来调用
    public static final int NUM_OF_MY_CLASS = 10;
}
