package MVC.Controllers;

import MVC.Models.Student;
import MVC.Views.StudentView;
import javafx.scene.Scene;

/**
 * MVC.Controllers
 * Created by ndhuy
 * Date 27/08/2021 - 20:31
 * Description: ...
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController() {
        this.model = new Student();
        this.view = new StudentView();
    }

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public Student getModel() {
        return model;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

    public void render() {
        this.view.render(this.model.getId(), this.model.getName());
    }

    public void setStudentInfo(int studentID, String studentName){
        this.model.setId(studentID);
        this.model.setName(studentName);

        this.render();
    }
}
