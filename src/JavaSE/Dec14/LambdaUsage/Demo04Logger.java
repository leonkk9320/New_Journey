package JavaSE.Dec14.LambdaUsage;
/*
在判断前，就会先拼接字符串，造成性能浪费
 */
public class Demo04Logger {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(2, msg1 + msg2 + msg3);
    }

    private static void showLog(int level, String msg){
        System.out.println("不满足条件也执行");
        if(level == 1){
            System.out.println(msg);
        }
    }
}
