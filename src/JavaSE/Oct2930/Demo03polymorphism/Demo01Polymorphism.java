package JavaSE.Oct2930.Demo03polymorphism;
/*
代码当中体现多态性，其实就是：父类引用指向子类对象。

格式：
父类名称 对象名 = new 子类名称(); //一只猫被当作动物来使用
或者
接口名称 对象名 = new 实现类名称();
 */
public class Demo01Polymorphism {
    public static void main(String[] args) {
        //使用多态的写法
        Fu obj = new Zi();

        obj.method();//子类方法
        obj.methodFu();//父类特有方法
    }

}
