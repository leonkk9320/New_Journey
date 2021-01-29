package JavaSE.Nov05.Demo01SystemClassAndStringBuilder;
/*
StringBuilder 和 String 可以相互转化

String --> StringBuilder: 构造方法
StringBuilder --> String：toString 方法

 */
public class Demo04StringBuilderToString {
    public static void main(String[] args) {
        //String --> StringBuilder
        String str = "hello";
        StringBuilder sb = new StringBuilder(str); //String --> StringBuilder 对象
        sb.append(" World");
        System.out.println(sb);

        //StringBuilder --> String
        String s = sb.toString();
        System.out.println("s: " + s);
    }



}
