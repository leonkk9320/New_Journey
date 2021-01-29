package JavaSE.Dec13.FileUpload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo04FileUploadServer {
    public static void main(String[] args) throws IOException {
        //获取socket
        ServerSocket server = new ServerSocket(8899);
        //使得服务器一直开启
        while (true) {
            //Listens for a connection to be made to this socket and accepts it.
            //监听状态，程序在此暂停，有客户端socket进入才继续执行
            Socket socket = server.accept();
            System.out.println(socket);
            //使用多线程提高效率,允许多个客户端执行操作
            new Thread(() -> {
                //原run方法没有抛出异常，重写run方法就不能写抛出异常
                try {
                    //Socket socket = server.accept(); //写这里会无限分配新线程，会out of (VM) memory

                    //获取网络输入流
                    InputStream is = socket.getInputStream();

                    String fileName = System.currentTimeMillis() + "copy.pdf";
                    //获取服务器输出流
                    FileOutputStream fos = new
                            FileOutputStream("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec13//FileUpload//" + fileName);

                    //用网络输入流读取，用服务器输出流写出
                    int len;
                    byte[] bytes = new byte[1024];
                    //如果不写shutdownOutput()，read 会进入阻塞状态
                    while ((len = is.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }

                    //回写"上传成功"
                    //获取网络输出流,写出"上传成功"
                    socket.getOutputStream().write("上传成功".getBytes());

                    //释放资源
                    fos.close();
                    socket.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }).start();
        }
    }
}
