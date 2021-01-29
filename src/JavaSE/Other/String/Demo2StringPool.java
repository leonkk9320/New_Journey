package JavaSE.Other.String;
/*
字符串常量池: 程序中直接用双引号的字符串，就在字符串常量池中。字符串常量池在堆当中（JDK1.7以后）
基本类型， == 比较数值
引用类型， == 比较地址
 */
public class Demo2StringPool {
    public static void main(String[] args) {
        //"abc"在常量池中，s1,s2储存池中同一个字符串的地址，池中字符串保存地址，地址指向底层的（byte）字节数组
        String s1 = "abc";
        String s2 = "abc";

        //charArray 在栈，储存地址，该地址指向堆中{a,b,c}
        char[] charArray = {'a', 'b', 'c'};
        //s3 在栈，储存地址，该地址指向堆中new String对象，该对象
        //存储地址，该地址指向由（char）字符数组转换而成的（byte）字节数组
        String s3 = new String(charArray);

        System.out.println(s1 == s2);//t
        System.out.println(s1 == s3);//f
        System.out.println(s2 == s3);//f
    }




}
