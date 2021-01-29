public class Fraction
{
   // instance variables
   private int num;
   private int den;
   // constructors
   // default constructor
   public Fraction()
   {
      this(0,1);
   }
   // alternate constructors
   public Fraction(int n)
   {
      this(n,1);
   }
   public Fraction(int n, int d)
   {
      //num = n;
      setNumerator(n);
      setDenominator(d);
   }
   // getters & setters
   /**
      getNumerator returns the Fraction's
      numerator
      @return the Fraction's numerator   
   */
   public int getNumerator()
   {
      return num;
   }
   /**
      getDenominator returns the Fraction's
      denominator
      @return the Fraction's denominator   
   */

   public int getDenominator()
   {
      return den;
   }
   /** 
      setNumerator set's the Fraction's numerator
      to the specified value
      @param n the value to set the numerator to
      
   */
   public void setNumerator(int n)
   {
      num = n;
   }
   /** 
      setDenominator set's the Fraction's demoninator
      to the specified value
      @param d the value to set the demoninator to
      
   */

   public void setDenominator(int d)
   {
      if (d != 0)
         den = d;
      else
         den = 1;
   }
   /**
      getDecimal returns decimal equivalent of Fraction
      @return num/den
   */
   public double getDecimal()
   {
      return (double)num/den;
   }

}