import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
public class CirclePane extends HBox
{
   private int numCircles;
   private Color fill;
   
   public CirclePane(Color c)
   {
      this(1,c);   
   }
   public CirclePane(int numCircles, Color c)
   {
    this.setAlignment(Pos.CENTER);
    this.setPrefSize(100,100);
    this.setStyle("-fx-border-width: 5;" +
                  "-fx-border-color: black;");
    for (int i = 0; i < numCircles; i++)
       this.getChildren().add(new Circle(10,c));
    fill = c;
    this.numCircles = numCircles;
   
   
   
   }
   public Color getFill()
   {
      return fill;
   }
   public int getNumCircles()
   {
      return numCircles;
   }
   public void setNumCircles(int n)
   {
       numCircles = n;
       this.getChildren().clear();
       for (int i = 0; i < numCircles; i++)
          this.getChildren().add(new Circle(10,fill));
   }



}