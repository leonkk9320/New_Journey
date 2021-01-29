import java.util.Date;
public class EmpTester
{
   public static void main(String[] args)
   {
   
      Date d = new Date();
      Employee e = new Employee("Jackie", "Horton", d);
      //Employee e2 = new Employee("Jackie", "Horton", d);
      HourlyEmployee he = new HourlyEmployee("Sam", "Smith", d, 34.5, 32.5);
      Employee e2 = he;
      System.out.println(e2);
      
      Employee[] employees = new Employee[4];
      Employee[0] = new Employee("Jackie", "Horton", d);
      Employee[1] = new HourlyEmployee("Jackie", "Horton", d, 34.5, 34.25);
      Employee[2] = new SalariedEmployee("Jackie", "Horton", d, 56000);
      Employee[3] = new HourlyEmployee("Jackie", "Horton", d, 40, 40.5);
      
      for(Employee e: employees)
         if (e instanceof SalariedEmployee)
            System.out.println(((SalariedEmployee)e).getSalary());

      
      System.out.println(e == e2);//same object? false
      System.out.println(e.equals(e2));//compare each element true
      
      SalariedEmployee se = new SalariedEmployee("Jackie", "Horton", d);
      System.out.println(se);
      
 /*     
      
      System.out.println(he.getName());
      System.out.println(he.getHours());
      
      System.out.println(he);
      
      
     // Employee e2 = he;*/
   }

}