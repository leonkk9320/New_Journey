public class CardTester
{
   public static void main(String[] args)
   {
      public final static int CARDS_IN_DECK = 52;
      Card[] deck  = new Card[CARDS_IN_DECK];
      int ct = 0;
      for(int s = Card.SPADES; s  <= Card.CLUBS; s++)
      {
         for(int r = Card.Spades; s <= Card.CLUBS; r++)
         {
            deck[ct] = new Card(r,s);
            ct++;
         }
      }
      for(int i = 0; i < deck.length; i++)
      {
         System.out.println(deck[i]);
      }
   
   }

}