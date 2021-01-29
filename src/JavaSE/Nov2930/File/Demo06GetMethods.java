package JavaSE.Nov2930.File;

import java.io.File;

public class Demo06GetMethods {
    public static void main(String[] args) {
        show01();//getAbsolutePath() 传递绝或者相对，输出都是绝对
        System.out.println("=======");
        show02();//getPath() 就是toString的源码，输入啥输出啥
        System.out.println("=======");
        show03();//getName() 文件或者目录名字，即结尾部分
        System.out.println("=======");
        show04();//length() 返回long, 字节为单位，只能是文件，不能是文件夹。无效地址，返回字节数为0
    }

    private static void show04() {
        File f1 = new File("//Users//leonzhang//Desktop//blank.pdf");
        long l = f1.length();
        System.out.println(l);
    }

    private static void show03() {
        File f1 = new File("//Users//leonzhang//Desktop//blank.pdf");
        String s = f1.getName();
        System.out.println(s);

    }

    private static void show02() {
        File f1 = new File("//Users//leonzhang//Desktop//blank.pdf");
        String path1 = f1.getPath();
        System.out.println(path1);

        File f2 = new File("blank.pdf");
        String path2 = f2.getPath();
        System.out.println(path2);
    }

    private static void show01() {
        File f1 = new File("//Users//leonzhang//Desktop//blank.pdf");
        String abPath1 = f1.getAbsolutePath();
        System.out.println(abPath1);

        File f2 = new File("blank.pdf");
        String abPath2 = f2.getAbsolutePath();
        System.out.println(abPath2);
    }
}
