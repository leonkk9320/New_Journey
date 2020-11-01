package JavaSE.String;
/*
public char[] toCharArray(); 字符串转换为字符数组返回
public byte[] getBytes(); 获得字符串底层字节数组
public String replace(CharSequence OldString, CharSequence NewString);
老字符串替换为新字符串，返回新字符串
 */
public class Demo6StringConvert {
    public static void main(String[] args) {
        //转换字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);//5

        System.out.println("========");

        //转换字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println("========");

        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);

        String lang1 = "你妈了个逼！妈逼的！";
        String lang2 = lang1.replace("妈逼","**");
        System.out.println(lang1);
        System.out.println(lang2);
    }
}
