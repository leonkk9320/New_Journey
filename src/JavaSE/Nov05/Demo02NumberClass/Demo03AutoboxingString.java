package JavaSE.Nov05.Demo02NumberClass;
/*
基本类型与字符串之间的转换
基本-->字符串
    1.基本数据类型+"" （最简单，常用）
    2.包装类当中的静态方法
        static String toString(int i)
    3.String类中的静态方法
        static String valueOf(int i)
字符串-->基本
    1.包装类静态方法parseXX(字符串) 字符串必须是整数 NumberFormatException
        static int parseInt(String s)
        static double parseDouble(String s)
 */
public class Demo03AutoboxingString {
    public static void main(String[] args) {
        //基本-->字符串
        String s1 = 100 + "";
        System.out.println(s1+200);

        String s2 = Integer.toString(100);
        System.out.println(s2+200);

        String s3 = String.valueOf(100);
        System.out.println(s2+200);

        System.out.println("=======");

        //字符串-->基本
        int i = Integer.parseInt("100");
        System.out.println(i+100);


    }

}
