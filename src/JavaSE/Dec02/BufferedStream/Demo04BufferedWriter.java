package JavaSE.Dec02.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
java.io.BufferedWriter extends Writer
BufferedWriter: 字符缓冲输出流

共性成员方法：
    void write(int c)
    void write(char[] cbuf)
    abstract void write(char[] cbuf, int off, int len)
    void write(String str)
    void write(String str, int off, int len)
    void flush()
    void close()

构造方法：
    BufferedWriter(Writer out)
    BufferedWriter(Writer out, int sz)

特有成员方法：
    void newLine() 写入一个行分隔符

 */
public class Demo04BufferedWriter {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter
                (new FileWriter("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//BufferedStream//h.txt"));
        //写
        for (int i = 0; i < 5; i++) {
            bw.write("leonkk");
            bw.newLine();
        }

        //刷新
        bw.flush();

        //释放
        bw.close();
    }
}
