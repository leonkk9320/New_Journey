import java.util.Scanner;
public class test2
{
   public static void main(String []args)
   {
      int value;
      
      Scanner keyboard = new Scanner(System.in);
      value = keyboard.nextInt();
      
      switch(value)
      {
         case 2: System.out.println("2");
                 System.out.println("new line")
                 break;
         case 3: System.out.println("3");
                 break;
         default: System.out.println("The default choice")

                 
      }