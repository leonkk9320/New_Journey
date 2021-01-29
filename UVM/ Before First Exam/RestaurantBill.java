/*
Write a program that computes the tax and tip on a restaurant bill.  
The program should ask the user to enter the charge for the meal. 
The tax should be 6.75 percent of the meal charge. The tip should be 
15 percent of total before adding tax.  Display the meal charge, tax 
amount, tip amount, and total bill.
*/
// Jackie Horton
// CS110
// Calculate restaurant bill

import java.util.Scanner; 
public class RestaurantBill
{
   public static void main(String[] args)
   {
      // constants
      final double TAX_PERCENT = 6.75;
      final int TIP_PERCENT_OK = 15;
      final int TIP_PERCENT_GOOD = 18;
      final int TIP_PERCENT_EXCELLENT = 20;
      
      // variables
      double mealCharge;
      double tax;
      double tip;
      double total; // total of meal + tax + tip
      String quality;
      Scanner input = new Scanner(System.in);
      
      // get cost of meal
      System.out.print("How much was your meal? ");
      mealCharge = input.nextDouble();
      
      input.nextLine(); // 'eats the newline'
      System.out.print("How was your service (OK, GOOD, EXCELLENT)? ");
      quality = input.nextLine();
     /* if (quality.equalsIgnoreCase("OK"))
      {      
         tip = mealCharge * TIP_PERCENT_OK / 100;
      }
      else if(quality.equalsIgnoreCase("Good"))
      {
         tip = mealCharge * TIP_PERCENT_Good / 100;
      }
      else if(quality.equalsIgnoreCase("Excellent"))
      {
         tip = mealCharge * TIP_PERCENT_EXCELLENT / 100;
      }

      else
      {
         tip = 0;
      }*/
      
      switch(quality.toUpperCase())
      {
         case "OK": tip = mealCharge * TIP_PERCENT_OK / 100;
         break;

         case "GOOD":
         case "EXCELLENT":
      }
      
      // calculate tax tip and total
      tax = mealCharge * TAX_PERCENT / 100;
      
      total = mealCharge + tax + tip;
      
      // display totals
      System.out.printf("MealCharge:     $%6.2f\n", mealCharge);
      System.out.printf("Tax:            $%6.2f\n", tax);
      System.out.printf("Tip:            $%6.2f\n", tip);
      System.out.printf("Total:          $%6.2f\n", total);
      
      
      
   }
}