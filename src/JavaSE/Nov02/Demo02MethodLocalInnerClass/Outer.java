package JavaSE.Nov02.Demo02MethodLocalInnerClass;
/*
如果一个类是定义在一个方法内部的，那么这就是一个局部内部类。(成员定义在类内，局部定义在方法内)
"局部"：只有当前所属的方法才能使用它，出了这个方法就不能使用了。
即 下方代码中，Inner只有Outer能用，只能在Outer里创建Inner的方法里创建对象使用Inner

格式：
修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称（参数列表）{
        class 局部内部类名称{
        //...
        }
    }
}
小节一下类的权限修饰符：
1.外部类：public / (default)
2.成员内部类：public / protected / (default) / private
3.局部内部类：什么都不能写，只能本方法使用，和之前讲的（default）还不一样
 */
public class Outer {
    public void methodOuter(){
        class Inner{
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        //在Outer的一个方法里，在Inner class之外
        Inner inner = new Inner();
        inner.methodInner();
    }

}
