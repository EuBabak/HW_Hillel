package hillel.lesson8.HW_7;

public class Trapezoid extends Quadrilateral {
    double height;

    Trapezoid(double firstBase, double secondBase, double height, double side) {
        super(firstBase, secondBase, side, side);
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * (firstSide + secondSide) * height;
    }
}
