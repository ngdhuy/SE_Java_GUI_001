package MVC.Views;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * MVC.Views
 * Created by ndhuy
 * Date 27/08/2021 - 20:32
 * Description: ...
 */
public class StudentView extends HBox {
    private Label lblStudentID;
    private Label lblStudentName;

    public StudentView() {
        this.lblStudentID = new Label();
        this.lblStudentName = new Label();

        this.getChildren().addAll(this.lblStudentID, this.lblStudentName);
    }

    public void render(int studentID, String studentName) {
        this.lblStudentID.setText(Integer.toString(studentID));
        this.lblStudentName.setText(studentName);
    }
}
