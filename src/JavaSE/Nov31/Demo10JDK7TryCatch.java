package JavaSE.Nov31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
使用throws抛出IOException, 会无法释放资源（流对象），要使用IOException在finally代码块里写.close()方法，
但是十分复杂（考虑到try的作用域 和 .close()方法抛出异常）

JDK7 新特性：try(){}  ()可以写声明流对象 (声明流对象;声明流对象;声明流对象...)，try执行后【自动】释放流对象，不用写finally

 */
public class Demo10JDK7TryCatch {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("//Users//leonzhang//Desktop//blank.pdf");
            FileOutputStream fos = new FileOutputStream("//Users//leonzhang//Desktop//Java//copy.pdf")){
            byte[] b = new byte[1024];
            int len = 0;
            while((len = fis.read(b)) != -1){//一次读取1024字节
                fos.write(b, 0, len);//从0索引开始，一次写len长度的字节
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
