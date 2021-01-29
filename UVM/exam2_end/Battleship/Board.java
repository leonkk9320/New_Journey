import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class Board
{
   private ArrayList<ArrayList<CellStatus>> layout;
   private Fleet fleet;
   public static final int SIZE = 10;//set variables
   
   /** Board()
       the constructor initiallizes two boards, 
       and receives the cell status from txt files, then display it on the console.
   */
   public Board(String str) throws IOException
   {
     layout = new ArrayList<>(SIZE);
     for(int i = 0; i < SIZE; i++)
     {
         layout.add(new ArrayList<CellStatus>());
         for(int t = 0; t < SIZE; t++)
         {
            layout.get(i).add(CellStatus.NOTHING);
         }
     }// initialize the boards with nothing on them
     fleet = new Fleet();
     File f = new File(str);
     Scanner infile = new Scanner(f);// receives files containing cell status
     String line;
     
     while(infile.hasNext())
     {
         line = infile.nextLine();
         
         if(line.charAt(0) == 'C')// identify the ship type
         {
            if(line.charAt(2) == line.charAt(5))// the ship is put vertically
            {
               int a,
                   b,
                   c;
               a = Integer.parseInt(String.valueOf(line.charAt(3)))-1;//chage character to string, then to int. get the vertical starting point
               b = Integer.parseInt(line.substring(6))-1;// get the vertical end point
               c = (new Move(String.valueOf(line.charAt(2)))).row();// get the row
               for(int i = a; i <= b; i++)
               {
                  layout.get(c).set(i, CellStatus.CRUISER);// fill the cells with cruiser.
               }
            }else// the ship is put horizontally
            {
               int d;
               d = Integer.parseInt(line.substring(6))-1;// get the column
               for(int t = line.charAt(2)-65; t <= line.charAt(5)-65; t++)// get the range for row
               {
                  layout.get(t).set(d, CellStatus.CRUISER);// fill the cells with cruiser.
               }
            }
         }
         else if(line.charAt(0) == 'A')// case for aircraft carrier
         {
            if(line.charAt(2) == line.charAt(5))
            {
               int a,
                   b,
                   c;
               a = Integer.parseInt(String.valueOf(line.charAt(3)))-1;
               b = Integer.parseInt(line.substring(6))-1;
               c = (new Move(String.valueOf(line.charAt(2)))).row();
               for(int i = a; i <= b; i++)
               {
                  layout.get(c).set(i, CellStatus.AIRCRAFT_CARRIER);
               }
            }else
            {
               int d;
               d = Integer.parseInt(line.substring(6))-1;
               for(int t = line.charAt(2)-65; t <= line.charAt(5)-65; t++)
               {
                  layout.get(t).set(d, CellStatus.AIRCRAFT_CARRIER);
               }
            }
         }
         else if(line.charAt(0) == 'B')// case for battleship
         {
            if(line.charAt(2) == line.charAt(5))
            {
               int a,
                   b,
                   c;
               a = Integer.parseInt(String.valueOf(line.charAt(3)))-1;
               b = Integer.parseInt(line.substring(6))-1;
               c = (new Move(String.valueOf(line.charAt(2)))).row();
               for(int i = a; i <= b; i++)
               {
                  layout.get(c).set(i, CellStatus.BATTLESHIP);
               }
            }else
            {
               int d;
               d = Integer.parseInt(line.substring(6))-1;
               for(int t = line.charAt(2)-65; t <= line.charAt(5)-65; t++)
               {
                  layout.get(t).set(d, CellStatus.BATTLESHIP);
               }
            }
         }
         else if(line.charAt(0) == 'S')// case for submarine
         {
            if(line.charAt(2) == line.charAt(5))
            {
               int a,
                   b,
                   c;
               a = Integer.parseInt(String.valueOf(line.charAt(3)))-1;
               b = Integer.parseInt(line.substring(6))-1;
               c = (new Move(String.valueOf(line.charAt(2)))).row();
               for(int i = a; i <= b; i++)
               {
                  layout.get(c).set(i, CellStatus.SUB);
               }
            }else
            {
               int d;
               d = Integer.parseInt(line.substring(6))-1;
               for(int t = line.charAt(2)-65; t <= line.charAt(5)-65; t++)
               {
                  layout.get(t).set(d, CellStatus.SUB);
               }
            }
         }
         else if(line.charAt(0) == 'D')// case for destroyer
         {
            if(line.charAt(2) == line.charAt(5))
            {
               int a,
                   b,
                   c;
               a = Integer.parseInt(String.valueOf(line.charAt(3)))-1;
               b = Integer.parseInt(line.substring(6))-1;
               c = (new Move(String.valueOf(line.charAt(2)))).row();
               for(int i = a; i <= b; i++)
               {
                  layout.get(c).set(i, CellStatus.DESTROYER);
               }
            }else
            {
               int d;
               d = Integer.parseInt(line.substring(6))-1;
               for(int t = line.charAt(2)-65; t <= line.charAt(5)-65; t++)
               {
                  layout.get(t).set(d, CellStatus.DESTROYER);
               }
            }
         }
         
     
     
     }
     infile.close();// close the file
   }
     
     /** applyMoveToLayout(Move m)
       @return CellStatus returns the cell status of certain ships after a move is applied
     */
     public CellStatus applyMoveToLayout(Move m)
     {
         if(layout.get(m.row()).get(m.col()) == CellStatus.NOTHING)// there's mothing on the cell
         {
            layout.get(m.row()).set(m.col(), CellStatus.NOTHING_HIT);// set the cell to show nothing is hit 
            return CellStatus.NOTHING_HIT;// return the status
         }
         else
         {
            if(layout.get(m.row()).get(m.col()) == CellStatus.DESTROYER)// destroyer is on the cell
            {
               layout.get(m.row()).set(m.col(),CellStatus.DESTROYER_HIT);// set the cell to show the destroyer is hit
   
               if(fleet.updateFleet(ShipType.ST_DESTROYER))
               {
                  for (int i = 0; i < SIZE; i++)
                  {
                     for(int j = 0; j < SIZE; j++)
                     {
                        if(layout.get(i).get(j) == CellStatus.DESTROYER_HIT)
                           layout.get(i).set(j, CellStatus.DESTROYER_SUNK);// determine whether it is hit or sunk
                     }
                  }
                  return CellStatus.DESTROYER_SUNK;// return the status
               }
               return CellStatus.DESTROYER_HIT;// return the status
            }
            else if(layout.get(m.row()).get(m.col()) == CellStatus.SUB)// case for submarine
            {
               layout.get(m.row()).set(m.col(), CellStatus.SUB_HIT);
               if(fleet.updateFleet(ShipType.ST_SUB))
               {
                  for (int i = 0; i < SIZE; i++)
                  {
                     for(int j = 0; j < SIZE; j++)
                     {
                        if(layout.get(i).get(j) == CellStatus.SUB_HIT)
                           layout.get(i).set(j, CellStatus.SUB_SUNK);
                     }
                  }
                  return CellStatus.SUB_SUNK;
               }

               return CellStatus.SUB_HIT;
            }
            else if(layout.get(m.row()).get(m.col()) == CellStatus.BATTLESHIP)// case for battleship
            {
               layout.get(m.row()).set(m.col(), CellStatus.BATTLESHIP_HIT);
               if(fleet.updateFleet(ShipType.ST_BATTLESHIP))
               {
                  for (int i = 0; i < SIZE; i++)
                  {
                     for(int j = 0; j < SIZE; j++)
                     {
                        if(layout.get(i).get(j) == CellStatus.BATTLESHIP_HIT)
                           layout.get(i).set(j, CellStatus.BATTLESHIP_SUNK);
                     }
                  }
                  return CellStatus.BATTLESHIP_SUNK;
               }

               return CellStatus.BATTLESHIP_HIT;
            }
            else if(layout.get(m.row()).get(m.col()) == CellStatus.AIRCRAFT_CARRIER)// case for aircraft carrier
            {
               layout.get(m.row()).set(m.col(), CellStatus.AIRCRAFT_CARRIER_HIT);
               if(fleet.updateFleet(ShipType.ST_AIRCRAFT_CARRIER))
               {
                  for (int i = 0; i < SIZE; i++)
                  {
                     for(int j = 0; j < SIZE; j++)
                     {
                        if(layout.get(i).get(j) == CellStatus.AIRCRAFT_CARRIER_HIT)
                           layout.get(i).set(j, CellStatus.AIRCRAFT_CARRIER_SUNK);
                     }
                  }
                  return CellStatus.AIRCRAFT_CARRIER_SUNK;
               }
               return CellStatus.AIRCRAFT_CARRIER_HIT;
            }else
            {
               layout.get(m.row()).set(m.col(), CellStatus.CRUISER_HIT);// case for cruiser
               if(fleet.updateFleet(ShipType.ST_CRUISER))
               {
                  for (int i = 0; i < SIZE; i++)
                  {
                     for(int j = 0; j < SIZE; j++)
                     {
                        if(layout.get(i).get(j) == CellStatus.CRUISER_HIT)
                           layout.get(i).set(j, CellStatus.CRUISER_SUNK);
                     }
                  }
                  return CellStatus.CRUISER_SUNK;
               }
               return CellStatus.CRUISER_HIT;
            }
         }
         
     
     }
     
     /** moveTaken(Move m)
       @param Move get m which is from Move class
       @return boolean returns a boolean to determine if it is allowed to take a move for a certain cell
     */
     public boolean moveTaken(Move m)
     {
         if(layout.get(m.row()).get(m.col()) == CellStatus.AIRCRAFT_CARRIER_HIT)// there's a aircraft carrier being hit on this cell
            return false;// can't take a move on this cell
         else if(layout.get(m.row()).get(m.col()) == CellStatus.AIRCRAFT_CARRIER_SUNK)// there's a aircraft carrier being sunk on this cell
            return false;// can't take a move on this cell
         else if(layout.get(m.row()).get(m.col()) == CellStatus.BATTLESHIP_HIT)// there's a battleship being hit on this cell
            return false;// can't take a move on this cell
         else if(layout.get(m.row()).get(m.col()) == CellStatus.BATTLESHIP_SUNK)// there's a battleship being sunk on this cell
            return false;// can't take a move on this cell
         else if(layout.get(m.row()).get(m.col()) == CellStatus.CRUISER_HIT)// there's a cruiser being hit on this cell
            return false;// can't take a move on this cell
         else if(layout.get(m.row()).get(m.col()) == CellStatus.CRUISER_SUNK)// there's a cruiser being sunk on this cell
            return false;// can't take a move on this cell
         else if(layout.get(m.row()).get(m.col()) == CellStatus.DESTROYER_HIT)// there's a destroyer being hit on this cell
            return false;// can't take a move on this cell
         else if(layout.get(m.row()).get(m.col()) == CellStatus.DESTROYER_SUNK)// there's a destroyer being sunk on this cell
            return false;// can't take a move on this cell
         else if(layout.get(m.row()).get(m.col()) == CellStatus.SUB_HIT)// there's a submarine being hit on this cell
            return false;// can't take a move on this cell
         else if(layout.get(m.row()).get(m.col()) == CellStatus.SUB_SUNK)// there's a submarine being sunk on this cell
            return false;// can't take a move on this cell
         else if(layout.get(m.row()).get(m.col()) == CellStatus.NOTHING_HIT)//the cell is hit without a ship on it
            return false;// can't take a move on this cell
         else// if the conditions above all fails
            return true;// we can take a move on this cell
     }
     
     
     // public ArrayList<ArrayList<CellStatus>> getLayout()
//      {
//          ArrayList<ArrayList<CellStatus>> copyLayout = new ArrayList<ArrayList<CellStatus>>(layout);
//          return copyLayout;
//      
//      }
      /** ArrayList<ArrayList<CellStatus>> getLayout()
       @return ArrayList<ArrayList<CellStatus>> returns an arraylist for the layout
      */
      public ArrayList<ArrayList<CellStatus>> getLayout()
      {
         return layout;
      }
     
     /** getFleet()
       @return Fleet returns the fleet
     */
     public Fleet getFleet()
     {
         return fleet;
     }
     
     /** gameOver()
       @return boolean returns a boolean to determine whether the game is over
     */
     public boolean gameOver()
     {
         return fleet.gameOver();
     }
     
     
     /** getStatus(int row, int col)
       @param int receives the integer value of row and column
       @return CellStatus returns the cell status 
     */
     public CellStatus getStatus(int row, int col)
     {
        return layout.get(row).get(col);

     }
         

      
   
   

}

