package CardGame;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

/**
 * CardGame
 * Created by ndhuy
 * Date 28/08/2021 - 21:17
 * Description: ...
 */
public class CardGameMain extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        String imagePath = "resources/cards.png";
        Image image = new Image(imagePath);

        double width = image.getWidth() / 13;
        double height = image.getHeight() / 4;

        Canvas canvas_1 = new Canvas(width, height);
        canvas_1.getGraphicsContext2D().drawImage(image, 0, 0, width, height, 0, 0, width, height);

        Canvas canvas_2 = new Canvas(width, height);
        canvas_2.getGraphicsContext2D().drawImage(image, 0, 0, width, height, 0, 0, width, height);

        Canvas canvas_3 = new Canvas(width, height);
        canvas_3.getGraphicsContext2D().drawImage(image, 0, 0, width, height, 0, 0, width, height);

        HBox hbCards = new HBox();
        hbCards.setPadding(new Insets(10, 10, 10, 10));
        hbCards.setSpacing(10);
        hbCards.getChildren().addAll(canvas_1, canvas_2, canvas_3);

        final String point = "3 Points";
        Text text = new Text(point);
        text.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Button btnDeal = new Button("Deal");
        btnDeal.setPrefWidth(100);

        Button btnExit = new Button("Exit");
        btnExit.setPrefWidth(100);

        btnExit.setOnAction(e -> {
            primaryStage.close();
        });

        Random rand = new Random();
        int maxValue = 52;
        btnDeal.setOnAction(e -> {
            int value_1 = rand.nextInt(maxValue);
            int i_1 = value_1 / 13;
            int j_1 = value_1 % 13;

            int value_2 = rand.nextInt(maxValue);
            int i_2 = value_2 / 13;
            int j_2 = value_2 % 13;

            int value_3 = rand.nextInt(maxValue);
            int i_3 = value_3 / 13;
            int j_3 = value_3 % 13;

            int total = ((j_1 > 9 ? 0 : j_1 + 1) + (j_2 > 9 ? 0 : j_2 + 1) + (j_3 > 9 ? 0 : j_3 + 1)) % 10;
            String sValue = Integer.toString(total) + " Points";
            text.setText(sValue);

            canvas_1.getGraphicsContext2D().drawImage(image, j_1 * width, i_1 * height, width, height, 0, 0, width, height);
            canvas_2.getGraphicsContext2D().drawImage(image, j_2 * width, i_2 * height, width, height, 0, 0, width, height);
            canvas_3.getGraphicsContext2D().drawImage(image, j_3 * width, i_3 * height, width, height, 0, 0, width, height);
        });

        HBox hbButton  = new HBox();
        hbButton.setPadding(new Insets(10, 10, 10, 10));
        hbButton.setAlignment(Pos.CENTER);
        hbButton.setSpacing(50);
        hbButton.getChildren().addAll(btnDeal, btnExit);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hbCards);
        borderPane.setCenter(text);
        borderPane.setBottom(hbButton);

        primaryStage.setTitle("Card Game");
        primaryStage.setScene(new Scene(borderPane));
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
