/**
   This program utilizes the given class file to let computer and the user
   to play a dice game.
   CS110 Section A 
   Assignment 4
   @author Leon Zhang
*/
import java.util.Scanner;
public class DiceGame
{
   public static void main(String[] args)
   {
      String choice;
      int sides, value1, value2, com = 0, user = 0, tie = 0;//set variables
      Scanner keyboard = new Scanner(System.in);//create keyboard object
      System.out.print("Do you want to specify the sides?(y or n)");
      choice = keyboard.next();//ask user for input
      while(!choice.equals("y") && !choice.equals("n"))//make sure the user input y or n
      {
         System.out.print("You should enter y or n.");
         choice = keyboard.next();
      }
      if (choice.equals("y"))//situation that user wants to specify the sides
      {  
         System.out.print("How many sides do you want?");
         sides = keyboard.nextInt();//ask user for input
         Die d1 = new Die(sides);
         Die d2 = new Die(sides);//create objects and initialize the dice
         for(int i = 1; i <= 10; i++)//toss the die for 10 times
         {
            d1.roll();
            d2.roll();//toss the die          
            value1 = d1.getValue();
            value2 = d2.getValue();//call getValue method to get a value from the die
            if (value1 > value2)
               com++;
            if (value1 < value2)
               user++;
            if (value1 == value2)//compare two values and renew com, user, and tie
               tie++; 
         } 
      }
      else
      {
         Die d1 = new Die();
         Die d2 = new Die();//create objects and initialize the dice
         for(int i = 1; i <= 10; i++)//toss the die for 10 times
         {
            d1.roll();
            d2.roll();//toss the die
            value1 = d1.getValue();
            value2 = d2.getValue();//call getValue method to get a value from the die
            if (value1 > value2)
               com++;
            if (value1 < value2)
               user++;
            if (value1 == value2)//compare two values and renew com, user, and tie
               tie++;
         }
      }
      System.out.println("Computer...." + com);
      System.out.println("User........" + user);
      System.out.println("Ties........" + tie);//display the result for com, user and tie
      if (com > user)
         System.out.println("The computer is the grand winner!");
      if (user > com)
         System.out.println("The user is the grand winner!");
      if (user == com)
         System.out.println("The game has ended in a tie!");//compare com and user to determine the result of the game
   }
}