package JavaSE.Dec02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
java.util.InputStreamReader extends Reader
字节到字符到桥梁：解码：字节->字符

共性方法：
int read()
int read(char[] cbuf)
void close()

构造方法：
    InputStreamReader(InputStream in)
    InputStreamReader(InputStream in, String charsetName)

 */
public class Demo07InputStreamReader {
    public static void main(String[] args) throws IOException {
        read_utf_8();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader
                (new FileInputStream("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//utf_8.txt"),"utf-8");

        int len = 0;
        while((len = isr.read()) != -1){
            System.out.println((char)len);
        }

        isr.close();
    }
}
