package JavaSE.Oct2930.Demo04PolymGlobalVar;
/*
【访问方式与继承一样】
访问成员变量两种方式：

1.直接通过对象名称访问，看等号【左】边是谁，优先用谁，没有则向上找
2.间接通过成员方法访问, 看该方法属于谁就优先用谁，没有则向上找
 */
public class PolyField {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);//左边是Fu，打印Fu的10
        //System.out.println(obj.age); //不会向下找子类
        System.out.println("========");
        //子类没有覆盖重写，就是父：10
        //子类覆盖重写，就是子：20
        obj.showNum();
    }
}
