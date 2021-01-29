import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class ComputerBoard extends Board
{
   /** ComputerBoard(String s)
       @param String
       the constructor takes a string and use the super constructor to 
       display the computer board
   */
   public ComputerBoard(String s) throws IOException
   {
      super(s);
   }
   
   
   /** makePlayerMove(Move m)
       @param Move take a parameter m as a parameter
       @return String returns a string to indicate what happened after a move is applied
   */
   public String makePlayerMove(Move m)
   {
      // create cell status variable = applyMoveToLayout(m)
      CellStatus status = applyMoveToLayout(m);
      //substitute applyMoveToLayout(m) for variable name
      if(status == CellStatus.DESTROYER_SUNK)
         return "You sank My Destroyer!";
      else if(status == CellStatus.SUB_SUNK)
         return "You sank My Sub!";
      else if(status == CellStatus.CRUISER_SUNK)
         return "You sank My Cruiser!";
      else if(status == CellStatus.BATTLESHIP_SUNK)
         return "You sank My Battleship!";
      else if(status == CellStatus.AIRCRAFT_CARRIER_SUNK)
         return "You sank My Aircraft Carrier!";
      else
         return null;
   }
   
   
   /** toString()
       @return String returns a string to display the board
   */
   @Override
   public String toString()
   {
      String str = "";
      for(ArrayList<CellStatus> list : getLayout())
      {
         for(CellStatus s : list)
         {
            str += s.toString().charAt(0) + "\t";
         }
         str += "\n";
      }
      return str;
      
   }
}