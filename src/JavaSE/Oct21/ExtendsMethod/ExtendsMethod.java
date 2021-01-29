package JavaSE.Oct21.ExtendsMethod;
/*
在父子继承当中，创建子类对象，访问成员方法规则：
    创建的对象是谁，就优先用谁，如果没有则向上找

注意事项：
无论是成员方法还是成员变量，如果没有都是向上找父类，绝不会向下找子类

重写（override）
概念：在继承关系当中，方法名称一样，参数列表也一样
（重载不一定在继承，且参数列表不一样）

重写特点：创建的是子类对象，则优先用子类方法，new的是谁，就优先用谁
 */
public class ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodZi();
        zi.methodFu();
        System.out.println("========");
        //new的是子类对象，优先用子类方法
        zi.method();
    }
}
