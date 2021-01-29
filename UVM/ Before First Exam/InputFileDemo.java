import java.io.*;
import java.util.Scanner;
public class InputFileDemo
{
   public static void main(String[] args) throws IOException
   {
      int ct = 1;
      Scanner keyboard = new Scanner(System.in);
      String filename;
      System.out.print("Filename? ");
      filename = keyboard.nextLine();
      
      File file = new File(filename);
      Scanner infile = new Scanner(file);
      
      PrintWriter outfile = new PrintWriter("new_"+filename);
      String input;
      while (infile.hasNext())
      {
         input = infile.nextLine();
         outfile.printf("%3d : %s\n",ct,input);
         ct++;
      }
      
    
      infile.close();
      outfile.close();   
   }
}