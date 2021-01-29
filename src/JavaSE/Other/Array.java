package JavaSE.Other;
/*
1.引用数据类型
2.数组内类型统一
3.不能长度修改

常见初始化：
1。动态初始化（指定长度）（可拆分）：int[] arr = new int[5];
2。静态初始化（指定内容）（可拆分）：int[] arr = new int[] {1,2,3};
                      省略格式（不可拆分） int[] arr ={1,2,3};
数组变量名打印出来就是 数组内存地址哈希值
 */
public class Array {
    public static void main(String[] args) {
        int[] arrA = new int[300];
        // int[] arrA;
        // arrA = new int[300];
        int[] arrB = new int[] {5,15,25};
        //int[] arrB;
        //arrB = new int[] {5,15,25};
        int[] arr ={1,2,3};
        int len = arr.length;
        System.out.println(len);
        System.out.println(arr[1]);
//        for (int i = 0; i < arr.length; i++) {
//
//        }
        // arr.fori

    }
}

/*
数组自动初始化：
整数：0
浮点数：0.0
字符： '\u0000'（不可见）
布尔： false
引用： null
 */
