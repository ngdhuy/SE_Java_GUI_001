package MVC;

import MVC.Controllers.StudentController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * MVC
 * Created by ndhuy
 * Date 27/08/2021 - 19:58
 * Description: ...
 */
public class MVCMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StudentController controller = new StudentController();
        controller.setStudentInfo(8, "Mr Buoi");

        Scene scene = new Scene(controller.getView(), 300, 200);
        primaryStage.setTitle("Demo MVC");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
