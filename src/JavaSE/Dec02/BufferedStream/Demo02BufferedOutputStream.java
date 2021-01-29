package JavaSE.Dec02.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.BufferedOutputStream extends OutputStream
BufferedOutputStream: 字节缓冲输出流

共性成员方法：
    public void close(): 关闭输出流，释放资源
    public void flush()：刷新输出流，强制任何缓冲的输出字节被写入
    public void write(byte[] b): 将b.length字节从指定字节数组写入此输出流
    public void write(byte[] b, int off, int len)：从指定字节数组写入len字节，从偏移量off开始输出到此输出流
    public abstract void write(int b)： 将指定的一个字节输出

构造方法：
    BufferedOutputStream(OutputStream out) 默认8KB
    BufferedOutputStream(OutputStream out, int size) size:指定缓冲区大小
 */
public class Demo02BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream 对象
        FileOutputStream fos = new FileOutputStream
                ("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//BufferedStream//g.txt");
        //创建缓冲流对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //write写数据
        bos.write("写数据".getBytes());//写入缓冲区当中

        //缓冲区->文件
        bos.flush();

        //关闭
        bos.close();
    }

}
