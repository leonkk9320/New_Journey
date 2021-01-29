// the guts of the game 
// user interface independent

public class TicTacToe
{
   private Board board;
   private char player; // x or o
   private int moves; // to determine tie
   
   public TicTacToe()
   {
      board = new Board();
      player = 'x'; // x goes first
      moves = 0;
      
   }
   // return true if successful
   public boolean move(int r, int c)
   {
      if ((r >=0 && r <3)&&(c >=0 && c <3)&&(board.get(r,c)== '_'))
      {
         board.set(r,c,player);
         if (player=='x')
            player = 'o';
         else
            player = 'x';
         moves++;
         return true;
      }

      return false;
   }
   // how many moves taken?
   public int getMoves()
   {
      return moves;
   }
   public char getPlayer()
   {
      return player;
   }
   public void setPlayer(char ch)
   {
      player = ch;
   }
   public char getSquare(int r, int c)
   {
      return board.get(r,c);
   }
   public char winner()
   {
      return board.winner();
   }
   
   public boolean isSquareUsed(int r, int c)
   {
      return board.get(r,c) != '_';
   }
   // if there's a winner or all squares are used
   public boolean gameOver()
   {
      if (getMoves()==9 || winner() != '_')
         return true;
      return false;
   }
      
   public String toString()
   {
      return board.toString();
   
   }   
      
      


}