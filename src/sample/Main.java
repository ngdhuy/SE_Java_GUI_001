package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        VBox vBox = new VBox();

        HBox hBoxTop = new HBox();
        Label lblMyLable = new Label("My Label");
        TextField txtMyText = new TextField("My Text");
        hBoxTop.getChildren().addAll(lblMyLable, txtMyText);

        HBox hBoxBot = new HBox();
        CheckBox chk = new CheckBox();
        Label lblMyCheckBox = new Label("My CheckBox");
        Button btnMyButton = new Button("My Button");
        hBoxBot.getChildren().addAll(chk, lblMyCheckBox, btnMyButton);

        VBox vBoxExt = new VBox();
        TextArea txtArea = new TextArea("This is example of using TextArea");
        txtArea.setPrefColumnCount(15);
        txtArea.setPrefRowCount(3);
        txtArea.setWrapText(false);
        txtArea.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

        ComboBox<String> cmb = new ComboBox<String>();
        cmb.getItems().addAll("Apple", "Samsung", "Sony", "LG");
//        cmb.getSelectionModel().selectFirst();
        cmb.getSelectionModel().select(2);

        String imagePath = "resources/corgi.jpg";
        Image image = new Image(imagePath);
        ImageView img = new ImageView(image);
        img.setFitHeight(100);
        img.setPreserveRatio(true);

        vBoxExt.getChildren().addAll(txtArea, cmb, img);

        Pane pane = new Pane();

        Line line = new Line(0, 0, 100, 100);
        Circle circle = new Circle(150, 150, 30);
        circle.setFill(Color.RED);
        circle.setStroke(Color.GREEN);
        circle.setStrokeWidth(10);
        Rectangle rectangle = new Rectangle(120, 20, 180, 80);
        Text text = new Text(20, 20, "This is text");

        Polyline polyline = new Polyline();
        polyline.setStroke(Color.RED);
        polyline.setFill(new Color(0.1, 0.1, 0.1, 0.5));
        ObservableList<Double> list = polyline.getPoints();
        final double width = 200, height = 200;
        final double centerX = width / 2, centerY = height / 2;
        final double radius = Math.min(width, height) * 0.4;
        for(int i = 0; i <= 12; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 12));
            list.add(centerY + radius * Math.sin(2 * i * Math.PI / 12));
        }

        pane.getChildren().addAll(line, circle, rectangle, text, polyline);

        HBox formBox = new HBox();

        Label lblName = new Label("Name:");
        TextField txfName = new TextField();
        Button btnSay = new Button("Say");
        Label lblResult = new Label();

        btnSay.setOnAction((ActionEvent e) -> {
            String s = "Hello " + txfName.getText();
            lblResult.setText(s);
        });

        formBox.getChildren().addAll(lblName, txfName, btnSay, lblResult);

        vBox.getChildren().addAll(hBoxTop, hBoxBot, vBoxExt, pane, formBox);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
