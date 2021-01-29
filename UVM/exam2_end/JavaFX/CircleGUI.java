import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.shape.Circle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

 public class CircleGUI extends Application
 {
    public void start(Stage primaryStage) 
      {
         BorderPane pane = new BorderPane();
         GridPane squares = new GridPane();
         HBox textArea = new HBox();
         textArea.setAlignment(Pos.CENTER);
         /* add text to bottom pane */

         
         
         /* add stuff to grid */

         HBox circles = new HBox();
         circles.setPrefSize(100,100);
         circle.setAlignment(Pos.CENTER);
         circle.setStyle("-fx-border-color: black;"+
                           "-fx-border-width: 5;");
         circles .getChildren().add(new Circle(10, Color.RED));
         squares.add(circles,0,0);

         pane.setCenter(squares);
         pane.setBottom(textArea);
   
        // center grid pane inside center of borderpane
         squares.setAlignment(Pos.CENTER); 
         Scene scene = new Scene(pane);
         primaryStage.setScene(scene);
         primaryStage.show();
    }

   public static void main(String [] args)
   {
   
      launch(args);
   
   }
}

   /** code for event handling **/
   // creating a named inner class.
//        Handler h = new Handler();
//        b.setOnAction(h);

//    }  // inner class
//    class Handler implements EventHandler<ActionEvent> {
//       public void handle(ActionEvent e)
//       {
//         pane.setStyle("-fx-background-color: red");
//       }
//    }

   // an anonymous inner class.
//        b = new Button("Push me");
//        pane.getChildren().add(b);
//        b.setOnAction( new EventHandler<ActionEvent>() {
//          public void handle(ActionEvent e)
//          {
//             pane.setStyle("-fx-background-color: red");
//          }
//        });

   // a lamda expression
//        b.setOnAction(event ->
//        {
//          pane.setStyle("-fx-background-color: red");
//        });

   // a method reference
//        b.setOnAction(this::handle);
//        
//    public void handle(ActionEvent e)
//    {
//       pane.setStyle("-fx-background-color: red");
//    }