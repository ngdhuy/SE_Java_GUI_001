package CirclePane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

/**
 * CirclePane
 * Created by ndhuy
 * Date 25/08/2021 - 21:31
 * Description: ...
 */
public class CircleMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        CirclePane circlePane = new CirclePane();
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button btnEnlarge = new Button("Enlarge");
        Button btnShrink = new Button("Shrink");

        btnEnlarge.setOnAction((ActionEvent) -> {
            circlePane.enlarge();
        });

        btnShrink.setOnAction((ActionEvent) -> {
            circlePane.shrink();
        });

        hBox.getChildren().addAll(btnEnlarge, btnShrink);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setTitle("Control Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
