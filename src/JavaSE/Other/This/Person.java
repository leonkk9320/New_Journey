package JavaSE.Other.This;
/*
当方法的局部变量和类的成员变量重名时，根据"就见原则"，优先使用局部变量
如果需要访问本类当中的成员变量，需要使用格式：
this.成员变量名
解决重名分不开的问题

"通过谁调用的方法，谁就是this （person.name）"
 */
public class Person {
    String name;
//    public void sayHi(String name){
//        System.out.println(name + "你好， 我是" + name);
//    } //papa 我是 papa

//    public void sayHi(String who){
//        System.out.println(who + "你好， 我是" + name);
//    }

    public void sayHi(String name){
        System.out.println(name + "你好， 我是" + this.name);
        System.out.println(this);
    }
}
