package JavaSE.Nov31.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    FileOutputStream(String name, boolean append)   String name: 文件路径
    FileOutputStream(File file, boolean append)   File file: 文件
    true:创建对象不会覆盖源文件，接着在基础上写
    false:创建对象覆盖源文件
 */

public class Demo03OutputStreamAppend {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(
                new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov31//b.txt"),true);

        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\n".getBytes());
        }

    }
}
