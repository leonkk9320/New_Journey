package JavaSE.Nov2930.File;
/*
只要文件夹里的.java文件
 */
import java.io.File;

public class Demo11PracticeFileSearching {
    public static void main(String[] args) {
        File f = new File("//Users//leonzhang//Desktop//Java//src//JavaSE//Nov2930");
        getAllFile(f);
    }

    private static void getAllFile(File dir){
        File[] arr = dir.listFiles();
        for(File f : arr){
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                String s = f.getName();
                boolean b = s.endsWith(".java");
                if(b){
                    System.out.println(f);
                }

            }
        }
    }
}

