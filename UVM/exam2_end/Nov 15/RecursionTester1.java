public class RecursionTester1
{
   public static void main(String[] args)
   {
      // System.out.println(factorial(5));
//       System.out.println(isPalindrome("level"));
        // printBackwards("hello");
         // int[] nums = {4, 6, 2, 3};
//          System.out.println(sum(nums,3));
         System.out.println(sumDigits(23545));
   }
   
   public static int sumDigits(int n)
   {
      if (n<10)
       return n;
      return n%10 + sumDigits(n/10);
   }
   
   public static int sum(int[] array, int index)
   {
       if (index == 0)
         return array[index];
       return array[index] + sum(array, index - 1);
   }
   
   public static void printBackwards(String s)
   {
      if (s.length() == 0)
         return;
      
      System.out.print(s.charAt(s.length()-1));
      printBackwards(s.substring(0, s.length()-1));
   
   }
   
   public static boolean isPalindrome(String s)
   {
      if (s.length() <= 1)
         return true;
      // if (s.charAt(0) == s.charAt(s.length()-1))
//          isPalindrome(s.substring(1, s.length()-1));
//       else
//          return false;
      return (s.charAt(0) == s.charAt(s.length()-1))
               && isPalindrome(s.substring(1, s.length()-1));
   
   }
   public static int factorial(int n)
   {
      //base n 
      if (n == 0)
         return 1;
      return n * factorial(n-1);
   }
      
   // public static int factorialIterative(int n)
//    {
//       int fact = 1;
//       for (int i = 1; i <= n; i++)
//          fact *= i;
//       return fact;
//       
//     }
   
}