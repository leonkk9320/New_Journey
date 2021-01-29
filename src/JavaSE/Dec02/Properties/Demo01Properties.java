package JavaSE.Dec02.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
唯一与IO流相结合的集合
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();
    }

    /*
    硬盘->集合
    void load(InputStream inStream) 中文不可
    void load(Reader reader) 中文可
     */
    private static void show03() throws IOException {
        Properties prop = new Properties();
        //文件内容到prop集合
        prop.load(new FileReader("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//f.txt"));

        Set<String> set = prop.stringPropertyNames();

        for(String key : set){
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }

    /*
    集合数据->硬盘
    void store(OutputStream out, String comments) 不可以写中文，默认Unicode编码 写入一个字节编码一次？
    void store(Writer writer, String comments) 可以写中文
     */
    private static void show02() throws IOException {
        Properties prop = new Properties();//key value 都默认是字符串

        prop.setProperty("迪丽热巴", "168");
        prop.setProperty("古力娜扎", "166");
        prop.setProperty("玛尔扎哈", "164");

        FileWriter fw = new FileWriter
                ("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//f.txt");

        prop.store(fw, "use properties");

    }

    /*
    存储数据，并且遍历
        Object setProperty(String key, String value) 相当于put()
        String getProperty(String key) 相当于get()
        Set<String> stringPropertyNames() 相当于keySet()
     */
    private static void show01() {
        Properties prop = new Properties();//key value 都默认是字符串

        prop.setProperty("迪丽热巴", "168");
        prop.setProperty("古力娜扎", "166");
        prop.setProperty("玛尔扎哈", "164");

        Set<String> set = prop.stringPropertyNames();

        for(String key : set){
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }


    }
}
