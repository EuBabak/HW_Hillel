package hillel.lesson8.HW_7;

public class IsoscelesTriangle extends Triangle {
    IsoscelesTriangle(double base, double side) {
        super(base, side, side);
    }

    @Override
    double area() {
        double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) *
                (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
    }
}
