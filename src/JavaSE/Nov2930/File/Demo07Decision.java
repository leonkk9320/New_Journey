package JavaSE.Nov2930.File;

import java.io.File;

public class Demo07Decision {
    public static void main(String[] args) {
        show01();//exists() 路径是否存在
        System.out.println("=======");
        show02();//isDirectory() isFile() 判断是否是文件或者文件夹，若无效路径，都是false
    }

    private static void show02() {
        File f1 = new File("//Users//leonzhang//Desktop//blank.pdf");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
    }

    private static void show01() {
        File f1 = new File("//Users//leonzhang//Desktop//blank.pdf");
        System.out.println(f1.exists());

        File f2 = new File("//Users//leonzhang//Desktop//bank.pdf");
        System.out.println(f2.exists());

        File f3 = new File("blank.pdf");//必须在本文件夹下，才能显示true
        System.out.println(f3.exists());
    }
}
