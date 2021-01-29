package JavaSE.Dec13.Socket;
/*
java.net.ServerSocket: 实现服务器端的套嵌字

构造方法：
ServerSocket(int port) 创建绑定特定端口的服务器套嵌字，要这个对象来调用accept方法

Socket accept(); 获取客户端对象socket
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo02TCPServer {
    public static void main(String[] args) throws IOException {
        //创建server对象
        ServerSocket server = new ServerSocket(8888);
        //获取socket对象
        Socket socket = server.accept();
        //接收数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        //写出数据
        OutputStream os = socket.getOutputStream();
        os.write("收到谢谢".getBytes());
        //关闭资源
        socket.close();
        server.close();
    }
}
