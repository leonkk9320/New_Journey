import java.util.Random;
public class RandStuff
{
   public static void main(String [] args) 
   {
      Random r = new Random(1);
      for (int i = 1; i <= 5 ; i++)
      System.out.println(r.nextInt(10));
      //System.out.println(r.nextDouble());
   
   }
}