import javafx.application.Application; 
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.geometry.Pos;

public class TicTacToeGUI extends Application
{
   private TicTacToe game; // the "guts" of the game
   private GridPane grid;  // the board of squares
   private BorderPane mainPane;  // primary layout of application
   private VBox statusPane;  // place for messages
   private Text status;
   private Text title;
   private HBox buttonPane; 
   private Button exit, newGame;
   @Override
   public void start(Stage primaryStage) {
      primaryStage.setTitle("Tic Tac Toe");
      // set up panes
      mainPane = new BorderPane();
      grid = new GridPane();
      // intialize game and draw board
      game = new TicTacToe();
      drawBoard(); 
      mainPane.setCenter(grid);
      statusPane = new VBox();
      title = new Text("Tic Tac Toe");
      title.setFont(Font.font("Arial",24));
      statusPane.setAlignment(Pos.CENTER);
      status = new Text("");
      statusPane.getChildren().add(title);
      statusPane.getChildren().add(status);

      mainPane.setTop(statusPane);
      
      buttonPane = new HBox(10);
      buttonPane.setAlignment(Pos.CENTER);
      exit = new Button("Exit");
      exit.setOnAction( new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e)
         {
            Platform.exit();
         }
       });
      buttonPane.getChildren().add(exit);
      
      newGame = new Button("New Game");
      newGame.setOnAction( new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e)
         {
            game = new TicTacToe();
            drawBoard();
            status.setText("");
         }
       });
      buttonPane.getChildren().add(newGame);

      mainPane.setBottom(buttonPane);
      // complete setup
      Scene scene = new Scene(mainPane);
      primaryStage.setScene(scene);
      primaryStage.show();
      
      
   }
   // event handler for user clicking on a square
   public void handleClick(MouseEvent e)
   {  
      CellPane cp = (CellPane)(e.getSource());
      if (game.move(cp.getRow(),cp.getCol()))
      {
         drawBoard();
         if (game.gameOver())
         {
            for (Node pane: grid.getChildren())
               pane.setOnMouseClicked(null);

            char ch = game.winner();
            if (ch == 'x')
               status.setText("X wins");
            
            else if (ch == 'o')
               status.setText("O wins");
            else
               status.setText("It's a draw");
            
         }
      }
         
      
   }   
   // using information from game, create cell panes
   public void drawBoard()
   {
      grid.getChildren().clear(); // clear the board
      for (int r = 0; r < 3;r++)
         for (int c = 0; c < 3;c++)
         {  
            CellPane cp = new CellPane(game.getSquare(r,c),r,c);
            if (!game.isSquareUsed(r,c))
               cp.setOnMouseClicked(this::handleClick);
            grid.add(cp,c,r);
         }
            
   }
   public static void main(String [] args) {
      launch(args);
   }
}




