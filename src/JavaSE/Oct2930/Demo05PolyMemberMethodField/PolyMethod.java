package JavaSE.Oct2930.Demo05PolyMemberMethodField;
/*
在多态的代码当中，成员方法访问规则：
    看new的是谁，就优先用谁，没有则向上找（针对重写且编译通过）

口诀：编译看左边，运行看右边 (成员变量不适用)

对比一下：
成员变量：编译看左边，运行【还】看左边
成员方法：编译看左边，运行看右边
 */
public class PolyMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();//new 了子

        //编译看左，左边是Fu，Fu当中有method方法，编译通过；执行看右，new的子，用子的方法
        obj.method();//父子都有，优先子

        //编译看左，左边是Fu，Fu当中有methodFu方法，编译通过；执行看右，new的子，用子的方法，没有，向上找到Fu
        obj.methodFu();//子类没有父类有，向上找到父

        //编译看左，左边是Fu，Fu当中没有methodZi方法，所以编译报错
        //obj.methodZi(); 错误！
    }
}
