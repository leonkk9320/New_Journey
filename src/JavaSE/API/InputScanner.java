package JavaSE.API;
/*
1. 导包
import 包路径.类名称；
目标类与当前类在同一包下，可以省略导包语句
java.lang不需要导包（含有String）
2. 创建
类名称 对象名 = new 类名称（）；
3. 使用
对象名.成员方法名（）
 */
import java.util.Scanner;
public class InputScanner {
    public static void main(String[] args) {
        //System.in  从键盘输入
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt(); // int nextInt()
        String str = keyboard.next(); // String next()
        //键盘输入永远是字符串，所以是next(), nextInt()是将字符串转换为int
        System.out.println(num + str);
    }
}
