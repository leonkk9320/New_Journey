package JavaSE.Nov05.Demo01SystemClassAndStringBuilder;

import java.util.Arrays;

/*
java.lang.System类提供类大量的静态方法，可以获取与系统相关的信息或系统级操作
常用方法：

public static long currentTimeMillis()： 返回以毫秒为单位的当前时间
public static void arrayCopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中
(源数组，源数组起始位置， 目标数组， 目标数组中的起始位置， 要复制的数组元素数量)
 */
public class Demo01System {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
    运用：验证for循环打印数字1-9999 所需要的时间（毫秒）
     */
    private static void demo01(){
        long s = System.currentTimeMillis();

        for (int i = 1; i <= 9999; i++) {
            System.out.println(i);
        }

        long e = System.currentTimeMillis();
        System.out.println("共耗时：" + (e-s) + "毫秒");
    }

    private static void demo02(){
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.out.println("复制前：" + Arrays.toString(dest));

        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后：" + Arrays.toString(dest));
    }

}
