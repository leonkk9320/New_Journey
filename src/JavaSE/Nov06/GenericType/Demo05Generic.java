package JavaSE.Nov06.GenericType;

import java.util.ArrayList;
import java.util.Iterator;

/*
范型：<String> 必须是引用类型，所以基本数据类型使用包装类
 */
public class Demo05Generic {
    public static void main(String[] args) {
        show02();
        System.out.println("==========");
        show01();
    }

    /*
    创建集合对象，不使用范型
    好处：
        默认为Object类，可以存储任意类型数据
    弊端：
        不安全，会引发异常
     */
    private static void show01(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        //迭代器遍历（增强for循环）
        for(Object obj : list){
            System.out.println(obj);
        }
        System.out.println("====");
        //想使用String中.length()方法，不行！
        //因为当前为多态，不能使用子类特有方法
        //需要向下转型
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            String s1 = (String) obj;
            System.out.println(s1.length());//ClassCastException: runtime error 编译不报错，运行时发现int 不能变成String
        }
    }

    /*
    创建集合对象，使用范型
    好处：
        1.避免类型转换麻烦
        2.运行时异常，提升到编译时异常
    弊端：
        范型是什么就得是什么
     */
    private static void show02(){
        ArrayList<String> l = new ArrayList<>();
        l.add("abc");
        //l.add(1); 提升到编译报错
        Iterator<String> it = l.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s+"->"+s.length());
        }
    }
}
