import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class ExceptionTester
{
   public static void main(String[] args)
   {
      try
      {
         Scanner s = new Scanner(new File("mf.txt"));
      }
      catch(IOException e)
      {
         e.printStackTrace();
         System.out.println("file not found");
      }
     //  catch(Exception e)
//       {
//          
//       }
//       finally
//       {
//          
//       }
      try
      {
         int[] nums = {4,6,2,3};
         System.out.println(num[11]);
         
      
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         //System.out.println
      
      }
   }
}