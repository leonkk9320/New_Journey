package JavaSE.Nov31;

import java.io.FileWriter;
import java.io.IOException;

/*
java.io.Writer: 文件字符输出流，是所有字符输出流的父类，是一个抽象类

共性成员方法：
    void write(int c)
    void write(char[] cbuf)
    abstract void write(char[] cbuf, int off, int len)
    void write(String str)
    void write(String str, int off, int len)
    void flush()
    void close()

java.io.FileWriter extends OutputStreamWriter extends Writer
FileWriter: 文件字符输出流
作用：把文件中的字符写入到文件中

构造方法：
    FileWriter(File file)
    FileWriter(String fileName)

    FileWriter(File file, boolean append)
    FileWriter(String fileName, boolean append)
    续写：true可在已有源文件续写，false覆盖源文件

字符输出流的使用步骤：
    1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
    2.使用FileWriter中的方法write，把数据写入到内存缓冲区中（字符转换为字节）
    3.使用FileWriter中的方法flush()，把内存中的数据，刷新到文件中
    4.释放资源（会先把内存缓冲区中的数据刷新到文件中）

 */
public class Demo09Writer {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter
                ("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov31//OutputStream//d.txt");//会创建d.txt
        //2.使用FileWriter中的方法write，把数据写入到内存缓冲区中（字符转换为字节）
        fw.write(97);//目前只是写到了内存缓冲区里面
        fw.write("程序员没头发", 3,3);
        fw.write("程序员没头发");



        //3.使用FileWriter中的方法flush()，把内存中的数据，刷新到文件中
        //fw.flush();//刷新之后，流可以继续使用
        //4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
        fw.close();//刷新，然后释放资源，不能继续使用流
    }
}
