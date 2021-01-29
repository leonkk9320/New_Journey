/**
   This program asks user for letters to guess a word from a dictionary
   CS110 Section A 
   Assignment 5
   @author Leon Zhang
*/
import java.util.Scanner;//import packages
import java.util.Random;
import java.io.*;
import java.util.ArrayList;

public class Hangman
{
   public static void main(String[] args) throws IOException
   {
      String word,
             letter,
             guess = "";
      int    index = 0,
             randNum,
             inGuess = 0;// set variables
      
      File f = new File("dict.txt");
      Scanner infile = new Scanner(f);// input file
      
      ArrayList<String> arraylist = new ArrayList<String>();// create a arraylist
      while (infile.hasNext())// copy the contents from the dictionary to the arraylist
      {
         String line = infile.next();
         arraylist.add(index, line);
         index++;
      }
      
      Random rand = new Random();
      randNum = rand.nextInt(arraylist.size());
      word = arraylist.get(randNum);//generate a random word
      
      for (int i = 1; i <= word.length(); i++)
      {
         guess += "*";
      }
      System.out.println(guess + ", Incorrect guesses: " + inGuess);// initialize the guess
      
      
      Scanner keyboard = new Scanner(System.in);// initialize an object
      while(inGuess < 10 && !(guess.equals(word)))
      {
         System.out.print("Guess a letter: ");// ask for input
         letter = keyboard.next();
         if (compare(word, letter))// call compare method
         {
            guess = rewrite(word, letter, guess);
            System.out.println(guess + ", Incorrect guesses: " + inGuess);//display result
         }
         else
         {
            inGuess++;//renew incorrect guess times
            guess = rewrite(word, letter, guess);
            System.out.println(guess + ", Incorrect guesses: " + inGuess);//display result
         }
      }
      
      displayResult(inGuess, word);// call displayResult method
      
      infile.close();// close the file
   }
   
   
   
    
   
   //this method compare the letters in the word and the letter user input   
   public static boolean compare(String word1, String letter1)
   {
      int x = 0;
      String s1;// set variables
      for (int i = 0; i < word1.length(); i++)
      {
         s1 = String.valueOf(word1.charAt(i));// change char to string
         if (letter1.toUpperCase().equals(s1.toUpperCase()))
            x = 1;
      }
      if (x == 1)
      {
         return true;
      }
      else
      {
         return false;//return boolean value
      }          
   }
   
   
   //this method rewrite the guessing result
   public static String rewrite(String word2, String letter2, String guess2)
   {
      String newGuess = "";
      String s2,
             s3;// set variables
      for (int i = 0; i < word2.length(); i++)
      {
         s2 = String.valueOf(word2.charAt(i));
         s3 = String.valueOf(guess2.charAt(i));//change char to string
         //the decidion loop below decide when to add letter and *
         if (s2.toUpperCase().equals(s3.toUpperCase()))
         {
           newGuess += s2;
         }
         if (letter2.toUpperCase().equals(s2.toUpperCase()))
         {
           newGuess += s2;
         }
         if (!(s2.toUpperCase().equals(s3.toUpperCase())) && !(letter2.toUpperCase().equals(s2.toUpperCase())))
         {
            newGuess += "*";
         }
      }
      return newGuess;//return a string
   }
  
  //this method display the final result
  public static void displayResult(int inGuess3, String word3)
  {
      if (inGuess3 == 10)
         System.out.println("Out of tries! Word was " + word3);
      else
      {
         System.out.println("Congratulations, you guessed it!");
      }
  }
}