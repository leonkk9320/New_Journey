package JavaSE.String;

public class Demo1String {
    public static void main(String[] args) {
        //空构造
        String s1 = new String();
        System.out.println(s1);//空
        //字符数组构造
        char[] charArray = {'A', 'B'};
        String s2 = new String(charArray);
        System.out.println(s2);
        //字节数组构造
        byte[] byteArray = {'a', 'b', 'c'};//or {97, 98, 99}
        String s3 = new String(byteArray);
        System.out.println(s3);
        //直接创建
        String s4 = "your father";//JVM帮你new了， "your father" 是对象。字符串是对象

    }
}
