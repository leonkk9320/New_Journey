package JavaSE.Dec02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
java.util.OutputStreamWriter extends Writer
字符到字节到桥梁：可使用指定到charset将要写入流中的字符编码成字节（编码：字符->字节）

共性成员方法：
    void write(int c)
    void write(char[] cbuf)
    abstract void write(char[] cbuf, int off, int len)
    void write(String str)
    void write(String str, int off, int len)
    void flush()
    void close()
构造方法：
    OutputStreamWriter(OutputStream out)
    OutputStreamWriter(OutputStream out, String charsetName)    charsetName:指定编码表的名称
 */
public class Demo06OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();
    }

    private static void write_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter
                (new FileOutputStream("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//utf_8.txt"),
                        "utf-8");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
