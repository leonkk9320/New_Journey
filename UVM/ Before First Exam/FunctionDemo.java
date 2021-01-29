public class FunctionDemo
{
   public static void main(String [] args)
   {
    
      
      displayName("Leon Zhang", 3);
      String friend = "Scooby Doo";
      int num = 2;
      displayName(friend, num);
      
   
   }
   // displays given name n times
   public static void displayName(String name, int n)
   {
      for (int i = 1; i <= n; i++)
         System.out.println("Leon Zhang");
   
   }

}