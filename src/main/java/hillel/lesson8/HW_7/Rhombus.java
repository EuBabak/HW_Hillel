package hillel.lesson8.HW_7;

public class Rhombus extends Quadrilateral {
    double height;

    Rhombus(double side, double height) {
        super(side, side, side, side);
        this.height = height;
    }

    @Override
    double area() {
        return firstSide * height;
    }
}
