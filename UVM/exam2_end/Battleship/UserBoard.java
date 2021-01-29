import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class UserBoard extends Board
{
   private ArrayList<Move> moves;
   private Random rand;//set variables
   
   /** UserBoard(String s)
       @param String
       the constructor takes a string and use the super constructor to 
       display the user board
   */
   public UserBoard(String s) throws IOException
   {
      super(s);
      moves = new ArrayList<Move>();
      for (int i = 0; i < SIZE; i++)
         for(int t = 0; t < SIZE; t++)
         {
            Move m = new Move(i, t);
            moves.add(m);
         }
      rand = new Random();
      
   }
   
   /** makeComputerMove()
       @return String[] returns a string[] to indicate what happened after a move is applied
   */
   public String[] makeComputerMove()
   {
      int index = rand.nextInt(moves.size());
      Move move2 = moves.get(index);
      while(!moveTaken(move2))
      {
         index = rand.nextInt(moves.size());
         move2 = moves.get(index);
      }
      moves.remove(index);
      String[] str = new String[2];
      str[0] = "The computer's choice is "+ move2;
      // cellstatus variable = applymovetolayout
      CellStatus status = applyMoveToLayout(move2);
      //in each if, change applymovetolayout to var
      if(status == CellStatus.DESTROYER_SUNK)
         str[1] = "I sank your Destroyer!";
      else if(status == CellStatus.SUB_SUNK)
         str[1] = "I sank your Sub!";
      else if(status == CellStatus.CRUISER_SUNK)
         str[1] = "I sank your Cruiser!";
      else if(status == CellStatus.BATTLESHIP_SUNK)
         str[1] = "I sank your Battleship!";
      else if(status == CellStatus.AIRCRAFT_CARRIER_SUNK)
         str[1] = "I sank your Aircraft Carrier!";
      else
         str[1] = null; 
      return str;
   
   }
   
   /** toString()
       @return String returns a string to display the board
   */
   @Override
   public String toString()
   {
      String str = "";
      for(ArrayList<CellStatus> list : this.getLayout())
      {
         for(CellStatus s : list)
         {
            str += s.toString().charAt(1) + "\t";
         }
         str += "\n";
      }
      return str;
   }

}