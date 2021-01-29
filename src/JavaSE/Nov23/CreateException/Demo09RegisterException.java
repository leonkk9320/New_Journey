package JavaSE.Nov23.CreateException;
/*
自定义异常类：
    java提供的不够，需要自己定义
格式：
    public class XXXException extends Exception(RuntimeException){
        空参构造
        带异常信息带构造
    }

注意：
    1.一般以Exception结尾，告知是异常类
    2.必须继承Exception或者RuntimeException
        继承Exception：要么throws要么try...catch...
        继承RuntimeException: 无需处理，交给虚拟机处理（中断处理）
 */
public class Demo09RegisterException extends Exception {
    public Demo09RegisterException() {
        super();
    }

    public Demo09RegisterException(String message) {
        super(message);
    }
}
