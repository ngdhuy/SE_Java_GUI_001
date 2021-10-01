package MouseEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * MouseEvent
 * Created by ndhuy
 * Date 25/08/2021 - 22:17
 * Description: ...
 */
public class MouseMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Text text = new Text(20, 20, "Hello SEstudio");
        pane.getChildren().add(text);

        text.setOnMouseDragged(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
        });

        Scene scene = new Scene(pane, 600, 400);
        primaryStage.setTitle("Mouse Event");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
