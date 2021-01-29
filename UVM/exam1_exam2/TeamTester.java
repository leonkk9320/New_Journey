public class TeamTester
{
   public static void main(String[] args)
   {
      Team t = new Team("a","b",2,1);
      Team t2 = new Team("c","d",1,2);
      if(t.equals(t2))
      {
         System.out.println("same");
      }
      else
      {
         System.out.println("not same");
      }
   }

}