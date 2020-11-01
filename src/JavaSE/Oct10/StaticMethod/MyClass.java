package JavaSE.Oct10.StaticMethod;

public class MyClass {
    int num;
    static int staticNum;
    public void method(){
        System.out.println("成员方法");
        System.out.println(num);
        System.out.println(staticNum);
//        staticMethod();//静态方法可以在非静态方法中"直接"调用
//        method();//非静态方法可以在非静态方法中"直接"调用
    }
    /*
    非静态方法：静方或非静方都可"直接"调用
     */

    public static void staticMethod(){
        System.out.println("静态方法");
        //System.out.println(num); 静态先，非静态后， 静态不可调用非静态 （只要加载了.class文件 就加载了静态变量(这时还没有对象参数) ）
        System.out.println(staticNum);
        //System.out.println(this); 静态方法不用this
        //method(); 静态方法不能"直接"调用非静态方法 需要实例化对象调用，见main函数
    }

    /*
    静态方法：静方"直接"调用。 非静方不能"直接"调用，需实例化对象。

    上文"静直接调用"又分两类：1.当前类，直接写函数名（main中）。2. 跨类：类名.方法名()。
     */
}
