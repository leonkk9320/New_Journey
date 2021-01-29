import java.io.*;
import java.util.Scanner;
public class FileLines
{
   public static void main(String [] args) throws IOException
   {
      Scanner Keyboard = new Scanner(System.in);
      Scanner infile;
      String filename;
      int lineNumber = 1;
      String line;
      PrintWriter outfile;
      
      //get filename;
      System.out.print("Enter filename: ");
      filename = Keyboard.nextLine();
      
      //open file
      infile = new Scanner(new File(filename));
      // open outfile
      outfile = new PrintWriter("ln_"+filename);
      
      while (infile.hasNext())
      {
         line = infile.nextLine();
         System.out.printf("%3d: %s\n",lineNumber+line);
         lineNumber++;
         
         //close file
         outfile.close();
      }
   }
}