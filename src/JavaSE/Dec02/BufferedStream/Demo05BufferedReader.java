package JavaSE.Dec02.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
java.io.BufferedReader extends Reader

共性方法：
int read()
int read(char[] cbuf)
void close()

构造方法：
    BufferedReader(Reader in)
    BufferedReader(Reader in, int sz)

特有成员方法：
    String readLine() 读取一行
    到达流末尾返回null(因为return type是String)
 */
public class Demo05BufferedReader {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader
                (new FileReader("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//BufferedStream//h.txt"));
        //读
        String line;
        while((line = br.readLine()) != null){//readLine()读取一次会自动指向下一行
            System.out.println(line);
        }


    }
}
