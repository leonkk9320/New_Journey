package JavaSE.Nov2930.Lambda;
/*
lambda格式：
    a.一些参数
    b.一个箭头
    c.一段代码
格式：
    （参数列表）-> {一些重写方法的代码}

简化版：
    1.（参数列表）：括号中参数列表的数据类型，可以省略不写
    2.（参数列表）：参数只有一个，数据类型和括号都可以不写
    3. {一些代码}：如果{}中的代码只有一行，无论是否有返回值，都可以省略{},return,分号（三者必须同时省略）

使用lambda表达式的前提：
1.必须有接口，且接口中有且只有一个抽象方法（JDK内置的Runnable， Comparable）。
2.必须有上下文推断。方法的参数或者局部变量类型必须是lambda对应的接口类型，才能使用lambda作为该接口的实例。

备注：有且只有一个抽象方法的接口，叫做函数式接口
 */
public class Demo04Lambda {
    public static void main(String[] args) {
        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了！");
            }
        }).start();

        //使用lambda表达式，实现多线程
        new Thread(() ->{
                System.out.println(Thread.currentThread().getName() + "新线程创建了！");
            }
        ).start();

        //使用lambda表达式简化版，实现多线程
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "新线程创建了！")).start();
    }
}
