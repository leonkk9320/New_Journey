package JavaSE.Nov03.Demo02DateClass;
import java.util.Date;

public class DateClass2 {
    public static void main(String[] args) {
        demo01();
        System.out.println("==========");
        demo02();
        System.out.println("==========");
        demo03();
        System.out.println("==========");
    }

    /*
    无参构造：当前日期时间
     */
    public static void demo01(){
        Date date = new Date();
        System.out.println(date); //Tue Nov 03 15:40:51 CST 2020     CST: Chinese Standard Time
    }

    /*
    有参构造
    Date(long date): 传递毫秒值，把毫秒转换为Date日期，毫秒值的日期时间  毫秒 --> 日期
     */
    public static void demo02() {
        Date date1 = new Date(0L);
        System.out.println(date1);//Thu Jan 01 08:00:00 CST 1970

        Date date2 = new Date(1284783236L);
        System.out.println(date2);
    }

    /*
    Date类成员方法
    long getTime() 把日期转换为毫秒（相当于System.currentTimeMillis()） 日期 --> 毫秒
    返回自1970年1月1日00：00：00GMT以来此对象表示的毫秒数
     */
    public static void demo03(){
        Date date3 = new Date();
        long time = date3.getTime();
        System.out.println(time);
    }
}
