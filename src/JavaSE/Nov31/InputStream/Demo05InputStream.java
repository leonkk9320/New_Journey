package JavaSE.Nov31.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo05InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream
                ("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov31//OutputStream//a.txt");
        //缓冲作用，存储每次读取到的多个字节
        byte[] bytes = new byte[2];//一次存储2个字节
        int len = fis.read(bytes);//每次有效读取的字节个数
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));

        fis.close();
    }
}
