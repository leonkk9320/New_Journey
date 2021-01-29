package JavaSE.Nov03.Demo02DateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static JavaSE.Nov03.Demo02DateClass.DateClass2.demo01;

/*
    java.text.DateFormat:是日期/时间格式化子类的抽象类
    作用：
        格式化（也就是日期-->文本） 解析（文本-->日期）
    成员方法：
        String format(Date date) 按照指定模式，把date日期，格式化为符合模式的字符串
        Date parse(String parse) 把符合模式的字符串，解析为Date日期
    DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类

    java.text.SimpleDateFormat extends DateFormat

    构造方法：
        SimpleDateFormat (String pattern) 用给定的默认和默认语言环境的日期格式符号构造SimpleDateFormat。
        参数：
            String pattern: 传递指定的模式
        模式：区分大小写
            y   年
            M   月
            d   日
            H   时
            m   分
            s   秒
         写对应的模式，会把模式替换为对应的时间和日期
            "yyyy-MM-dd HH:mm:ss"
            "yyyy年MM月dd日 HH时mm分ss秒"
 */
public class DateFormatClass  {
    public static void main(String[] args) throws ParseException{
        demo01();
        System.out.println("=======");
        demo02();
    }

    //使用format
    public static void demo01(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date);
        System.out.println(text);
    }

    //使用parse
    /*
    public Date parse(String source) throws ParseException
    parse 方法声明了一个叫ParseException解析异常
    如果字符串和构造方法中的模式不一样，那么程序就会抛出此异常
    调用一个抛出异常的方法，就必须处理这个异常，要么throws 继续声明抛出这个异常，要么try catch 处理异常
     */
    public static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2020-11-03 16:10:07");
        System.out.println(date);
    }
}
