package TrafficeLight;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

/**
 * TrafficeLight
 * Created by ndhuy
 * Date 29/08/2021 - 18:46
 * Description: ...
 */
public class TrafficeLightMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text txtTitle = new Text("Traffic Light");
        txtTitle.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
        txtTitle.setFill(Color.RED);

        Circle cirRed = new Circle();
        Circle cirYellow = new Circle();
        Circle cirGreen = new Circle();

        int radius = 50;

        cirRed.setRadius(radius);
        cirYellow.setRadius(radius);
        cirGreen.setRadius(radius);

        cirRed.setFill(Color.GRAY);
        cirYellow.setFill(Color.GRAY);
        cirGreen.setFill(Color.GRAY);

        Button btnNext = new Button("Next");
        Button btnExit = new Button("Exit");

        btnExit.setOnAction(e -> { primaryStage.close(); });
        final int[] current = {0};
        btnNext.setOnAction(e -> {
            cirRed.setFill(Color.GRAY);
            cirYellow.setFill(Color.GRAY);
            cirGreen.setFill(Color.GRAY);

            switch (current[0]){
                case 0:
                    cirGreen.setFill(Color.GREEN);
                    break;
                case 1:
                    cirYellow.setFill(Color.YELLOW);
                    break;
                case 2:
                    cirRed.setFill(Color.RED);
                    break;
            }
            current[0] = current[0] > 1 ? 0 : current[0] + 1;
        });

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run(){
                cirRed.setFill(Color.GRAY);
                cirYellow.setFill(Color.GRAY);
                cirGreen.setFill(Color.GRAY);

                switch (current[0]){
                    case 0:
                        cirGreen.setFill(Color.GREEN);
                        break;
                    case 1:
                        cirYellow.setFill(Color.YELLOW);
                        break;
                    case 2:
                        cirRed.setFill(Color.RED);
                        break;
                }
                current[0] = current[0] > 1 ? 0 : current[0] + 1;
            }
        }, 0, 1000);

        VBox vbLight = new VBox();
        vbLight.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        vbLight.setAlignment(Pos.CENTER);
        vbLight.setPadding(new Insets(10, 10, 10, 10));
        vbLight.setSpacing(10);
        vbLight.getChildren().addAll(cirRed, cirYellow, cirGreen);

        HBox hbButtonGroup = new HBox();
        hbButtonGroup.setAlignment(Pos.CENTER);
        hbButtonGroup.setSpacing(10);
        hbButtonGroup.setPadding(new Insets(10, 10, 10, 10));
        hbButtonGroup.getChildren().addAll(btnNext, btnExit);

        VBox vbContainer = new VBox();
        vbContainer.setAlignment(Pos.CENTER);
        vbContainer.setSpacing(10);
        vbContainer.setPadding(new Insets(10, 10, 10, 10));
        vbContainer.getChildren().addAll(txtTitle, vbLight, hbButtonGroup);

        primaryStage.setTitle("Traffic Light");
        primaryStage.setScene(new Scene(vbContainer));
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
