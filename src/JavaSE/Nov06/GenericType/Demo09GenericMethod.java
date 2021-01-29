package JavaSE.Nov06.GenericType;

public class Demo09GenericMethod {
    public static void main(String[] args) {
        Demo08GenericMethod gm = new Demo08GenericMethod();

        gm.method01(12);
        gm.method01("abc");
        gm.method01(true);

        gm.method02("静态方法不建议对象调用");

        Demo08GenericMethod.method02("cba");
        Demo08GenericMethod.method02(12);

    }
}
