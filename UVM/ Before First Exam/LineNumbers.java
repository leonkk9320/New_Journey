import java.io.*;
import java.util.Scanner;
public class LineNumbers
{
   public static void main(String [] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      Scanner infile;
      String filename;
      String line;
      PrintWriter outfile;
      int lineNumber = 1;
      
      System.out.print("Enter a filename: ");
      filename = keyboard.nextLine();
      
      infile = new Scanner(new File(filename));
      outfile = new PrintWriter("ln_"+filename);
      while (infile.hasNext())
      {
         line = infile.nextLine();
         outfile.printf("%3d: %s\n",lineNumber, line);
         lineNumber++;
      
      }
      
      
      infile.close();
      outfile.close();
   }
}