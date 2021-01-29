package JavaSE.Oct15.Arrays;
/*
随机字符串升序排列，倒序打印
 */

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        String str = "iuahfafeuifa";
        //参数必须是数组
        //Arrays.sort(str);

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.println(charArray[i]);
        }
        //charArray.forr 倒序 fori 正序

    }
}
