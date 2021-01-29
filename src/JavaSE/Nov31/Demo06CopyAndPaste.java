package JavaSE.Nov31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
复制粘贴一个图片
 */
public class Demo06CopyAndPaste {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("//Users//leonzhang//Desktop//blank.pdf");
        FileOutputStream fos = new FileOutputStream("//Users//leonzhang//Desktop//Java//copy.pdf");

//        int len = 0;
//        while((len = fis.read()) != -1){
//            fos.write(len);
//        }

        //数组缓冲读取，写入多个字节，有buffer，速度更快
        byte[] b = new byte[1024];
        int len = 0;
        while((len = fis.read(b)) != -1){//一次读取1024字节
            fos.write(b, 0, len);//从0索引开始，一次写len长度的字节
        }

        fis.close();
        fos.close();
    }
}
