package JavaSE.Nov23;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
try...catch..finally
常用于资源释放（IO流）
无论又没有异常，都执行finally
 */
public class Demo06Finally {
    public static void main(String[] args){
        try {
            readFile("c:\\a.txt");
        } catch (IOException e) {
            System.out.println("文件名不对");
        } finally {
            System.out.println("资源释放");
        }


    }

    private static void readFile(String n) throws FileNotFoundException {
        if(!n.equals("c:\\a.txt")){
            throw new FileNotFoundException("路径不是c:\\a.txt");
        }

        System.out.println("路径没问题，读取文件");
    }
}
