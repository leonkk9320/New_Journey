package JavaSE.Other.String;

/*
public int length(); 长度
public String concat(String str); 当前字符串与参数字符串拼接 or + 也行
public char charAt(int index); 获取指定索引值的单个字符
public int indexOf(String str); 找索引值，没有返回-1
*/
public class Demo4StringGet {
    public static void main(String[] args) {
        int length = "usdgvbkjsb".length();
        System.out.println("length is " + length);

        String s1 = "hello";
        String s2 = "world";
        String s3 = s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("=========");

        char ch = "hello".charAt(1);
        System.out.println("index at 1 is " + ch);

        System.out.println("=========");

        String original = "HelloHello";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值，" + index);//2
        System.out.println("HelloHello".indexOf("abc"));//-1
    }


}
