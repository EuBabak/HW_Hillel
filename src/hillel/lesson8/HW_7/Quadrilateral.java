package hillel.lesson8.HW_7;

abstract class Quadrilateral extends Shape {
    double firstSide;
    double secondSide;
    double thirdSide;
    double fourthSide;

    Quadrilateral(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
    }
}
