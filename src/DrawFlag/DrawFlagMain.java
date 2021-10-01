package DrawFlag;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;

/**
 * DrawFlag
 * Created by ndhuy
 * Date 27/08/2021 - 21:18
 * Description: ...
 */
public class DrawFlagMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("FlagView.fxml"));

        primaryStage.setTitle("Four Flags");
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
