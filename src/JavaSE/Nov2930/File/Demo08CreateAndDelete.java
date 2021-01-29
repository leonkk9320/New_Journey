package JavaSE.Nov2930.File;

import java.io.File;
import java.io.IOException;

public class Demo08CreateAndDelete {
    public static void main(String[] args) throws IOException {
        show01();//createNewFile() 创建文件，之前没有此路径文件返回true，有此文件路径发生冲突，或路径错误返回false
        System.out.println("======");
        show02();//mkdir()一个文件夹， mkdirs()多级文件夹
        System.out.println("======");
        show03();//delete()删除文件或文件夹 不走回收站，直接在硬盘上删除，谨慎

    }

    private static void show03() {
        File f1 = new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov2930//File//文件夹//111//222//333");
        boolean b = f1.delete();
        System.out.println("b: " + b);
    }

    private static void show02() {
        File f1 = new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov2930//File//文件夹");
        boolean b1 = f1.mkdir();
        System.out.println("b1: " + b1);

        File f2 = new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov2930//File//文件夹//111//222//333");
        boolean b2 = f2.mkdirs();
        System.out.println("b2: " + b2);
    }

    private static void show01() throws IOException {
        File f1 = new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov2930//File//1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1: " + b1);
    }
}
