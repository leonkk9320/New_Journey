/**
   This program test the program
   CS110 Section A 
   Assignment 5
   @author Leon Zhang
*/
public class CardDriver
{
   public static void main(String[] args)
   {
      Card card = new Card(Card.CLUBS, 7);
      Card card1 = new Card(Card.DIAMONDS, 7);// constructer
      
      System.out.println("The first card's rank is " + card.getRank());//display card rank 
      
      if (card.getSuit() == 0)
      {
         System.out.println("The first card's suit is SAPDES");
      }
      else if (card.getSuit() == 1)
      {
         System.out.println("The first card's suit is CLUBS");
      }
      else if (card.getSuit() == 2)
      {
         System.out.println("The first card's suit is HEARTS");
      }
      else
      {
         System.out.println("The first card's suit is DIAMONDS");
      }//display card suit
      
      System.out.println(card);
      System.out.println(card1);//display the object
      if (card.equals(card1))//compare two cards
      {
         System.out.println("equal");
      }
      else
      {
         System.out.println("not equal");
      }
      
   }

}