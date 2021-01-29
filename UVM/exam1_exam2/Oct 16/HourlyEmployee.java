import java.util.Date;
public class HourlyEmployee extends Employee
{
   private double wageRate;
   private double hours;
   public HourlyEmployee(String first, String last, Date d, double rate, double hrs)
   {
      super(first,last,d);
      wageRate = rate;
      hours =  hrs;
   }
   public double getRate()
   {
      return wageRate;
   }
   public double getHours()
   {
      return hours;
   }
   public void setRate(double r)
   {
      wageRate = r;
   }
   public void setHours(double h)
   {
      hours = h;
   }
   @Override
   public String toString()
   {
      return super.toString()+" "+hours+" @ $" + wageRate;
   }
   @Override
   public boolean equals(Object other)
   {
      HourlyEmployee hOther = (HourlyEmployee)other;
      return super.equals(hOther) && wageRate == hOther.wageRate
                                  && hours == hOther.hours;
   } 
}