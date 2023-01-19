import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import interfaces.Shape;

public class App {

    public static void main(String[] args) throws Exception {
        List<Shape> shapeList = new ArrayList<>();

        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(1.0, 4.0);

        shapeList.add(circle);
        shapeList.add(rectangle);

        System.out.printf("Circle area: %.2f\n", circle.area());
        System.out.printf("Rectangle area: %.2f\n", rectangle.area());
        System.out.printf("Sum: %.2f\n", sumOfAreas(shapeList)); 
    }

    public static Double sumOfAreas(List<? extends Shape> list) {
        Double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }
        return sum;
    }
}
