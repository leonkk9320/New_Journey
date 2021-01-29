import java.io.*;
import java.util.Scanner;

public class ArrayListTester2
{
   public static void main(String[] args) throws IOException
   {
 /*     final int MAX_VALS = 100;
      int [] values = new int[MAX_VALS];
      Scanner file = new Scanner(new File("values.txt"));
      int index = 0;
      while(infile.nextNext() && index < MAX_VALS)
      {
         values[index] = infile.nextInt();
         index++;
      
      }
      System.out.println(index + "value read");
      
      for(int i = 0; i < index; i++)
      {
         SYstem.out.println(i + ":" + value[i]);
      }*/
      
      /**
      The selectionSort method performs a selection sort on an
      int array. The array is sorted in ascending order.
      @param array The array to sort.
   */
   public static void selectionSort(int[] array)
   {
      int startScan, index, minIndex, minValue;

      for (startScan = 0; startScan < (array.length-1); startScan++)
      {
         minIndex = startScan;
         minValue = array[startScan];
         for(index = startScan + 1; index < array.length; index++)
         {
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
   }
      infile.close();
   }

}