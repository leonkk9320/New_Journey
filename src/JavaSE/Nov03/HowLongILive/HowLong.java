package JavaSE.Nov03.HowLongILive;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HowLong {
    public static void main(String[] args) throws ParseException {
        Long time = new Date().getTime();//毫秒当前

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse("1997-12-16 08:00:00");//出生日期
        Long time2 = date1.getTime();//出生毫秒

        Long time3 = (time - time2) / 86400000L; //活了多少毫秒

        System.out.println("活了 " + time3+ " 天了");

    }
}
