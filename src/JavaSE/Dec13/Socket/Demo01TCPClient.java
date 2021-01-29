package JavaSE.Dec13.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
表示客户端的类：
java.net.Socket: 实现客户端套接字（包含IP地址和端口号的网络单位）
socket 的中文： 套接字。。。。

构造方法：
Socket(String host, int port)
String host：IP地址/服务器主机名称
int port：端口号

成员方法：
OutputStream getOutputStream() 返回套接字输出流
InputStream getInputStream() 返回套接字输出流
void close() 关闭套接字
 */
public class Demo01TCPClient {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket s1 = new Socket("127.0.0.1", 8888);
        //写出数据
        OutputStream os = s1.getOutputStream();
        os.write("你好服务器".getBytes());
        //接收数据
        InputStream is = s1.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));//内容少，不需要while循环
        //关闭资源
        s1.close();
    }
}
