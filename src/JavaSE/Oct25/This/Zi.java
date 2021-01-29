package JavaSE.Oct25.This;
/*
super 关键字用来访问父类内容，而this关键字用来访问本类内容

1. 在本类的成员方法中，访问本类的成员变量。
2. 在本类的成员方法中，访问本类的另一个成员方法。
3. 在本类的构造方法中，访问本类的另一个构造方法。
   a: this(...)调用也必须是构造方法中第一个构造，唯一一个
   b: super和this两种构造调用，不能同时调用
 */
public class Zi extends Fu {

    int num = 20;

    public Zi(){
        //super();//这一行不再赠送
        this(20);//本类的无参构造，调用本类的有参构造
        //this(1,2) 错！ 必须是第一个，且只能调用一次
    }

    public Zi(int n){

    }

    public Zi(int n, int m){

    }

    public void showNum(){
        int num = 10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//成员变量
        System.out.println(super.num);//父类中的成员变量
    }

    public void methodA(){
        System.out.println("AAA");
    }

    public void methodB(){
        methodA();//和 this.methodA(); 一样的
        this.methodA(); //this起到强调作用，这个方法是本类的哦
        System.out.println("BBB");
    }
}
