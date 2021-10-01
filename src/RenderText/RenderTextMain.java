package RenderText;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RenderTextMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text("Java is cool");
        final int[] fontSize = {40};
        text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, fontSize[0]));
        text.setFill(Color.BLUE);
        text.setX(50);
        text.setY(50);
        final boolean[] isBlue = {true};
        text.setOnMouseClicked(e -> {
            if (isBlue[0]) {
                text.setFill(Color.RED);
                isBlue[0] = false;
            } else {
                text.setFill(Color.BLUE);
                isBlue[0] = true;
            }
        });

        text.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.UP) {
                fontSize[0] = fontSize[0] < 80 ? fontSize[0] + 5 : fontSize[0];
            } else if(e.getCode() == KeyCode.DOWN) {
                fontSize[0] = fontSize[0] > 10 ? fontSize[0] - 5 : fontSize[0];
            }
            text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, fontSize[0]));
        });

        Pane pane = new Pane();
        pane.getChildren().addAll(text);
        primaryStage.setTitle("Render Text");
        primaryStage.setScene(new Scene(pane, 600, 100));
        primaryStage.show();
        text.requestFocus();
    }
    public static void main(String[] args) { launch(args); }
}
