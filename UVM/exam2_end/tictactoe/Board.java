// tic tac toe board
// 3x3 array of characters
// each contains an 'x', an 'o'
// or a '_' if not taken

public class Board 
{
   private char [][] board;
   
   // initialize board to '_'
   public Board()
   {
      board = new char[3][3];
      for (int r = 0; r < 3; r++)
         for (int c = 0 ; c < 3; c++)
      board[r][c]='_';
   }
   // deep copy constructor
   public Board(Board b)
   {
      board = new char[3][3];
      for (int r = 0; r < 3; r++)
         for (int c = 0 ; c < 3; c++)
      this.board[r][c]=b.board[r][c];
   }
   
   // get character at row r, column c
   public char get(int r, int c)
   {
      return board[r][c];
   }
   // set character at row r, column c
   public void set(int r, int c, char ch)
   {
      board[r][c]=ch;
   }
   // return 'x' or 'o' if there is a win,
   // or '_' otherwise
   public char winner()
   {
      char win = '_';
      int r = 0;
      while (r < 3 && win=='_')
      {
         if (board[r][0]==board[r][1] && board[r][1]==board[r][2] && board[r][0] !='_')
            win = board[r][0];
         r++;
      }
      int c = 0;
      while (c < 3 &&  win=='_')
      {
         if (board[0][c]==board[1][c] && board[1][c]==board[2][c] && board[0][c] !='_')
            win = board[0][c];
         c++;
      }  
      // short circuit
      if ( win=='_' &&  board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[1][1] != '_')
         win = board[0][0];
      if (win=='_' &&  board[0][2]==board[1][1] && board[1][1]==board[2][0] && board[0][2] != '_')
         win = board[0][2];
         
      return win;
   }
   public String toString()
   {
      String s="";;
      for (int r = 0; r < 3; r++)
      {
         for (int c = 0 ; c < 3; c++)
         {
            s+=board[r][c]+" ";
         }
         s+="\n";
      }
      return s;   
          
   
   }
   
   public static void main(String [] args)
   {
      Board b = new Board();
      b.set(0,0,'x');
      b.set(0,1,'x');
      b.set(0,2,'x');
      b.set(1,0,'x');
      b.set(1,1,'x');
      b.set(2,2,'x');
      System.out.println(b);
         
   
   }
}