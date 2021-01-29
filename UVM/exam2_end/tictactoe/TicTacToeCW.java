import java.util.Scanner;

public class TicTacToeCW
{
   private TicTacToe game;
   public TicTacToeCW()
   {
      game = new TicTacToe();
   
   }
   public char go()
   {
      Scanner input = new Scanner(System.in);
      String choices;
      System.out.print(game);
      while (!(game.gameOver()))
      {
         System.out.println("Enter your move [r c]: ");
         choices = input.nextLine();
         if (choices.length()==3) 
         {
            int r = Integer.parseInt(choices.substring(0,1));
            int c = Integer.parseInt(choices.substring(2,3));
            if (game.move(r,c))
            {
              System.out.println(game);
         
            }   
            else
               System.out.println("Invalid move");
         }
         else 
            System.out.println("Invalid move");
      }
   
      return game.winner();
   }
   public static void main(String [] args)
   {
      TicTacToeCW tttgame = new TicTacToeCW();
      char winner = tttgame.go();
      if (winner != '_')
         System.out.println(winner + " wins");
      else
         System.out.println("Its a tie");
      
   
   }

}