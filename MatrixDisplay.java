
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MatrixDisplay extends Application 
{
  @Override 
  
  public void start(Stage primaryStage) 
  {
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(1);
    pane.setVgap(1);

    for(int i = 0; i < 10; i++)
    {
         for(int j = 0; j < 10; j++)
             {
                 TextField randomText = new TextField();
                 randomText.setPrefColumnCount(1);
                 randomText.setText(String.valueOf((int)(Math.random()*2)));
                 pane.add(randomText, i, j);
             }
    }

     Scene scene = new Scene(pane);
     primaryStage.setTitle("Display Random: 0 or 1"); // Set the stage title
     primaryStage.setScene(scene); // Place the scene in the stage  
     primaryStage.show(); // Display the stage
     primaryStage.setResizable(false);
  }
  
  public static void main(String[] args)
  {
    launch(args);
  
  }
  
 }
