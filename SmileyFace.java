
import javafx.application.Application;
import static javafx.scene.paint.Color.GRAY;
import static javafx.scene.paint.Color.YELLOW;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import static javafx.scene.paint.Color.PINK;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

/**
 *
 * @author benismunganga
 */
public class SmileyFace extends Application
{
    @Override
    public void start(Stage mainStage)
    {
        //Circle that serve as the face
        Circle c1 = new Circle();
        c1.setCenterX(10);
        c1.setCenterY(20);
        c1.setRadius(85);
        c1.setFill(YELLOW);
        //4 lines that serve as eyes
        Line l1 = new Line(36,5,61,5);
        l1.setRotate(145);
        l1.setFill(GRAY);
        Line l2 = new Line(35,20,60,20);
        l2.setRotate(45);
        l2.setFill(GRAY);
        Line l3 = new Line(-40,5,-15,5);
        l3.setRotate(45);
        l3.setFill(GRAY);
        Line l4 = new Line(-41,20,-16,20);
        l4.setRotate(145);
        l4.setFill(GRAY);
        //Two arcs that serve as mouth (arc1) and tongue(arc2)
        Arc arc1 = new Arc(12, 20, 100, 60, 30 + 193, 90);
        arc1.setType(ArcType.CHORD);
        arc1.setFill(GRAY);
        Arc arc2 = new Arc(10, 15, 80, 60, 244, 50);
        arc2.setType(ArcType.CHORD);
        arc2.setFill(PINK);
        //Creating a group and adding the shapes to it
        Group grp = new Group();
        grp.getChildren().addAll(c1, l1, l2, l3, l4, arc1, arc2);
        Scene scene = new Scene(new BorderPane(grp), 300, 300);
        mainStage.setTitle("Smiley Face");
        mainStage.setScene(scene);
        mainStage.show();
    }
    public static void main(String []args)
    {
        launch(args);
    }
}
