import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
// visualize a square in the tictactoe board
public class CellPane extends HBox
{
   private static final Image xImage = new Image("x.gif",40,40,false,false);
   private static final Image oImage = new Image("o.gif",40,40,false,false);
   private int row; // cell knows it's row/col location
   private int col;
   private ImageView imageView;
   
   public CellPane(char ch, int r, int c)
   {
      this.setStyle("-fx-border-color: blue;"
               +"-fx-border-width: 5;");
      this.setPrefSize(50,50);
      row = r;
      col = c;
      setCell(ch);
   }
   public int getRow()
   {
      return row;
   }
   public int getCol()
   {
      return col;
   }
   public void setCell(char ch)
   {
      
       if (ch == 'x')
       {
          imageView = new ImageView(xImage);
          this.getChildren().add(imageView);
       }
       else if (ch == 'o')
       {
         imageView = new ImageView(oImage);
         this.getChildren().add(imageView);
       }
       else
         imageView = null;
       
       
  
   }
   



}