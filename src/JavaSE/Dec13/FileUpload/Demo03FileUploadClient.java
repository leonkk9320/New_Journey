package JavaSE.Dec13.FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
上传文件：
    客户端/服务器 和 本地硬盘进行读写， 使用自己创建的字节流对象（本地流）
    客户端 和 服务器之间进行读写，必须使用Socket中提供的字节流对象（网络流）
 */
public class Demo03FileUploadClient {
    public static void main(String[] args) throws IOException {
        //本地字节输入流 硬盘 -> 内存
        FileInputStream fis = new FileInputStream("//Users//leonzhang//Desktop//blank.pdf");
        //获取网络字节输出流
        Socket socket = new Socket("127.0.0.1", 8899);
        OutputStream os = socket.getOutputStream();
        //从文件字节输入流读取
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            //网络输出流写出
            os.write(bytes, 0, len);//文件结束标记符-1不会被写出给Server，Server 中 read不到-1，进入阻塞状态
        }

        //添加结束符号，传输给服务器
        socket.shutdownOutput();

        //读取服务器发来的内容
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1) {

            System.out.println(new String(bytes, 0, len));
        }

        //释放资源
        fis.close();
        socket.close();
    }
}
