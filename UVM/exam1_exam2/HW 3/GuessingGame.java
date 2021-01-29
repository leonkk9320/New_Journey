//Leon Zhang
//CS 110
//This program generates a random number and asks the user to guess
//what the number is. 
import java.util.Random;
import java.util.Scanner;
public class GuessingGame
{
   public static void main(String[] args)
   {
      int guess,
          number,
          times = 2,
          finalTry1,
          finalTry2;//create variables
      final int LOWER = 1,
                UPPER = 100,
                TRIES = 5;//create constants
                
      finalTry1 = TRIES + 1;
      finalTry2 = TRIES + 2;//set value to variables finalTry1 and finalTry2.
      
      System.out.printf("I'm thinking of a number between %d and %d\n", LOWER, UPPER);
      System.out.printf("You have %d tries to guess it\n", TRIES);//print out the question for user
      Random rand = new Random();
      number = rand.nextInt(UPPER)+1;//generate a random number
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Guess 1: ");
      guess = keyboard.nextInt();//ask user for input
      
      if(guess == number)//determine if user can guess out the number in one time
      {
         System.out.println("Congratulations! You guessed it!");
         System.out.println("You got it right in 1 guess.");//display the result
         times = finalTry2;//set the value of finalTry2 to times so that the last statement won't print out
      }
      else
      {
         while(times <= TRIES && times != finalTry1)//create a while loop to make sure user can guess limited times
         {
            if(guess == number)//situation for guessing correctly in more than one time
            {
               System.out.println("Congratulations! You guessed it!");
               System.out.printf("You got it right in %d guess.\n", times-1);//display the result
               times = finalTry2;//set the value of finalTry2 to times so that the last statement won't print out
            }
            else//situation for guessing wrongly
            {
               if(guess > number)//compare user's guess and the random number
               {
                  System.out.println("Sorry, that's too high.");//display the result
               }
               if(guess < number)//compare user's guess and the random number
               {
                  System.out.println("No, that's too low.");//display the result
               }
               System.out.print("Guess again: ");
               guess = keyboard.nextInt();//ask user to guess again
               times++;//renew the value of times
            }
         }
         if(times == finalTry1 && guess == number)
         {  
            System.out.println("Congratulations! You guessed it!");
            System.out.printf("You got it right in %d guess.\n", times-1);//display the result
         }
         if(times == finalTry1 && guess != number)//the statement will print out if user is out of guesses
         {
            System.out.printf("You are out of guesses.\nI was thinking of the number %d.", number);//display the result
         }
       }   
   }
}