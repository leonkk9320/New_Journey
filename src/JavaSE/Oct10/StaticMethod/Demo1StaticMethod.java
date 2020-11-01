package JavaSE.Oct10.StaticMethod;
/*
成员方法加static修饰，会变成静态方法。静态方法不属于对象，属于类。

没有static（成员方法）， 需要先创建对象，通过对象使用
有static（静态方法），可以通过对象调用，也可以通过类名调用

无论成员变量， 还是成员方法， 加了static之后， 都推荐s使用类名称调用。
静态变量： 类名称.静态变量（前提不是private）
静态方法： 类名称.静态方法()  注意：本类当中的静态方法，可以省略类名称直接调用。

注意：
1. 静态方法不能访问非静态变量，只能访问静态变量 （加static修饰，肯定范围变小了）非静态方法两种变量都可以访问
原因：内存中先有静态，后有非静态（习大大知道秦始皇，秦始皇不知道习大大）
在调用该方法时，不会将对象的引用传递给他，所以在static方法中不可访问非static的成员

1.1 静态方法不能直接调用非静态方法，只能调用静态方法。 非静态方法可以调用静态或非静态方法。

2. 静态方法中不能使用this
原因： this 代表当前对象， 通过谁调用的方法，谁就是当前对象，静态方法与对象无关。
在调用该方法时，不会将对象的引用传递给他，所以在static方法中不能使用this
 */
public class Demo1StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();

        obj.staticMethod();//正确 不推荐 易误以为成员方法
        MyClass.staticMethod();//正确 推荐

        //本类中的static方法调用
        same();
        Demo1StaticMethod.same();

    }
    public static void same(){
        System.out.println("本类中，用不用类名称调用都可");
    }
}
