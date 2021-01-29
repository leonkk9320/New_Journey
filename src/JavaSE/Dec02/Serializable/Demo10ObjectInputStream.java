package JavaSE.Dec02.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
java.io.ObjectInputStream extends InputStream
ObjectInputStream: 对象的【反】序列化流，把文件中保存的对象，以流的方式读取出来使用

构造方法：
    ObjectInputStream(InputStream in)

特有成员方法：
    Object readObject() 从ObjectInputStream中读取对象
 */
public class Demo10ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//Serializable//Person.txt"));

        Object o = ois.readObject();

        ois.close();

        System.out.println(o);
    }
}
