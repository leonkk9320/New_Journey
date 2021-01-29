package JavaSE.Nov31.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
java.io.InputStream: 字节输入流
所有字节输入流子类的超类

子类共性方法：
    int read() 从输入流中读取数据的下一个字节
        return【The character read, or -1 if the end of the stream has been reached】
    int read(byte[] b) 从输入流中读取一定数量的字节，并且将其存储在缓冲区数组 b 中
        return【The number of characters read, or -1 if the end of the stream has been reached】
    void close() 关闭此输入流并且释放与该流关联的所有系统资源

java.io.FileInputStream extends InputStream:
    文件字节输入流，把硬盘文件读取到内存中去

构造方法：
     FileInputStream(String name)
     FileInputStream(File file)
     参数：读取文件的数据源

读取数据的原理：
    java程序 -> JVM -> OS -> OS读取数据的方法 -> 读取文件

字节输入流使用步骤：
    1.创建FileInputStream对象，构造方法中绑定要读取的数据源
    2.使用FileInputStream对象中的方法read，读取文件
    3.释放资源
 */
public class Demo04InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream
                ("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov31//OutputStream//a.txt");
        //2.使用FileInputStream对象中的方法read，读取文件
        // int read()一次只读取一个字节并且返回，读取到文件末尾返回-1（windows）mac 好像是先10后-1？，调用read之后，指针就立即往后指一位
        int len = 0;
        while((len = fis.read()) != -1){
            System.out.println((char)len);
        }

        //3.释放资源
        fis.close();
    }
}
