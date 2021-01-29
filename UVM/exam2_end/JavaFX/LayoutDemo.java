import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.PaneBorder;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class LayoutDemo extends Application {
   @Override
   public void start(Stage primaryStage) {
           BoarderPane pane = new BoarderPane();
         //GridPane pane = new GridPane();
       //FlowPane pane = new FlowPane(Orientation.VERTICAL);
       //pane.setHgap(10);
       //pane.setVgap(10);
       //pane.setPadding(new Insets(15, 5, 15, 5));
       pane.setStyle("-fx-background-color: aquamarine;");
       Image image = new Image(".jpg");
       pane.getChildren().add(new ImageView(Image));
       
       Label [] bunchOfLabels = new Label[5];
       bunchOfLabels[0] = new Label("One");
       bunchOfLabels[1] = new Label("Two");
       bunchOfLabels[2] = new Label("Three");
       bunchOfLabels[3] = new Label("Four");
       bunchOfLabels[4] = new Label("Five");
       for (int i = 0; i<bunchOfLabels.length;i++)
       {
         bunchOfLabels[i].setStyle("-fx-background-color: lavender;"+
                                 "-fx-border-color: black;" +
                                 "-fx-border-width: 5;");

         //pane.getChildren().add(bunchOfLabels[i]);
       }
       // // pane.add(bunchOfLabels[0],0,0);//col row
// //        pane.add(bunchOfLabels[1],1,0);
// //        pane.add(bunchOfLabels[2],0,1);
// //        pane.add(bunchOfLabels[3],1,1);
// //        pane.add(bunchOfLabels[4],2,1);
        // pane.setTop(bunchOfLabels[0],0,0);//col row
//         pane.setLeft(bunchOfLabels[1],1,0);
//         pane.setRight(bunchOfLabels[2],0,1);
//         pane.setCenter(bunchOfLabels[3],1,1);
//         pane.setBottom(bunchOfLabels[4],2,1); 
       
       Scene scene = new Scene(pane);
       primaryStage.setScene(scene);
       primaryStage.show();
      
      
   }
   public static void main(String [] args) {
      launch(args);
   }
}


//HBox VBox