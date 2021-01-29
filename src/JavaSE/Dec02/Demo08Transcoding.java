package JavaSE.Dec02;

import java.io.*;

/*
UTF-8 -> GBK
 */
public class Demo08Transcoding {
    public static void main(String[] args) throws IOException {
        //创建输入转换流，读utf-8
        InputStreamReader isr = new InputStreamReader
                (new FileInputStream("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//utf_8.txt"),
                        "utf-8");

        //创建输出转换流, 写GBK
        OutputStreamWriter osw = new OutputStreamWriter
                (new FileOutputStream("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//GBK.txt"),
                        "GBK");

        int len = 0;
        //InputStreamReader读取每一个字节
        while((len = isr.read()) != -1){
            //OutputStreamWriter写入每一个字节
            osw.write(len);
        }
        //释放资源
        isr.close();
        osw.close();
    }
}
