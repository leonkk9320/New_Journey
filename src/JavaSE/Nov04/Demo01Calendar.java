package JavaSE.Nov04;

import java.util.Calendar;

/*
java.util.Calendar类：日历类
是一个抽象类，里面提供操作日历字段的方法（YEAR, MONTH, DAY_OF_MONTH, HOUR）（有抽象方法即可成为抽象类）
Calendar类无法直接创建对象使用，里面有一个静态方法叫getInstance()，返回了Calendar类的子类对象
static Calendar getInstance(){} 使用默认时区和语言环境获得一个日历
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); //多态，且静态方法，用类名称调用方法
        System.out.println(c);

    }
}
