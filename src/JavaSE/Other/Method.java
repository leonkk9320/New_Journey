package JavaSE.Other;

public class Method {
    public static void main(String[] args) {
        System.out.println(sum(10,20)); // 打印调用
    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }
}
/*
有返回值：单独调用，赋值调用， 打印调用
无返回值： 只能单独调用
return; void 的方法作为结束方法，可以省略不写
*/