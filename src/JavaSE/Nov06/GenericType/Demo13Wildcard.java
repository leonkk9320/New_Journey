package JavaSE.Nov06.GenericType;

import java.util.ArrayList;
import java.util.Iterator;

/*
    范型的通配符：
        ？：代表任意的数据类型
    使用方式：
        不能创建对象使用
        只能作为方法的参数使用
 */
public class Demo13Wildcard {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        //ArrayList<?> list03 = new ArrayList<?>(); 不能创建对象使用!

        demo01(list01);
        demo01(list02);
    }

    /*
    定义一个方法能遍历所有类型的arraylist集合
    这时候我们不知道arraylist集合使用什么数据类型，可以使用范型通配符？来接收数据类型
    注意：
        范型没有继承的概念的
        指定了String Integer就是String Integer，<>不能用Object代替,只能写？
        写Object: error: Integer cannot convert to Object
    可以：
        不写范型
        则默认是Object对象集合，将集合内元素向下转型为某一类型
     */
    private static void demo01(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
