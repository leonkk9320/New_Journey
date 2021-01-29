public class LabR
{
   public static void main(String[] args)
   {
      System.out.println(recMult(15,10));// should display 150
      System.out.println(recPower(5,3));// should return 125

      for(int i = 1; i <= 10; i++)
      {
         System.out.printf("%.2f\n", m(i)); 
      }      
   
   
   }
   
   public static int recMult(int i, int j)
   {  
      if (j-1 != 0)
      {
         return i+recMult(i, j-1);
      }
      return i;
   }
   
   public static int recPower(int m, int n)
   {
      if(n-1 != 0)
      { 
         return  m*recPower(m, n-1);
      }
      return m;
      
   
   }
   
   public static double m(double i)
   {
      if (i != 0)
      {
         return (i/(2*i+1) + m(i-1));
         
      }
      return i;
   
   }

}