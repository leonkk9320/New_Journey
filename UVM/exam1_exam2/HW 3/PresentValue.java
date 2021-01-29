//Leon Zhang
//CS 110
//This program will calculate the amount of money you should
//deposit if you want a certain amount of money in several 
//years later.

import java.util.Scanner;
public class PresentValue
{
   public static void main(String[] args)
   {
      double presentMoney,
             annualRate;
      int futureValue,
          numberYears;//create variables
      Scanner keyboard = new Scanner(System.in);//initiate an object
      System.out.print("What is the desired future value? ");
      futureValue = keyboard.nextInt();//ask user for input
      System.out.print("What is annual interest rate (%)? ");
      annualRate = keyboard.nextDouble();//ask user for input
      System.out.print("For how many years? "); 
      numberYears = keyboard.nextInt();//ask user for input
      presentMoney = presentValue(futureValue, annualRate, numberYears);//use the method to get a value 
      System.out.printf("You need to invest $%,.2f", presentMoney);//display the result         
   }
   
   /**
      The presentValue method receive future value, annual interest rate and number of years,
      then calculate the amount of money user should invest. The invest is returned.
      @param x Future value
      @param y Annual interest rate 
      @param z Number of years
      @return The amount of money user should invest
   */
   public static double presentValue(int x, double y, int c)
   {
      final int HUNDREDPERCENT = 100;
      double invest;//create variables
      invest = x / Math.pow((1+y/HUNDREDPERCENT),c);//calculate the value
      return invest;//return value
   }
} 