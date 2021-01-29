package JavaSE.Oct15.Math;
/*
java.lang.Math 是数学相关的工具类，里面有大量静态方法，完成数学相关操作

public static double abs(double number) 或取绝对值 有多种重载
public static double ceil(double num) 向上取整
public static double floor(double num) 向下取整
public static long round(double num) 四舍五入

Math.PI 代表近似圆周率常量（double）
 */
public class MathClass {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(-3.14));
        System.out.println("=========");

        //向上取整
        System.out.println(Math.ceil(3.9));//4.0
        System.out.println(Math.ceil(3.0));//3.0
        System.out.println("=========");

        //向下取整
        System.out.println(Math.floor(3.9));//3.0
        System.out.println(Math.floor(3.0));//3.0
        System.out.println("=========");

        //四舍五入 没有小数点
        System.out.println(Math.round(20.4));//20
        System.out.println(Math.round(10.5));//11

    }
}
