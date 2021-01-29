package JavaSE.Dec02.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
java.io.ObjectOutputStream extends OutputStream
ObjectOutputStream: 对象的序列化流，把对象以流的方式（二进制数组）写入文件保存

构造方法：
    ObjectOutputStream(OutputStream out)

特有方法：
    void writeObject(Object obj): 把对象【写入】ObjectOutputStream流中
 */
public class Demo09ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//Serializable//Person.txt"));

        oos.writeObject(new Person("小美女", 18));

        oos.close();
    }

}
