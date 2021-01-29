package JavaSE.Nov2930.File;
/*
只要文件夹里的.java文件
 */

import java.io.File;

public class Demo12FileFilter {
    private static Object FileFilter;

    public static void main(String[] args) {
        File f = new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov2930");
        getAllFile(f);
    }

    private static void getAllFile(File dir) {
        //listFiles会把遍历的每一个File对象传递给accept方法
        //返回true就把File对象给arr，否则不给
        File[] arr = dir.listFiles(new FileFilterimpl());
        for (File f : arr) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
}

