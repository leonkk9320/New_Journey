package JavaSE.Nov05.Demo01SystemClassAndStringBuilder;
/*
java.lang.StringBuilder
两种构造方法： 有无参数 创建字符串缓冲区对象
常用方法：public StringBuilder append() 可以添加任意类型的字符串为参数，并返回当前对象自身
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println(bu1);
        System.out.println("=======");
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println(bu2);

        //append 返回的是 this ---> 调用方法的对象 bu2
        StringBuilder bu3 = bu2.append("cba");
        System.out.println(bu3);
        System.out.println(bu2==bu3);//两个对象是同一个对象，同一地址值

        System.out.println("========");

        bu3.append("789");
        System.out.println(bu3);

        System.out.println("=========");

        bu1.append("123").append(1).append(true).append(9.9).append("中");
        System.out.println(bu1);


    }
}
