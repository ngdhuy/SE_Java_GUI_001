package ConnectTwoCircle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import jdk.jfr.Description;

/**
 * ConnectTwoCircle
 * Created by ndhuy
 * Date 29/08/2021 - 19:48
 * Description: ...
 */
public class ConnectTwoCircleMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Line line = new Line(400, 100, 200, 200);

        Circle circle_1 = new Circle();
        Circle circle_2 = new Circle();

        circle_1.setRadius(15);
        circle_1.setCenterX(400);
        circle_1.setCenterY(100);
        circle_1.setFill(Color.WHITE);
        circle_1.setStroke(Color.PINK);
        circle_1.setStrokeWidth(3);

        circle_2.setRadius(15);
        circle_2.setCenterX(200);
        circle_2.setCenterY(200);
        circle_2.setFill(Color.WHITE);
        circle_2.setStroke(Color.AQUA);
        circle_2.setStrokeWidth(3);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().addAll(line, circle_1, circle_2);

        drawArrowLine(100, 200, 400, 100, anchorPane);

        primaryStage.setTitle("Two Circles connect with One Line");
        primaryStage.setScene(new Scene(anchorPane, 600, 400));
        primaryStage.show();
    }

    public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane) {
        Line line = new Line(startX, startY, endX, endY);

        double slope = (startY - endY) / (startX - endX);
        double lineAngle = Math.atan(slope);
        double arrowAngle = Math.toRadians(45);

        Line arrow_1 = new Line(endX, endY, endX - 10 * Math.cos(lineAngle + arrowAngle), endY - 10 * Math.sin(lineAngle + arrowAngle));
        Line arrow_2 = new Line(endX, endY, endX - 10 * Math.cos(lineAngle - arrowAngle), endY - 10 * Math.sin(lineAngle - arrowAngle));
        pane.getChildren().addAll(line, arrow_1, arrow_2);
    }

    public static void main(String[] args) { launch(args); }
}
