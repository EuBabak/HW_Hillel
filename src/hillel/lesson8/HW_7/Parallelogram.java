package hillel.lesson8.HW_7;

public class Parallelogram extends Quadrilateral {
    double height;

    Parallelogram(double base, double side, double height) {
        super(base, side, base, side);
        this.height = height;
    }

    @Override
    double area() {
        return firstSide * height;
    }
}
