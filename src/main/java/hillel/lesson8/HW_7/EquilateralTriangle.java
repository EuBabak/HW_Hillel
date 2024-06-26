package hillel.lesson8.HW_7;

public class EquilateralTriangle extends Triangle {
    EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    double area() {
        return (Math.sqrt(3) / 4) * firstSide * firstSide;
    }
}
