import java.util.Scanner;
import java.io.*;
public class UpperCase
{
   public static void main(String[] args) throws IOException
   {
      String infileName, outfileName, line;
      //int x;
      Scanner keyboard = new Scanner(System.in);
      //ask for name for both input and output file
      System.out.print("What's the name of the reading file: ");
      infileName = keyboard.next();
      System.out.print("What's the name of the writing file: ");
      outfileName = keyboard.next();
      
      //open file
      File f = new File(infileName);
      Scanner infile = new Scanner(f);
      
      PrintWriter outfile = new PrintWriter(outfileName);
      
      //read contents and write to outfile
      while(infile.hasNext())
      {
         line = infile.next();
         //x = infile.nextInt();
         outfile.println(line.toUpperCase());
         //outfile.println(x+1);

      }
      
      //close files
      infile.close();
      outfile.close();
   }
 

}