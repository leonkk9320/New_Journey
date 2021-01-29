//Leon Zhang
//CS 110
//This program determines appropriate charges for package and for each
//package, calculates savings (if any) of choosing either other package  

import java.util.Scanner;
public class MobileServiceProvider
{
   public static void main(String[] args)
   {  
      final double FEE_A = 39.99,
                   FEE_B = 59.99,
                   FEE_C = 69.99,
                   ADDITIONAL_A = 0.45,
                   ADDITIONAL_B = 0.40,
                   MINUTE_A = 450.0,
                   MINUTE_B = 900.0;// create constants
      Scanner letter, minutes;// create reference variable
      letter = new Scanner(System.in);// instantiate object
      System.out.print("Enter the letter of the package you purchased(A, B, or C): ");// prompt
      String input1;
      input1 = letter.nextLine();// get input
      
      minutes = new Scanner(System.in);// instantiate object
      System.out.print("Enter the number of minutes that were used: "); // prompt
      double input2;  
      input2 = minutes.nextDouble();// get input
      
      
      double charges1;
      double charges2;
      
      charges1 = FEE_A + (input2 - MINUTE_A)*ADDITIONAL_A;
      charges2 = FEE_B + (input2 - MINUTE_B)*ADDITIONAL_B;//calculate charges
      
      double charges;
      double save;
      
      if(input1.equalsIgnoreCase("A"))//decide the package user bought
      {
         if(input2 <= MINUTE_A)//compare minutes
         {
            System.out.printf("Your total charge is $%.2f\n",FEE_A);//display total charge
         }
         else
         {
            System.out.printf("Your total charge is $%.2f\n",charges1);//display total charge
            if(charges1 > charges2)//compare charges
            {
               save = charges1 - charges2;// calculate money saved
               System.out.printf("You would save $%.2f if you purchased package B\n", save);//display total save
            }
            if(charges1 > FEE_C)//compare charges
            {
               save = charges1 - FEE_C;// calculate money saved
               System.out.printf("You would save $%.2f if you purchased package C", save);//display total save
            }
            
         }
      }
      else if(input1.equalsIgnoreCase("B"))//decide the package user bought
      {
         if(input2 <= MINUTE_B)//compare minutes
         {
            System.out.printf("Your total charge is $%.2f\n",FEE_B);//display total charge
         }
         else
         {
            System.out.printf("Your total charge is $%.2f\n",charges2);//display total charge
            if(charges2 > FEE_C)//compare charges
            {
               save = charges2 - FEE_C;// calculate money saved
               System.out.printf("You would save $%.2f if you purchased package C", save);//display total save
               
            }
         }
      }
      else if(input1.equalsIgnoreCase("C"))//decide the package user bought
      {
         System.out.printf("Your total charge is $%.2f\n",FEE_C);//display total charge
      }
      else
      {
         System.out.println(input1 + "is not a valid package.");//handle error
      }
      
   }

}