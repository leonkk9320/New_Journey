//Leon Zhang
//CS 110
//This program counts the number of non-whitespace characters and the number of
//lines in a file.

import java.io.*;
import java.util.Scanner;

public class FileCount
{  
   public static void main(String [] args) throws IOException
   {
   
      int lineNum = 0, charNum = 0;
      String filename, line;//create variables
         
      Scanner keyboard = new Scanner(System.in);// instantiate object
      System.out.print("Filename?");// prompt
      filename = keyboard.nextLine();// get input
         
      File f = new File(filename);
      Scanner infile = new Scanner(f);
      while(infile.hasNext())//create while loop to check if txt file still has lines
      {
         line = infile.nextLine();
         for(int i = 0; i < line.length(); i++)
         {
            if(Character.isWhitespace(line.charAt(i)) == false)//determine white space or character 
            {
               charNum++;//renew charactrer number
            }    
         }
         lineNum++;//renew line number
      }

   
   infile.close();//close the file
   System.out.printf("There are %d characters and %d lines in the file \"%s\".",charNum,lineNum,filename); //display the result 

   }     
}



