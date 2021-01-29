import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.geometry.Pos;


public class CellPane extends HBox
{
   private int row; 
   private int col;
   private Text txt;//set variables
   
   
   /** CellPane(CellStatus cs, String s, int r, int c)
       @param CellStatus cs
       @param String s
       @param int r
       @param int c
       the constructor receives cell status, a flag string and two integers as row and colunm
       to decorate the cell
   */
   public CellPane(CellStatus cs, String s, int r, int c)
   {
      this.setStyle("-fx-border-color: aqua;"
               +"-fx-border-width: 5;");//set the default appearance of the cell
      this.setPrefSize(40,50);// set the pref size
      row = r;
      col = c;//pass the parameter value to the private variables
      if (s.equals("p"))//determine which borad we are going to operate on
         setCellPlayer(cs);
      else
         setCellComp(cs);
   }
   
   /** getRow()
       @return int
       the method returns the row value
   */
   public int getRow()
   {
      return row;
   }
   
   /** getCol()
       @return int
       the method returns the column value
   */
   public int getCol()
   {
      return col;
   }
   
   
   /** setCellPlayer(CellStatus cs)
       @param CellStatus
       the method receives the cell status and make the user board shows differently for
       different operations on the board
   */
   public void setCellPlayer(CellStatus cs)
   {
      String str = cs.toString();
      txt = new Text();
      
      if (str.equals("oo"))
      {
         this.setStyle("-fx-border-color: aqua;"
               +"-fx-border-width: 5;");
         txt.setText(null);
      }
      else if (str.equals("xx"))
         this.setStyle("-fx-border-color: black;"
               +"-fx-background-color: white;"+"-fx-border-width: 1;");
      else if(str.equals("HX"))
      {
         this.setStyle("-fx-border-color: black;"
               +"-fx-background-color: red;"+"-fx-border-width: 1;");
         if (cs == CellStatus.AIRCRAFT_CARRIER_HIT)
            txt.setText("A");
         else if(cs == CellStatus.CRUISER_HIT)
            txt.setText("C");
         else if(cs == CellStatus.BATTLESHIP_HIT)
            txt.setText("B");
         else if(cs == CellStatus.DESTROYER_HIT)
            txt.setText("D");
         else
            txt.setText("S");
      }
      else if (str.equals("AX")||str.equals("BX")||str.equals("CX")||str.equals("DX")||str.equals("SX"))
      {
         txt.setText(str.charAt(0)+"");
            this.setStyle("-fx-border-color: black;"
               +"-fx-background-color: gold;"+"-fx-border-width: 1;");
      }
      else
      {
         txt.setText(str.charAt(1)+"");
            this.setStyle("-fx-border-color: black;"
               +"-fx-background-color: dodgerblue;"+"-fx-border-width: 1;");    
      }
      
       txt.setFont(Font.font(null, FontWeight.BOLD, 32));
       this.setAlignment(Pos.CENTER);
       this.getChildren().add(txt);   
   }
   
   /** setCellComp(CellStatus cs)
       @param CellStatus
       the method receives the cell status and make the computer board shows differently for
       different operations on the board
   */
   public void setCellComp(CellStatus cs)
   {
       String str = cs.toString();
       txt = new Text();
       this.setStyle("-fx-border-color: aqua;"
               +"-fx-border-width: 5;");
       if (str.charAt(0) == 'o')
       {
         this.setStyle("-fx-border-color: aqua;"
               +"-fx-border-width: 5;");
         txt.setText("");
       }
       else if (str.charAt(0) == 'x')
       {
         this.setStyle("-fx-border-color: black;"
               +"-fx-background-color: white;"+"-fx-border-width: 1;");
       }
       else if (str.charAt(0) == 'H')
       {
         this.setStyle("-fx-border-color: black;"
               +"-fx-background-color: red;"+"-fx-border-width: 1;");
       }
       else
       {
         txt = new Text(str.charAt(0)+"");
         this.setStyle("-fx-border-color: black;"
               +"-fx-background-color: gold;"+"-fx-border-width: 1;");
        }

      txt.setFont(Font.font(null, FontWeight.BOLD, 30));
      this.setAlignment(Pos.CENTER);
      this.getChildren().add(txt);
   
  }

}