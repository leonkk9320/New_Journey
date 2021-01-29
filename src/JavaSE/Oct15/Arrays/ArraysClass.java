package JavaSE.Oct15.Arrays;
import java.util.Arrays;
/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法（通过类名
Arrays调用），用来实现数组常见操作。

public static String toString(数组)： 将参数数组变成字符串（按照默认格式：
[元素1，元素2，....] 与arraylist 一样，打印出来的是内容）

public static void sort(数组)： 按照默认升序（从小到大）对数组元素排序

备注：
1. 如果是数值，从小到大
2. 字符串，字母升序
3. 自定义类型，那么这个类需要有Comparable 或者Comparator接口支持（今后学习）
*/
public class ArraysClass {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        //将int[]数组按照默认格式转换为字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);//[10, 20, 30]

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"bbb", "ccc", "aaa"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
