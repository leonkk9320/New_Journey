public class RecursionDay2
{
   public static void main(String[] args)
   {
      writenums(5);
      strLength("gouge");
   }
   
   //given n, writnums(n) prints numbers 1...n
   public static void writenums(int n)
   {
      if (n==1)
         System.out.print(1);
      else
      {
         writenums(n-1);
         System.out.print(n);
         
      }
   }
   public  static int strLength(String s)
   {
      if (s.equals(""))
         return 0;
      return 1 + strLength(s.substring(1));
   }
}