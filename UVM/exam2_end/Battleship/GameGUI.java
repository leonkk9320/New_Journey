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
import javafx.geometry.HPos;
import java.util.Scanner;
import java.io.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Random;

public class GameGUI extends Application
{
   private Game game; // the "guts" of the game
   private GridPane grid1, grid2;  // the board of squares
   private BorderPane mainPane,mainPane1;  // primary layout of application
   private VBox statusPane, boardsPane;  // place for messages
   private Text status, title, boards;
   private HBox buttonPane1, buttonPane2; 
   private Button exit, newGame, compAction;
   private String message = "";
   private Alert alert;
   private Random rand;
   
   
   /** start(Stage primaryStage)
       the methods set up primary stages and add panes and put contents in it.
   */
   @Override
   public void start(Stage primaryStage) {
      primaryStage.setTitle("Battleship");
      // set up panes
      mainPane = new BorderPane();
      mainPane1 = new BorderPane();
      mainPane.setPrefSize(950,600);
      mainPane1.setPrefSize(825,400);
      grid1 = new GridPane();
      grid2 = new GridPane();
      mainPane1.setLeft(grid1);
      mainPane1.setRight(grid2);
      statusPane = new VBox();
      boardsPane = new VBox();
      title = new Text("Battleship");//add title
      title.setFont(Font.font("Arial",28));//set the font of the words
      statusPane.setAlignment(Pos.CENTER);// set the position
      
      boards = new Text("user board\t\t\t\t\t\t\tcomputer board\t\t\t");
      boards.setFont(Font.font("Arial",20));

      status = new Text("");
      
      statusPane.getChildren().add(title);
      statusPane.getChildren().add(boards);
      statusPane.getChildren().add(status);


      mainPane.setTop(statusPane);
      
      try
      {
         game = new Game();
         rand = new Random();
         if(rand.nextBoolean())//use random to randomly start the game, either computer first or user first
         {
            status.setText("You First");//inform user goes first
            drawUserBoard();
            drawComputerBoard();//draw the boards
         }else{
            status.setText("Computer First");//inform computer goes first
            game.makeComputerMove();//make computer take a move
            drawComputerBoard();
            drawUserBoard();//draw the boards
         }
      }
      catch(IOException e)//handle the exception that the file isn't found
      {
         e.printStackTrace();
         System.out.println("file is not found");//show that the fiel is not found
      } 
      
      buttonPane1 = new HBox(5);
      buttonPane1.setAlignment(Pos.CENTER);
      exit = new Button("Exit");// create exit button
      exit.setOnAction( new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e)
         {
            Platform.exit();
         }
       });      
      
      buttonPane1.getChildren().add(exit);
      
      buttonPane2 = new HBox(10);
      compAction = new Button("Computer's turn");
      compAction.setOnAction(this::compTakeMove);
      buttonPane2.getChildren().add(compAction);//add the button to make computer move
      
      newGame = new Button("New Game");// allow user to start new game
      newGame.setOnAction( new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e)
         {
            try
            {
               game = new Game();
               rand = new Random();
               if(rand.nextBoolean())
               {
                  status.setText("You First");
                  drawUserBoard();
                  drawComputerBoard();
               }else{
                  status.setText("Computer First");
                  game.makeComputerMove();
                  drawComputerBoard();
                  drawUserBoard();
               }
            }
            catch(IOException io)
            {
               io.printStackTrace();
               System.out.println("file is not found");
            }
         }
       });
      buttonPane1.getChildren().add(newGame);

      mainPane.setBottom(buttonPane1);
      mainPane.setRight(buttonPane2);
      mainPane.setLeft(mainPane1);
      Scene scene = new Scene(mainPane);
      primaryStage.setScene(scene);
      primaryStage.show();
      
      
   }
   
   
   /** compTakeMove(ActionEvent e)
       allows computer to take a move and determine whether the game is over
   */
   public void compTakeMove(ActionEvent e)
   {
      message = (game.makeComputerMove())[1];
      drawUserBoard();
      gameOver();//determine if the game is over
      status.setText("Your Turn");
      drawComputerBoard();
   }
   
   /** handleClick(MouseEvent e)
       allows user to click the mouse to take operations
   */
   public void handleClick(MouseEvent e)
   {  
      CellPane cp = (CellPane)(e.getSource());
      message = game.makePlayerMove((new Move(cp.getRow(),cp.getCol())).toString());
      drawComputerBoard();
      for (Node pane: grid2.getChildren())
            pane.setOnMouseClicked(null);
      status.setText("Computer's Turn");
      gameOver();
         
      
   }  
    

   /** drawComputerBoard()
       the method can draw the computer board
   */
   public void drawComputerBoard()
   {  
      grid2.getChildren().clear(); //clear the board
      for (int r = 0; r < Board.SIZE;r++)//each row
      {
         for (int c = 0; c < Board.SIZE;c++)//each column
         {  
            CellPane cp = new CellPane(game.getComputerStatus(r,c),"c",r,c);//operation on each cell
            if (game.getComputerStatus(r,c).toString().charAt(0) == 'o')
               cp.setOnMouseClicked(this::handleClick);
            grid2.add(cp,c,r);
         }
       }
       
       gameOver();//determine if the game is over
   }
   
   
    /** drawComputerBoard()
       the method can draw the user board
   */
   public void drawUserBoard()
   {
      grid1.getChildren().clear(); //clear the board
      for (int r = 0; r < Board.SIZE;r++)//each row
         for (int c = 0; c < Board.SIZE; c++)//each column
         {  
            CellPane cp = new CellPane(game.getUserStatus(r,c),"p",r,c);//operation on each cell
            grid1.add(cp,c,r);
         }
       gameOver();//determine if the game is over        
   }
   
   
   /** gameOver()
       the method can determine whether the game is over
   */
   public void gameOver()
   {
      if(message != "" && message != null)
      {
          alert = new Alert(AlertType.INFORMATION);
          alert.setHeaderText(message);
          alert.showAndWait();// use alert to show message
          message = ""; //nothing in the message
      }
      if (game.computerDefeated() || game.userDefeated())// game can be over if computer or user is defeated
      {
         for (Node pane: grid2.getChildren())
            pane.setOnMouseClicked(null);
         compAction.setDisable(true);   
         if (game.computerDefeated())
            status.setText("User wins");
         else if (game.userDefeated())
            status.setText("Computer wins");
         else
            status.setText("It's a draw");
      }
   }
    
   public static void main(String [] args) {
      launch(args);// make the operations above launch 
   }
}




