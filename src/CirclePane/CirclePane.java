package CirclePane;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * CirclePane
 * Created by ndhuy
 * Date 25/08/2021 - 21:32
 * Description: ...
 */
public class CirclePane extends StackPane {
    private Circle circle = new Circle(50);

    public CirclePane() {
        getChildren().add(this.circle);
        this.circle.setStroke(Color.RED);
        this.circle.setFill(Color.AQUA);
    }

    public void enlarge() {
        this.circle.setRadius(this.circle.getRadius() + 2);
    }

    public void shrink() {
        double newRadius = this.circle.getRadius() > 2 ? this.circle.getRadius() - 2 : this.circle.getRadius();
        this.circle.setRadius(newRadius);
    }
}
