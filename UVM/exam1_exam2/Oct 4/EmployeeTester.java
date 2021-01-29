public class EmployeeTester
{
   public class void main(String[] args)
   {
      Department d = new Department(23, "Manufacturing");
      Employee e = new Empolyee("Jackie", 345, d);
      Employee e2 = new Empolyee("Patrick", 347, d);
      Employee e3 = new Empolyee("Jackie", 345, d);
      
      System.out.println(d);
      System.out.println(e);
      System.out.println(e2);
      System.out.println(e3);
      
      d.setId(45);
      
      System.out.println(d);
      
   }

}