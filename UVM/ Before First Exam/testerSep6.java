import java.util.Scanner; 
public class testerSep6{
   public static void main(String[] args)
   {
      int i;
      for (i = 1; i <= topVal ; i++)
      {
         total += i;
      }
      /*int x = 5;
      int y = 2;
      int z;
      z = x++ * y;//x = 5 z = 10 next line x = 6
      z = ++x * y;//x = 6 z = 12 next line x = 6
      x++; //post increasement
      ++x; //pre increasement 
/*      double d = 1268.953;
      String s = String.format("this value is %.1f", d)
      System.out.print(s);
      //System.out.printf("this is %.1f", d);*/
 /*     int topVal;
      do
      {
         System.out.print("Enter a positive number: ");
         topVal = s.nextInt();

      }while(topVal <= 0)
 /*     System.out.print("Enter a positive number: ");
      topVal = s.nextInt();
      while (topVal <= 0)
      {
         System.out.print("Enter a positive number: ");
         topVal = s.nextInt();
      }*/
      
      int total = 0;
      int i;
      i = 1;
      while (i <= topVal)
      {
      System.out.println(i);
      i++;
      }
   }
}
