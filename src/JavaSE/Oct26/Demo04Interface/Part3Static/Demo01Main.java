package JavaSE.Oct26.Demo04Interface.Part3Static;
/*
注意：不能通过接口实现类的对象来调用接口当中的静态方法。
正确方法：通过接口名称，直接调用其中的静态方法
格式：
接口名称.静态方法名（参数）;
 */
public class Demo01Main {
    public static void main(String[] args) {
        //实现类对象
        StaticImpl imp = new StaticImpl();
        //imp.methodStatic(); 错误！
        StaticInterface.methodStatic();
    }
}
