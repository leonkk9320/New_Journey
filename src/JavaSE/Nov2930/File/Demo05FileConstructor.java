package JavaSE.Nov2930.File;

import java.io.File;

/*
java.io.File
文件和路径的抽象表示形式。
Java把电脑中的文件和文件夹（目录）封装成了一个File类，我们可以使用File类对文件和文件夹进行操作。
操作：
    新建 文件夹/文件
    删除  ...
    判断存在 ...
    对文件夹进行遍历
    获取文件大小

file 文件
directory 文件夹
path 路径

java 用 \\ 表示 \ ， 一个 \ 表示转义字符
 */
public class Demo05FileConstructor {
    public static void main(String[] args) {
        show01();
        System.out.println("========");
        show02("c://", "a.txt");//分割后使用灵活
        System.out.println("========");
        show03();
    }

    private static void show03() {
        File p = new File("c:\\");
        File f = new File(p, "hello.java");
        System.out.println(f);
    }


    /*
    File(String pathname) 通过将指定路径名字符串转换为抽象路径名来创建一个新的File实例
    参数：
        路径可以是 文件/文件夹  相对路径/绝对路径  可以存在/不存在（创建File对象，只是把字符串路径封装为File对象，不考虑路径真假）
     */
    private static void show01(){
        File f1 = new File("//Users//leonzhang//Desktop//blank.pdf");//文件名
        System.out.println(f1); //重写了toString

        File f2 = new File("//Users//leonzhang//Desktop");//文件夹
        System.out.println(f2);

        File f3 = new File("blank.pdf");//相对路径
        System.out.println(f3);
    }

    private static void show02(String parent, String child){
        File f = new File(parent, child);
        System.out.println(f);
    }
}
