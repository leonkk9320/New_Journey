//Leon Zhang
//CS 110
//This program demonstrates the Random class

import java.util.Random;
import java.util.Scanner;

public class RandomDemo
{
   public static void main(String [] args)
   //constants
   {
      final int SIDES = 6;// number of sides on die
        
      //variables
      int die1, die2;
      String userInput;
      Random rand = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      do
      {
      // roll two dice
      die1 = rand.nextInt(SIDES) + 1;//0 to 6
      die2 = rand.nextInt(SIDES) + 1;
      
      //show user
      System.out.printf("%d, %d\n",die1,die2);
      
      //show again??
      System.out.print("Again (Y or N)?");
      userInput = keyboard.nextLine().toUpperCase();
      char ch;
      ch = userInput.charAt(0);
      } while (ch == 'Y');
      //} while (userInput.equals("Y"));
      
   
   }
}
