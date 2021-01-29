public class PersonTester
{

   public static void main(String[] args)
   {
      Person p = new Person("Bob", 21);
      Person p2 = new Person("Suzy", 23);
      Person p3 = new Person("Jo", 19);
      System.out.println(p);
      System.out.println(p.getName());
   }
}