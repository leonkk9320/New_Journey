import java.util.Scanner;

public class BarChart
{
   public static void main(String[] args)
   {
   final int SALE = 100; 
   int store1, store2, store3, store4, store5;
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter today's sales for store 1: ");
   store1 = keyboard.nextInt();
   
   System.out.print("Enter today's sales for store 2: ");
   store2 = keyboard.nextInt();
   
   System.out.print("Enter today's sales for store 3: ");
   store3 = keyboard.nextInt();
   
   System.out.print("Enter today's sales for store 4: ");
   store4 = keyboard.nextInt();
   
   System.out.print("Enter today's sales for store 5: ");
   store5 = keyboard.nextInt();
   
   store1 /= SALE;
   store2 /= SALE;
   store3 /= SALE;
   store4 /= SALE;
   store5 /= SALE;
   
   System.out.println("SALES BAR CHART");
   
   System.out.print("Store 1:");
   for(int i = 0; i < store1; i++)
   {
     System.out.print("*"); 
   }
   
   System.out.print("\nStore 2:");
   for(int i = 0; i < store2; i++)
   {
     System.out.print("*"); 
   }
   
   System.out.print("\nStore 3:");
   for(int i = 0; i < store3; i++)
   {
     System.out.print("*"); 
   }
   
   System.out.print("\nStore 4:");
   for(int i = 0; i < store4; i++)
   {
     System.out.print("*"); 
   }
   
   System.out.print("\nStore 5:");
   for(int i = 0; i < store5; i++)
   {
     System.out.print("*"); 
   }
   
   }



} 
