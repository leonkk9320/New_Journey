package JavaSE.Oct10.StaticMethod;

public class Demo2StaticMethodMain {
    public static void main(String[] args) {
        //word1(); 不可被调用
        Demo2StaticMethodMain.word2();
        word2();
    }

    //必须要实例化一个对象才能使用
    public void word1(){
        System.out.println("say sth 1");
    }

    //不需要实例化一个对象就能使用。1.类名.方法名（）2. 直接方法名（在本类中）3.对象名.方法名（）不推荐使用
    public static void word2(){
        System.out.println("say sth 2");
    }
}
/*
static 意味着不需要实例化对象来调用函数，
包含 main 的类是主类，其中的其他方法都是在main中直接调用，所以要写static
main 方法写static是为了不实例化对象而直接使用main方法
 */