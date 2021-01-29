/**
   This program utilizes the given class file to let computer and the user
   to play a dice game.
   CS110 Section A 
   Assignment 4
   @author Leon Zhang
*/
public class TossingCoins
{
   public static void main(String[] args)
   {
      double balance = 0;//set the initial balance 
      final double QUARTER = 0.25,
                   DIME = 0.1,
                   NICKEL = 0.05;//assign amount of cents for each kind of coins
      Coin quarter = new Coin();
      Coin dime = new Coin();
      Coin nickel = new Coin();//create objects for each kind of coins
            
      while(balance < 1)//do the loop until total balance is larger or equal to one
      {
         quarter.toss();//call the toss method to randomly toss a quarter 
         if (quarter.getSideUp().equals("heads"))//up side is "heads"
         {
            balance += QUARTER; //renew balance
         }
         dime.toss();//call the toss method to randomly toss a dime
         if (dime.getSideUp().equals("heads"))//up side is "heads"
         {
            balance += DIME; //renew balance
         }
         nickel.toss();//call the toss method to randomly toss a nickel
         if (nickel.getSideUp().equals("heads"))//up side is "heads"
         {
            balance += NICKEL; //renew balance
         } 
      }
      
      System.out.printf("Balance: $%.2f\n", balance);//display the balance
      if (balance == 1)
         System.out.println("You win.");
      else
         System.out.println("You did not win.");// determine whether user wins or not
      
   }
}