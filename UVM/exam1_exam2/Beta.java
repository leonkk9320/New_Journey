public class Beta extends Alpha 
{ 
   public Beta() 
   {
      System.out.println("Beta : base constructor");
   }
   public Beta(int n) 
   { 
      super(n);
      System.out.println("Beta : alternate constructor");
   }
   public void function2() 
   { 
      System.out.println("Beta : function2");
   }
   public void function3(int n) 
   { 
      System.out.println("Beta : function3");
   }
   public void function4()
   { 
      System.out.println("Beta : function4");
   }
   public String toString()
   { 
   return "Class Beta";
   }
}
