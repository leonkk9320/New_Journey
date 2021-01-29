package JavaSE.Nov13;
/*
可变参数： JDK 1.5之后的新特性
使用前提：当前参数列表的数据已经确定，但是参数个数不确定，就可以使用
原理：底层是数组，根据传参个数不同，创建不同长度的数组，可以是0到多个

注意：一个方法只能有【一个】可变参数，且必须在【末尾】
 */
public class Demo01VariableArgument {
    public static void main(String[] args) {
        System.out.println(add(10,20));
    }

    private static int add(int...arr){
        System.out.println(arr);
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    /*
    终极写法：
    private static void add(Object...obj){
    }
     */
}
