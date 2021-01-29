package JavaSE.Dec14.LambdaUsage;
/*
lambda 特点：延时加载
如果不满足条件，程序不会执行，字符串不会进行拼接
 */
public class Demo06LambdaLogger {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1, () -> msg1 + msg2 + msg3);

//        showLog(2, () -> {
//            System.out.println("满足条件才执行");
//            return msg1 + msg2 + msg3;
//            });
    }

    private static void showLog(int level, Demo05MessageBuilder mb){
        if(level == 1){
            System.out.println(mb.buildMessage());
        }
    }
}
