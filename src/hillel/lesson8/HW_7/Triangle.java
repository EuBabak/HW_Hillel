package hillel.lesson8.HW_7;

abstract class Triangle extends Shape {
    double firstSide;
    double secondSide;
    double thirdSide;

    Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
}
