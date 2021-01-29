package JavaSE.Nov05.Demo02NumberClass;
/*
包装类 java.lang.Number (Integer extends Number)
例子：ArrayList<Integer> 范型里的必须是引用数据类型不能是基本数据类型，使用包装类

装箱(inbox)：基本类型的数据包装到包装类当中 （基本数据类型-->包装类）
    构造方法：
        Integer (int value)
        Integer (String s) 必须是基本数据类型的字符串， "a"则报错
    静态方法：
        static Integer valueOf(int i)
        static Integer valueOf(String s)


拆箱(outbox)：在包装类当中取出基本类型数据（包装类-->基本数据类型）
    int intValue()
 */
public class Demo01NumberClass {
    public static void main(String[] args) {
        //基本数据类型-->包装类
        Integer i1 = new Integer(1);
        System.out.println(i1);

        Integer i2 = new Integer("2");
        System.out.println(i2);

        Integer i3 = Integer.valueOf(3);
        Integer i4 = Integer.valueOf("4");
        System.out.println(i3);
        System.out.println(i4);


        System.out.println("=======");

        //包装类-->基本数据类型
        int i = i1.intValue();
        System.out.println(i);

    }
}
