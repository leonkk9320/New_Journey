/**
   This program asks user for initial balance and interest rate helps user to calculate
   and display the change of the balance and show the earned interest and total balance 
   of a month 
   CS110 Section A 
   Assignment 4
   @author Leon Zhang
*/
import java.util.Scanner;
import java.io.*;
public class DepositsAndWithdrawls
{
   public static void main(String[] args) throws IOException
   {
      double sBalance, annualRate, dep, wit;//set variables
      Scanner keyboard = new Scanner(System.in);//create keyboard objects
      System.out.print("Enter the savings account's annual interest rate: ");
      annualRate = keyboard.nextDouble();//ask user for input(interest rate)
      
      System.out.print("Starting Balance: $");
      sBalance = keyboard.nextDouble();//ask user for input(starting balance)
      
      SavingsAccount account = new SavingsAccount(sBalance, annualRate);//create account object and give value to sBalance and annualRate
      
      File f1 = new File("Deposits.txt");
      Scanner infile1 = new Scanner(f1);//open deposits file
      while(infile1.hasNextDouble())//read each value in the file
      {
         dep = infile1.nextDouble();//give the value to dep variable
         account.deposit(dep);//call the deposit method to renew balance
         System.out.printf("Deposit: $%.2f, balance = $%.2f\n", dep, account.getBalance());//call getBalance method to get the value of balance and display the result
      }
      
      File f2 = new File("Withdrawals.txt");
      Scanner infile2 = new Scanner(f2);//open withdrawals file
      while(infile2.hasNextDouble())//read each value in the file
      {
         wit = infile2.nextDouble();//give the value to wit variable
         account.withdraw(wit);//call the withdraw method to renew balance
         System.out.printf("Withdraw: $%.2f, balance = $%.2f\n", wit, account.getBalance());//call getBalance method to get the value of balance and display the result
      }
      
     
      System.out.printf("Interest earned: $%.2f\n", account.getLastInterest());//call getLastInterest method to calculate and get the value of earned interest and display the result
      
      account.addInterest();//call addInterest method to calculate the ending balance
      System.out.printf("Ending balance: $%.2f", account.getBalance());//call getBalance method to get the ending balance and display the result
      
      infile1.close();
      infile2.close();// close two files
   }
}
 
 
 
 
