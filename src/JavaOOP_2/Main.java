package JavaOOP_2;

import JavaOOP_2.entities.Circle;
import JavaOOP_2.entities.Oval;
import JavaOOP_2.entities.Rectangle;
import JavaOOP_2.entities.Square;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getSquare());

        Oval oval = new Oval(2, 3);
        System.out.println(oval.getSquare());

        Square square = new Square(2);
        System.out.println(square.getSquare());

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getSquare());
    }
}
