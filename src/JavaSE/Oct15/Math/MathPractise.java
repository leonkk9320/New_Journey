package JavaSE.Oct15.Math;
/*
-10.8~5.9 之间，绝对值大于6或者小于2.1的整数有几个？

 */
public class MathPractise {
    public static void main(String[] args) {
        int n1 = (int)Math.ceil(-10.8);//-10 ceil 数值坐标轴往右， floor往左
        int n2 = (int)Math.floor(5.9);//5
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1){count++;}
        }
        System.out.println(count);
    }
}
