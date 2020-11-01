package JavaSE.Oct10;

import java.util.Scanner;

public class CheckLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input string: ");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNum++;
            } else {
                countOther++;
            }

        }
        System.out.println("They are: " + countLower + " " + countNum + " " + countOther + " " + countUpper);
    }


}
