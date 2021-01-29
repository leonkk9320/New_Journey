package JavaSE.Nov2930.File;

import java.io.File;


public class Demo13FileFilterInnerClassAndLambda {
    private static Object FileFilter;

    public static void main(String[] args) {
        File f = new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov2930");
        getAllFile(f);
    }

    private static void getAllFile(File dir) {
        File[] arr = dir.listFiles((pathname) -> pathname.isDirectory() || pathname.getName().endsWith(".java"));
        for (File f : arr) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
}