package JavaSE.Nov05.Demo02NumberClass;

import java.util.ArrayList;

/*
自动装箱拆箱：
    基本数据类型和包装类之间可以自动相互转换
    JDK1.5之后
 */
public class Demo02AutoboxingInteger {
    public static void main(String[] args) {
        //自动装箱
        Integer i = 1;

        //自动拆箱，包装类无法进行计算
        //i+2 --> i.intValue() + 2
        //i = i+2 --> i = new Integer(3)
        i = i + 2;
        System.out.println(i);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //自动装箱 list.add(new Integer(1));
        int a = list.get(0); //自动拆箱 list.get(0).intValue();

    }
}
