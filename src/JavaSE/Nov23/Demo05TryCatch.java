package JavaSE.Nov23;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
try...catch...: 异常处理的第二种方法【相比throws，可以继续执行后续代码】
格式：
    try{
        可能产生异常的代码
    }catch(定义一个异常变量，用来接收try中抛出的异常对象){
        异常处理的逻辑，如何处理异常
        一般在工作中，会把异常记录到一个日志当中
    }
    ...
    catch(异常对象 变量名){

    }
【相当于产生的异常，抛到catch里】

注意：
1.try中可能有多个异常，那么就可以使用多个catch来处理这些异常对象
2.try catch之后会继续执行后续代码
 */
public class Demo05TryCatch {
    public static void main(String[] args){

//        readFile("c:\\a.tx");

        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            System.out.println("文件名不对");
        }

        System.out.println("后续代码");
    }


    //可以在方法内抛出，没有问题，但是会接着打印"路径没问题，读取文件"， 与当前情形不相符， 我们想直接抛出，不执行当前方法后续代码
    private static void readFile(String n) throws FileNotFoundException {
        if(!n.equals("c:\\a.txt")){
            throw new FileNotFoundException("路径不是c:\\a.txt");
        }

//        if(!n.equals("c:\\a.txt")){
//            try {
//                throw new FileNotFoundException("路径不是c:\\a.txt");
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }

        System.out.println("路径没问题，读取文件");
    }
}

