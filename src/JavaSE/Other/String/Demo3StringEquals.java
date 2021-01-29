package JavaSE.Other.String;
/*
== 比较地址
比较内容，两个方法：
public boolean equals(Object obj): 参数是任何对象，内容相同得true
注意：
1. 任何对象都能用Object接收
2. .equals方法具有对称性
3. 常量变量比较， 常量字符串写前面 "ABC".equals(str);

public boolean equalsIgnoreCase(String str); 忽略大小写，进行内容比较（验证码）
 */
public class Demo3StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        char[] array = {'H','e','l','l', 'o'};
        String s3 = new String(array);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println("Hello".equals(s2));//推荐

        System.out.println("=============");

        String s4 = null;
        System.out.println("wwe".equals(s4));//推荐
       // System.out.println(s4.equals("wwe"));//不推荐 空指针异常

        System.out.println("=============");

        String sa = "Java";
        String sb = "java";
        System.out.println(sa.equalsIgnoreCase(sb));
    }
}
