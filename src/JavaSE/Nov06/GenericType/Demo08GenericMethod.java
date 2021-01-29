package JavaSE.Nov06.GenericType;
/*
    定义含有范型的方法：范型定义在方法的修饰符和返回值之间
    输入什么类型，返回值就是什么类型
    格式：
    修饰符<范型> 返回值类型 方法名（参数列表（使用范型））{
        方法体；
    }
 */
public class Demo08GenericMethod {
    public <M> void method01(M m){
        System.out.println(m);
    }

    //含有范型的静态方法
    public static <S> void method02(S s){
        System.out.println(s);
    }
}
