package JavaSE.Nov2930.File;

import java.io.File;

public class Demo09Traversal {
    public static void main(String[] args) {
        show01();//list() 方法返回一个字符串数组，获取文件夹里的文件和文件夹的名字。路径不是目录或者不存在，空指针异常。可显示隐藏文件夹/文件。
        show02();//listFiles()连路径一起打印
    }

    private static void show02() {
        File file = new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov2930//File");
        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f);
        }
    }

    private static void show01() {
        File file = new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov2930//File");
        String[] arr = file.list();
        for(String s : arr){
            System.out.println(s);
        }
    }
}
