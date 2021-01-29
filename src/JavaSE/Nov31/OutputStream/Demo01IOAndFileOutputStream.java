package JavaSE.Nov31.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.OutputStream: 字节输出流
    此【抽象类】是所有字节输出流的超类（内存到硬盘）【写入】

共性成员方法：
    public void close(): 关闭输出流，释放资源
    public void flush()：刷新输出流，强制任何缓冲的输出字节被写入
    public void write(byte[] b): 将b.length字节从指定字节数组写入此输出流
    public void write(byte[] b, int off, int len)：从指定字节数组写入len字节，从偏移量off开始输出到此输出流
    public abstract void write(int b)： 将指定的字节输出

java.io.FileOutputStream extends OutputStream
FileOutputStream: 文件字节输出流
作用：把【内存】中到数据写到【硬盘文件】中

constructor：
    FileOutputStream(String name)   String name: 文件路径
    FileOutputStream(File file)   File file: 文件

constructor did:
    1.创建FileOutputStream对象
    2.会根据构造方法中传递的文件/文件路径，创建一个空文件
    3.会把FileOutputStream对象指向创建好的文件

写入原理：（内存->硬盘） java程序 --> JVM --> OS --> OS调用写数据方法 --> 数据写入文件

字节输出流使用步骤（重点）：
    1.创建一个FileOutputStream对象，参数传递目的地
    2.调用FileOutputStream对象write方法，数据写入文件
    3.释放资源（流会占用一定的内存，使用完毕要把内存清空，提高效率）
 */
public class Demo01IOAndFileOutputStream {
    public static void main(String[] args) throws IOException {
        // 1.创建一个FileOutputStream对象，参数传递目的地
        FileOutputStream fos = new FileOutputStream("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov31//a.txt");

        // 2.调用FileOutputStream对象write方法，数据写入文件
        //public void write(int b)
        fos.write(97);//一次写一个字节

        // 3.释放资源（流会占用一定的内存，使用完毕要把内存清空，提高效率）
        fos.close();
    }
}
