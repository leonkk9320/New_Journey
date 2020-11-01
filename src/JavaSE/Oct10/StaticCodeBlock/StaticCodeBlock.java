package JavaSE.Oct10.StaticCodeBlock;
/*
典型用途：给静态变量一次性赋值
 */
public class StaticCodeBlock {
    public static void main(String[] args) {
        Person p1 = new Person();//静态优于非静态，静态代码块先执行 
        Person p2 = new Person();

    }
}
