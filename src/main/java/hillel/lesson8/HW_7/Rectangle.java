package hillel.lesson8.HW_7;

public class Rectangle extends Quadrilateral {
    Rectangle(double length, double width) {
        super(length, width, length, width);
    }

    @Override
    double area() {
        return firstSide * secondSide;
    }
}
