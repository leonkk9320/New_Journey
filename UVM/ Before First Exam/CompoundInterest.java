/*Leon Zhang
  CS110A
  Homework#1
 */

import java.util.Scanner;
public class CompoundInterest
{
   public static void main(String []args)
   {
      Scanner amt, interest, times, years;// create reference variable
      amt = new Scanner(System.in);// instantiate object
      System.out.print("What is the original principal? ");// prompt
      double input1;
      input1 = amt.nextDouble();// get input
      
      interest = new Scanner(System.in);// instantiate object
      System.out.print("What is the annual interest rate? ");// prompt
      double input2;
      input2 = interest.nextDouble();// get input
      
      times = new Scanner(System.in);// instantiate object
      System.out.print("How many times per year is interest compounded? ");// prompt
      int input3;
      input3 = times.nextInt();// get input
      
      years = new Scanner(System.in);// instantiate object
      System.out.print("For how many years will interest be compounded? ");// prompt
      int input4;
      input4 = years.nextInt();// get input
      
      double result;
      result= input1 * Math.pow((1 + input2/ 100 / input3),(input3*input4));//calculate the result
      
            
      System.out.printf("After %d years you will have $%.2f",input4, result);// display the result
      }
}
      