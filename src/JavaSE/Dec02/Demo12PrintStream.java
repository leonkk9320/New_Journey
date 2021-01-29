package JavaSE.Dec02;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    java.io.PrintStream: 打印流

    PrintStream特点：
        1.只负责数据对输出，不负责读取
        2.永远不会抛出IOException
        3.有特有方法print println

    构造方法：
        printStream(File file)
        printStream(OutputStream out)
        printStream(String fileName)
 */
public class Demo12PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //out 是一个PrintStream 对象，PrintStream类里面有print println方法
        System.out.println("默认在控制台输出");
        //创建打印流
        PrintStream ps = new PrintStream("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//Demo12.txt");
        //改变打印目的地
        System.setOut(ps);
        System.out.println("打印流输出（在文件里）");
    }
}
