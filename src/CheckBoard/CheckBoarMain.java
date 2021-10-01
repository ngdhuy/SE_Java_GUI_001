package CheckBoard;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * CheckBoard
 * Created by ndhuy
 * Date 28/08/2021 - 20:32
 * Description: ...
 */
public class CheckBoarMain extends Application {
    @Override
    public void start(Stage primaryState) throws Exception {
        GridPane gridPane = new GridPane();

        int width = 50;
        int height = 50;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle();
                rectangle.setWidth(width);
                rectangle.setHeight(height);
                Color fillColor = (i + j) % 2 == 0 ? Color.WHITE : Color.BLACK;
                rectangle.setFill(fillColor);
                gridPane.add(rectangle, i, j);
            }
        }

        primaryState.setTitle("Check Board");
        primaryState.setScene(new Scene(gridPane));
        primaryState.show();
    }

    public static void main (String[] args) { launch(args); }
}
