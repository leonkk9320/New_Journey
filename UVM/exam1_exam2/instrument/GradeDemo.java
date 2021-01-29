public class GradeDemo
{
   public static void main(String[] args)
   {
      GradeActivity ga = new GradeActivity();
      ga.getScore(70);
      
      FinalExam fe = new FinalExam3(120, 15);
      FinalExam fe2 = new FinalExam3(200, 15);
      FinalExam fe3 = new FinalExam3(75, 10);
      
      if (fe.isGreater(fe2))
         System.out.println(is.getScore() + ">" + fe2.getScore());
      else
         System.out.println(is.getScore() + "<=" + fe2.getScore());
      
      ArrayList<Relatable> r = new ArrayList
      Relatable [] rObjects = new Relatable[4];
      
      rObjects[0] = fe;
      rObjects[1] = fe2;
      rObjects[2] = fe3;
      rObjects[3] = new FinalExam3(80,24);
   
   }

}