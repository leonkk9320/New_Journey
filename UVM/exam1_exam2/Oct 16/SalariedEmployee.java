import java.util.Date;

public class SalariedEmployee extends Employee
{
   private double salary;
   public SalariedEmployee(String f, String l, String d, double s)
   {
      super(f,i,d);
      salary = s;
      
      
   }
   
   public double getSalary()
   {
      return salary
   }
   public void setSalary(double s)
   {
      salary = s;
   }
   
   @Override
   public String toString()
   {
      return super.toString() + " $" + salary;
   }
   
   @Override
   public boolean equals(Object other)
   {
      if (otherEmployee == null)
          return false;
      if (this == other)
          return true;
      if (this.getClass() != other.getClass())
          return false;
          
      SalariedEmployee sOther = (SlariedEmployee)other;
      
      return super.equals(sOther) && salary == sOther.salary;
   
   }
}