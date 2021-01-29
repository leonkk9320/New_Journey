//Leon Zhang
//CS 110
//This program can ask user a distance in meters 
//and convert to kilometers, inches, or feet, 
//depending on the user'e selections


import java.util.Scanner;
public class ConversionProgram
{
   public static void main(String[] args)
   {  
      String choice;
      final String CHOICE1 = "1",
                   CHOICE2 = "2",
                   CHOICE3 = "3",
                   CHOICE4 = "4";     
      int meters;//create variables and constants
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a distance in meters: ");
      meters = keyboard.nextInt();//ask user for input(meters)
      while(meters < 0)
      {
         System.out.println("Invalid input. Distance should be non-negative.");
         System.out.print("Enter a distance in meters: ");
         meters = keyboard.nextInt();
      }//use the while loop to ensure user's input is non-negative
      
      do
      {
         menu();//show menu
         System.out.print("Enter your choice: ");
         choice = keyboard.next();//ask user for input(choice)
         while(!choice.equals(CHOICE1) && !choice.equals(CHOICE2) && !choice.equals(CHOICE3) && !choice.equals(CHOICE4))
         {
            System.out.println("Invalid input. Your choice should be 1, 2, 3 or 4.");
            System.out.print("Enter your choice: ");
            choice = keyboard.next();
         }//use the while loop to ensure user's input is valid
         switch(choice)//use switch to transfer to different method according to user's selection
         {
            case CHOICE1: 
               showKilometers(meters);
               break;
            case CHOICE2: 
               showInches(meters);
               break;
            case CHOICE3: 
               showFeet(meters);
               break;
            case CHOICE4:                
               break;         
         }
      }while(!choice.equals(CHOICE4));
      
      if(choice.equals(CHOICE4))
      {
         System.out.println("Bye!");
      }//display the result if the user hits 4  
   }
   
   /**
      The menu method displays the menu of selections
   */
   public static void menu()//menu method
   {
      System.out.println("1. Convert to kilometers");
      System.out.println("2. Convert to inches");
      System.out.println("3. Convert to feet");
      System.out.println("4. Quit the program");   
   }
   
   /**
      The showKilometers method accepts the number of meters as a parameter, and converts it 
      to kilometers.
      @param x Distance in meters
   */
   public static void showKilometers(int x)//showKilometer method
   {
      double kilo;
      final double MTOK = 0.001;//create variable and constant
      kilo = x * MTOK;//calculate the result 
      System.out.printf("%d meters is %.1f kilometers.\n", x, kilo); //display the result 
   }
   
   /**
      The showInches method accepts the number of meters as a parameter, and converts it 
      to Inches.
      @param y Distance in meters
   */
   public static void showInches(int y)//showInches method
   {
      double inches;
      final double MTOI = 39.37;//create variable and constant
      inches = y * MTOI;//calculate the result
      System.out.printf("%d meters is %.1f inches.\n", y, inches);//display the result 
   }

   /**
      The showFeet method accepts the number of meters as a parameter, and converts it 
      to Feet.
      @param z Distance in meters
   */
   public static void showFeet(int z)//showFeet method
   {
      double feet;
      final double MTOF = 3.281;//create variable and constant
      feet = z * MTOF;//calculate the result
      System.out.printf("%d meters is %.1f feet.\n", z, feet);//display the result
   }
}