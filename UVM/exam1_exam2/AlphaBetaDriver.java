public class AlphaBetaDriver 
{
   public static void main(String [] args) 
   {
      Alpha obj1 = new Alpha();
      Alpha obj2 = new Beta(5);
      System.out.println(obj1);
      System.out.println(obj2);
      
      obj1.function1();
      //obj1.function2();
      obj1.function2(2);
      obj1.function3(3);
      //obj1.function4();
            
      obj2.function1();
      //obj2.function2();
      obj2.function2(2);
      obj2.function3(3);
      //obj2.function4();
      
   }
}
