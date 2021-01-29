package JavaSE.Nov04;

import java.util.Calendar;
import java.util.Date;

/*
Calendar 类的成员方法：
    public int get(int field): 返回给定日历字段的值
    public void set(int field, int value): 将给定的日历字段设定为给定值
    public abstract void add(int field, int amount): 根据日历的规则，为给定的日历字段添加或减去指定的时间量  子类重写了该方法
    public Date getTime(): 返回一个表示此Calendar时间值的Date对象

    int field: 日历类的字段，可以使用Calendar类的静态成员变量获取
    public static final int YEAR 年
    ...MONTH 月
    ...DATE 月中某一天
    ...DATE_OF_MONTH 月中某一天
    ...HOUR 时
    ...MINUTE 分
    ...SECOND 秒

 */
public class demo02Calendar {
    public static void main(String[] args) {
        demo01();
        System.out.println("=======");
        demo02();
        System.out.println("=======");
        demo03();
        System.out.println("=======");
        demo04();
    }
    private static void demo01(){
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);//当前年份 2020

        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);//西方月份0-11 当前月份+1 11
    }

    private static void demo02(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 9999);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    private static void demo03(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    private static void demo04(){
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
}
