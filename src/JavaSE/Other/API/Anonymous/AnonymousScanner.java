package JavaSE.Other.API.Anonymous;

import java.util.Scanner;

public class AnonymousScanner {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //use anonymous object
        int num = new Scanner(System.in).nextInt();
        System.out.println("typed in: " + num);
        //anonymous object as param
        methodParam(new Scanner(System.in));
        //anonymous object as return
        Scanner keyboard = methodReturn();
        int integer = keyboard.nextInt();
        System.out.println("we typed: " + integer);
    }

    public static void methodParam(Scanner sc){
        int i = sc.nextInt();
        System.out.println("typed in: " + i);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
