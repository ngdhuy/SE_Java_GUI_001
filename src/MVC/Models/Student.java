package MVC.Models;

/**
 * MVC.Models
 * Created by ndhuy
 * Date 27/08/2021 - 20:32
 * Description: ...
 */
public class Student {
    private int id;
    private String name;

    public Student() {
        this.id = 0;
        this.name = "No name";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
