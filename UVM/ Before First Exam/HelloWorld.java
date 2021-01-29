public class HelloWorld
{
   public static void main(String[] args)
     {
      int d = (int)(3*4 + 5 / 2.0);
      
      boolean b, c;
      int x = 4, y = 5;
      b = x < y;
      c = !(y > 2 && y < 5 || x == 4);
      System.out.print(d);
      System.out.println(b);
     }
}
/* && (and) ||(or) !(not) and > or > not
 double > float > long > int > short > char sqrt(double) sqrt(4) will turn to sqrt(4.0)
*/
