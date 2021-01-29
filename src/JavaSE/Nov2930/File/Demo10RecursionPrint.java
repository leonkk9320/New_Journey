package JavaSE.Nov2930.File;

import java.io.File;

public class Demo10RecursionPrint {
    public static void main(String[] args) {
        File f = new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov2930");
        getAllFile(f);
    }

    private static void getAllFile(File dir){
        File[] arr = dir.listFiles();
//        for(File f : arr){
//            System.out.println(f);
//        }
//        //File
//        //ThreadPool
//        //Lambda 不全！
        for(File f : arr){
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
