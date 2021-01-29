package JavaSE.Nov31;

import java.io.FileReader;
import java.io.IOException;

/*
java.io.Reader: 【字符】输入流，抽象类
是字符输入流最顶层的父类，定义了一些共性成员方法：

int read()
int read(char[] cbuf)
void close()

java.io.FileReader extends InputStreamReader extends Reader
FileReader: 文件字符输入流
作用：把硬盘文件的数据以字符的方式读取到内存中

构造方法：
    FileReader(String filename)
    FileReader(File file)

字符输入流的使用步骤：
    1.创建FileReader对象，构造方法中绑定要读取的数据源
    2.使用FileReader对象的方法read读取文件
    3.释放资源
 */
public class Demo08Reader {
    public static void main(String[] args)throws IOException {
        //1.创建FileReader对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov31//OutputStream//b.txt");

        //2.使用FileReader对象的方法read读取文件
//        int len = 0; //len: 以int形式表示一个字符
//        while((len = fr.read()) != -1){
//            System.out.println((char)len);
//        }
        int len = 0; //每次读取有效字符的个数
        char[] c = new char[1024];//字符流， char[]数组
        while((len = fr.read(c)) != -1){
            System.out.println(new String(c, 0, len));
        }

        //3.释放资源
        fr.close();
    }
}
