package JavaSE.Nov23;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
throws 关键字：异常处理对第一种方式，交给别人处理
作用：
    当方法内部抛出异常对象对时候，那我们必须处理这个异常
    交给JVM处理
使用格式：在方法声明时使用
    修饰符 返回值类型 方法名（参数列表） throws AAAException, BBBException...{
        throw new AAAException("原因")；
        throw new BBBException("原因")；
        ...
    }
注意：
1.必须写在方法声明处
2.声明对异常必须是Exception或者是Exception 的子类
3.方法内部抛出多个异常，有子父类关系，直接抛出父类即可
4.调用了一个声明抛出异常的方法，我们就必须处理声明对异常 【就是无限向上throws，直到JVM】
    要么，继续throws声明抛出，交给方法的调用者处理，最终给JVM
    要么，try ... catch自己处理
 */
public class Demo04Throws {
    //FileNotFoundException extends IOException

    //public static void main(String[] args) throws FileNotFoundException，IOException {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.txt");
    }

    //private static void readFile(String n) throws FileNotFoundException, IOException
    private static void readFile(String n) throws IOException {
        if(!n.equals("c:\\a.txt")){
            throw new FileNotFoundException("路径不是c:\\a.txt");
        }

        if(!n.endsWith(".txt")){
            throw new IOException("后缀名不对");
        }
    }
}
