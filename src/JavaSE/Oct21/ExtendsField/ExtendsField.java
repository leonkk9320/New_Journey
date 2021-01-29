package JavaSE.Oct21.ExtendsField;
/*
在父子继承关系当中，如果成员变量重名，则创建子类对象时，访问方式有两种

直接通过子类对象访问成员变量：
    （创建对象）等号左边是谁，就优先用谁，没有则向上找。分割线一
间接通过成员方法访问成员变量：
    该方法属于谁，就优先用谁，没有则向上找。分割线二 methodZi 属于Zi， 优先用子类的num

 */
public class ExtendsField {
    public static void main(String[] args) {
        Fu f = new Fu();
        System.out.println(f.fu); //只能用父类

        Zi z = new Zi();// 一号
        System.out.println(z.fu + z.zi);//父子都可以 输出30，不是1020

        System.out.println("==============");
        //等号左边是谁，就优先用谁，看一号，等号左边是z，优先用z的num，是200
        System.out.println(z.num);
        System.out.println("==============");
        //这个方法是子类的，优先用子类的，没有用父类的
        //这两个方法都print num，看print 的是哪个类里的num
        z.methodZi();//200
        //这个方法定义父类当中的
        z.methodFu();//100
    }
}
