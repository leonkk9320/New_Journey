package JavaSE.Other.String;
/*
字符串截取
public String substring(int index); 当前参数到末尾，返回新字符串
public String substring(int begin, int end); 截取[begin, end）
*/
public class Demo5Substring {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        String s2 = s1.substring(5);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("============");
        String s3 = s1.substring(4,7);
        System.out.println(s3);
    }
}
