package hillel.lesson8.HW_7;

public class Square extends Quadrilateral {
    Square(double side) {
        super(side, side, side,side);
    }

    @Override
    double area() {
        return firstSide * firstSide;
    }
}
