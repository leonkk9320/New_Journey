/**
   display card suit and rank, compare two cards
*/

public class Card
{
   final static int SPADES = 0,
                    CLUBS = 1,
                    HEARTS = 2,
                    DIAMONDS = 3,
                    ACE = 1,
                    JACK = 11,
                    QUEEN = 12,
                    KING = 13;
   private int rank,
               suit;//set variables
   
   /**
      The constructor receives suit and rank and pass them to the 
      local private variables 
      @param  int suit     
      @param  int rank
   */
   public Card(int suit, int rank)
   {
      this.suit = suit;
      this.rank = rank;
   }
   

   public int getSuit()
   {
      return suit;
   }
   
   public int getRank()
   {
      return rank;
   }
   
   public String toString()
   {
      String rankValue = "",
             suitValue = "",
             value;
      for (int i = 2; i <= 10; i++)
      {
         if (rank == i)
            rankValue += i;
      }
      if (rank == 1)
      {
         rankValue += "ACE";
      }
      if (rank == 11)
      {
         rankValue += "JACK";
      }
      if (rank == 12)
      {
         rankValue += "QUEEN";
      }
      if (rank == 13)
      {
         rankValue += "KING";
      }
      
      if (suit == 0)
      {
         suitValue += "SPADES";
      }
      if (suit == 1)
      {
         suitValue += "CLUBS";
      }
      if (suit == 2)
      {
         suitValue += "HEARTS";
      }
      if (suit == 3)
      {
         suitValue += "DIAMONDS";
      }
      value = rankValue + "," + suitValue;
      
      return value;
   }
   
   public boolean equals(Object other)
   {
      Card otherCard = (Card)other;
      if (otherCard.rank == this.rank)
         {
            return true;
         }
      return false;
   
   }
}