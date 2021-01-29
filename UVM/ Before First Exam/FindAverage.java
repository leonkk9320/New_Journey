import java.io.*;
import java.util.Scanner;
public class FindAverage
{
   public static void main(String [] args) throws IOException
   {
      //variables
      double average;
      int total = 0;
      int ct = 0;
      Scanner infile = new Scanner(new File("studentsGrades.txt"));
      while (infile.hasNext())
      {
         value = infile.nextInt();
         total += value;
         ct++;
      
      }
      average = (double)total/ct;
      System.out.printf("The average of %d numbers is %.");
     
   }
}