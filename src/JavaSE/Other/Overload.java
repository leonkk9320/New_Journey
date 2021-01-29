package JavaSE.Other;
//重载: 方法名称相同，参数列表不一样
/*
重载与下列因素有关：
1。参数个数不同
2。参数类型不同 int Sum(byte a, byte b);
3。 参数的多类型顺序不同 int Sum(int a, double b); / int Sum(double a, int b);

重载与下列因素无关：
1。参数名称
2。 方法返回值类型无关 double Sum(int a, int b) / int Sum(int a, int b)
3。 与修饰符无关 public static
 */
public class Overload {

    public static void main(String[] args) {
        /*System.out.println(SumTwo(10,20));
        System.out.println(SumThree(10,20,30));
        System.out.println(SumFour(10,20,30,40));*/
        System.out.println(Sum(10,20,30));
        System.out.println(Sum(10,20));
        System.out.println(Sum(10,20,30,40));
    }

    public static int  Sum(int a, int b){
        System.out.println("两个参数的方法");
        return a+b;
    }

    public static int  Sum(int a, int b, int c){
        System.out.println("三个参数的方法");
        return a+b+c;
    }

    public static int  Sum(int a, int b, int c, int d){
        System.out.println("四个参数的方法");
        return a+b+c+d;
    }

    //好处：只用记住一个方法名称，进行多个相似操作
}
