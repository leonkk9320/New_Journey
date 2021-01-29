package JavaSE.Dec02.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
java.io.BufferedInputStream extends InputStream
BufferedInputStream: 字节缓冲输入流

子类共性方法：
    int read() 从输入流中读取数据的下一个字节
        return【The character read, or -1 if the end of the stream has been reached】
    int read(byte[] b) 从输入流中读取一定数量的字节，并且将其存储在缓冲区数组 b 中
        return【The number of characters read, or -1 if the end of the stream has been reached】
    void close() 关闭此输入流并且释放与该流关联的所有系统资源

构造方法：
    BufferedInputStream(InputStream in) 默认8KB
    BufferedInputStream(InputStream in, int size) size:指定缓冲区大小
 */
public class Demo03BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象，构造方法中绑定要读取到数据
        FileInputStream fis = new FileInputStream
                ("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//BufferedStream//g.txt");
        //创建BufferedInputStream对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        //读取
//        int len = 0; //记录读取到的字节
//        while((len = bis.read()) != -1){
//            System.out.println(len);
//        }

        byte[] bytes = new byte[1024];
        int len = 0; //每次读取的有效字节个数
        while((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }

        //释放
        bis.close();//缓冲流自动关闭字节流
    }
}
