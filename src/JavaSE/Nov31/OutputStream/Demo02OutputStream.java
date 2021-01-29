package JavaSE.Nov31.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
一次写多个字节的方法
    public void write(byte[] b): 将b.length字节从指定字节数组写入此输出流
    public void write(byte[] b, int off, int len)：从指定字节数组写入len字节，从偏移量off开始输出到此输出流
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov31//b.txt"));

        byte[] bytes = {65,66,67,68};
        fos.write(bytes);//ABCD
        fos.write(bytes, 1, 2);//BC

        fos.close();
    }
}
