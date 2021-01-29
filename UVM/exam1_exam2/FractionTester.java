public class FractionTester
{
   public static void main(String[]args)
   {
      Fraction f1 = new Fraction();
      Fraction f2 = new Fraction(1,0);
      Fraction f3 = new Fraction(5);
      f1.setNumerator(5);
      f1.setNumerator(7);

      doubleIt(f3);
      
   }
   public static void doubleIt(Fraction f)
   {
      int n = f.getNumerator();
      f.setNumerator(n*2);//pass address, adress didn't change so don't need to return
   
   }
}