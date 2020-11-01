package JavaSE.String;
/*
分割字符串
public String[] split(String regex) //regular expression
注意：
split方法是一个正则表达式，若按照"."切分，需要写"\\."进行转义 "\\"是转义字符
 */
public class Demo7StringSplit {
    public static void main(String[] args) {
        String s1 = "aaa,bbb,ccc";
        String[] array1 = s1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("=========");

        String s3 = "XXX.YYY.ZZZ";
        String[] array3 = s3.split(".");
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        System.out.println("=========");

        String s4 = "XXX.YYY.ZZZ";
        String[] array4 = s4.split("\\.");
        System.out.println(array4.length);
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }

    }
}
