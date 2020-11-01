package JavaSE.Oct10.StaticCodeBlock;
/*
静态代码块： 当第一次用到本类时，执行唯一的一次。
 */
public class Person {
    static{
        System.out.println("静态代码块执行");
    }

    public Person(){
        System.out.println("构造方法执行了！");
    }
}
