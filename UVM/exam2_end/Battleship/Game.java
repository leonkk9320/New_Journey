/**
   phase 2 adds Game class and display the two boards more clearly.
   CS110 Section A 
   Battleship phase 2
   @author Leon Zhang
*/

import java.io.*;

public class Game
{
   private ComputerBoard computer;
   private UserBoard player;//set variables
   
   /** Game()
       the constructor initialize player object and computer object.
   */
   public Game() throws IOException
   {
      player = new UserBoard("userFleet.txt");
      computer = new ComputerBoard("compFleet.txt");
   }
   
   /** makeComputerMove()
       @return String[] returns the value of an array whose index is one to determine 
        where does the computer move.
   */   
   public String[] makeComputerMove()
   {
      return player.makeComputerMove();
   }
   
   
   /** makePlayerMove(String s)
       @return String returns the value of a string to determine where does the player
       move.
   */
   public String makePlayerMove(String s)
   {
      Move m = new Move(s);
      return computer.makePlayerMove(m);
   }
   
   
   /** computerDefeated()
       @return Boolean returns a boolean value to determine whether the computer is defeated.
   */
   public boolean computerDefeated()
   {
      return computer.gameOver();
   }
   
   
   /** userDefeated()
       @return Boolean returns a boolean value to determine whether the user is defeated.
   */
   public boolean userDefeated()
   {
      return player.gameOver();
   }
   
   /** toString()
       @return String returns a string to display the computer board and the user board.
   */
   @Override
   public String toString()
   {
      String ss1 = "";
      int i1 = 65;
      String[] boards1 = computer.toString().split("\n");
      for (String board1 : boards1) 
      {
         ss1 += (char)i1 + "\t" + board1 + "\n";
         i1++;
         
      }
      
      String ss2 = "";
      int i2 = 65;
      String[] boards2 = player.toString().split("\n");
      for (String board2 : boards2) 
      {
         ss2 += (char)i2 + "\t" + board2 + "\n";
         i2++;
      }
      
      String s1, s2;
      s1 = "COMPUTER\n" + " \t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n";
      s2 = "USER\n" + " \t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n";
      return (s1 + ss1 + "\n" + s2 + ss2);
   }
   
   /** getComputerStatus(int row, int col)
       @return Cellstatus returns the computer's cellstatus.
   */
   public CellStatus getComputerStatus(int row, int col)
   {
      return computer.getStatus(row,col);

   }
   
   /** getUserStatus(int row, int col)
       @return Cellstatus returns the user's cellstatus.
   */
   public CellStatus getUserStatus(int row, int col)
   {
      return player.getStatus(row,col);

   }
}