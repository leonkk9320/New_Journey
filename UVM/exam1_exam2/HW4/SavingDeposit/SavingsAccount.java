import java.util.Scanner;
/**
   claculte the balance change for each deposit and withdrawal, the earned interest,
   and the ending balance
*/
public class SavingsAccount
{
   private double balance;//money that user has
   private double interestRate;//yearly interest rate
   private double lastInterest;//earned interest
   
     
   /**
      The constructor receive balance and interest rate values and pass them to the 
      local private variables 
      @param double newBalance
      @param double newInterestRate 
   */
   public SavingsAccount(double newBalance, double newInterestRate)
   {
      balance = newBalance;
      interestRate = newInterestRate;//pass value to balance and interestRate
   }
   
   /**
      The withdraw method receives the amount of withdrawal and renews the balance
      @para double wAmount
   */
   public void withdraw(double wAmount)
   {
      balance -= wAmount;//substract wAmount
   }
   
   /**
      The deposit method receives the amount of deposit and renews the balance
      @param double dAmount
   */
   public void deposit(double dAmount)
   {
      balance += dAmount;//add dAmount 
   }
   
   
   /**
      The addInterest method calculate the ending balance
   */
   public void addInterest()
   {
      balance += lastInterest;//add lastInterest
   }
   
   
   /**
      The getBalance method returns the balance
      @return double balance
   */
   public double getBalance()
   {
      return balance;// return balance
   }
   
   
   /**
      The getInterestRate method returns the interest rate
      @return double interestRate
   */
   public double getInterestRate()
   {
      return interestRate;// return interest rate
   }
   
   
   /**
      The getLastInterest method calculates the lastInterest and return its value
      @return double lastInterest
   */
   public double getLastInterest()
   {
      lastInterest = balance * (interestRate / 100 / 12);//calculate last interest
      return lastInterest;//return last interest
   }
}