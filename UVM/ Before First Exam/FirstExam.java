import java.util.Scanner;

public class FirstExam
{
   public static void main(String[] args)   
   {  
      double numSugar, numFlour, numButter;
      final double SUGAR = 1.5,
                   BUTTER = 1.0,
                   FLOUR = 2.75,
                   COOKIES = 48;
                
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the number of cookies: ");
      int numCookies = keyboard.nextInt();
      numSugar = numCookies/COOKIES*SUGAR;
      numFlour = numCookies/COOKIES*FLOUR;
      numButter = numCookies/COOKIES*BUTTER;
      System.out.println("To make 153 cookies, you will need");
      System.out.printf("%.1f cups of sugar\n", numSugar);
      System.out.printf("%.1f cups of butter\n", numButter);
      System.out.printf("%.1f cups of flour\n", numFlour);
       
   }

}