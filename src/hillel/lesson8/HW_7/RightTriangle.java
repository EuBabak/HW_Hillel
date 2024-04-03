package hillel.lesson8.HW_7;

public class RightTriangle extends Triangle {
    RightTriangle(double firstSide, double secondSide) {
        super(firstSide, secondSide, Math.sqrt(firstSide * firstSide + secondSide * secondSide));
    }

    @Override
    double area() {
        return 0.5 * firstSide * secondSide;
    }
}
