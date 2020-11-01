package JavaSE.API.Random;

import java.util.Random;
public class Demo1 {
    public static void main(String[] args) {
        Random rm = new Random();
        int n = rm.nextInt();
        int num = rm.nextInt(10);//[0,9)
        System.out.println("random number is: " + n + "and " + num);
    }
}
