package BarChart;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * BarChart
 * Created by ndhuy
 * Date 28/08/2021 - 20:44
 * Description: ...
 */
public class BarChartMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox hBox = new HBox();
        hBox.setMinHeight(300);

        VBox vBox_1 = new VBox();
        vBox_1.setPadding(new Insets(10, 10, 10, 10));
        vBox_1.setAlignment(Pos.BOTTOM_CENTER);
        Text text_1 = new Text("Project -- 20%");
        Rectangle rec_1 = new Rectangle(100, 100);
        rec_1.setFill(Color.RED);
        vBox_1.getChildren().addAll(text_1, rec_1);

        VBox vBox_2 = new VBox();
        vBox_2.setPadding(new Insets(10, 10, 10, 10));
        vBox_2.setAlignment(Pos.BOTTOM_CENTER);
        Text text_2 = new Text("Quiz -- 10%");
        Rectangle rec_2 = new Rectangle(100, 50);
        rec_2.setFill(Color.BLUE);
        vBox_2.getChildren().addAll(text_2, rec_2);

        VBox vBox_3 = new VBox();
        vBox_3.setPadding(new Insets(10, 10, 10, 10));
        vBox_3.setAlignment(Pos.BOTTOM_CENTER);
        Text text_3 = new Text("Midterm -- 30%");
        Rectangle rec_3 = new Rectangle(100, 150);
        rec_3.setFill(Color.GREEN);
        vBox_3.getChildren().addAll(text_3, rec_3);

        VBox vBox_4 = new VBox();
        vBox_4.setPadding(new Insets(10, 10, 10, 10));
        vBox_4.setAlignment(Pos.BOTTOM_CENTER);
        Text text_4 = new Text("Final -- 40%");
        Rectangle rec_4 = new Rectangle(100, 200);
        rec_4.setFill(Color.ORANGE);
        vBox_4.getChildren().addAll(text_4, rec_4);

        hBox.getChildren().addAll(vBox_1, vBox_2, vBox_3, vBox_4);

        primaryStage.setTitle("Bar Chart");
        primaryStage.setScene(new Scene(hBox, 480, 300));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
