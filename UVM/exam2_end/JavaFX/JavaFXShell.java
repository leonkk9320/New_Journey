import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class JavaFXShell extends Application {
 @Override
 public void start(Stage primaryStage) 
 {
   FlowPane pane = new FlowPane();
   Scene s = new Scene(pane);
   
   Circle c = new Circle();
   c.setCenterX(100);
   c.setCenterY(100);
   c.setRadius(50);
   c.setStroke(Color.RED);
   c.setFill(Color.BLUE);
   c.setStrokeWidth(10);
   pane.getChildren().add(c);
   
   Circle c2 = new Circle(150,150,75);
   c2.setStyle("-fx-fill: red; -fx-stroke: blue;");
   //c2.setStroke(Color.YELLOW);
   //c2.setFill(Color.TRANSPARENT);
   //c2.setStrokeWidth(20);
   pane.getChildren().add(c2);

   
   
   Button b1 = new Button("push me");
   pane.getChildren().add(b1);
   
   Button b2 = new Button("suck me");
   pane.getChildren().add(b2);
   
   Text t1 = new Text("F text");
   pane.getChildren().add(t1);
   
   Text t2 = new Text("S text");
   pane.getChildren().add(t2);
   
   Font f1 = new Font("Arial", 20);
   t1.setFont(f1);
   
   Font f2 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 48);
   t1.setFont(f2);
   
   
   primaryStage.setScene(s);
   
   primaryStage.setTitle("Jackie's window");
   primaryStage.show();
 }
 public static void main(String [] args) 
 {
   launch(args);
 }
}