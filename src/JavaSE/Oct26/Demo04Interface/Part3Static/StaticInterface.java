package JavaSE.Oct26.Demo04Interface.Part3Static;
/*
从Java8开始，接口当中允许定义静态方法
格式：
public static 返回值类型 方法名称（参数列表）{
    方法体
}

就是把abstract或者default换成static即可，带上方法体
 */
public interface StaticInterface {
    public static void methodStatic() {
        System.out.println("这是接口的静态方法");
    }
}
