package KeyEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * KeyEvent
 * Created by ndhuy
 * Date 25/08/2021 - 22:37
 * Description: ...
 */
public class KeyMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");
        pane.getChildren().add(text);

        text.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    text.setY(text.getY() + 10);
                    break;
                case UP:
                    text.setY(text.getY() - 10);
                    break;
                case LEFT:
                    text.setX(text.getX() - 10);
                    break;
                case RIGHT:
                    text.setX(text.getX() + 10);
                    break;
                default:
                    if (e.getText().length() > 0 && Character.isLetterOrDigit(e.getText().charAt(0))) {
                        text.setText(e.getText());
                    }
            }
        });

        Scene scene = new Scene(pane, 600, 400);
        primaryStage.setTitle("Key event");
        primaryStage.setScene(scene);
        primaryStage.show();
        text.requestFocus();
    }
    public static void main(String[] args) { launch(args); }
}
