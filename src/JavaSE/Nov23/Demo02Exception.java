package JavaSE.Nov23;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.lang.Throwable
    Exception: 编译期异常
        RuntimeException: 运行期异常
    异常就是程序得了小毛病（感冒发烧），异常处理掉可以继续执行（吃药）

    Error：错误
        错误就相当于程序得了无法治愈掉毛病，必须修改源代码，才能继续执行
 */
public class Demo02Exception {
    public static void main(String[] args) /*throws ParseException*/ {//main throws 交给虚拟机处理，虚拟机会中断程序
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try {
//            date = sdf.parse("1999-0909"); //此处出错！
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(date);
//

        System.out.println("====以上为编译期异常=======");

//        //run time exception
//        int[] arr = {1,2,3};
//        try{
//            //可能出现异常的代码
//            System.out.println(arr[3]);
//        }catch(Exception e){
//            //出现异常后怎么处理
//            System.out.println(e);
//        }

        System.out.println("====以上为runtime异常=======");

//        //Error OutOfMemoryError 内存溢出错误
//        int[] arr1 = new int[1024*1024*1024];
//
//        //必须修改源代码（数组变小一点），"后续代码"才能执行



        System.out.println("后续代码");//即使上文错误，后续代码也能执行

    }
}
