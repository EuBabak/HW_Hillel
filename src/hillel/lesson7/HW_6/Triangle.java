package hillel.lesson7.HW_6;

public class Triangle {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public int getFirstSide() {
        return firstSide;
    }
    public int getSecondSide() {
        return secondSide;
    }
    public int getThirdSide() {
        return thirdSide;
    }

    public int calculatePerimeter(int firstSide, int secondSide, int thirdSide) {
        return firstSide + secondSide + thirdSide;
    }

    public int calculateArea(int firstSide, int secondSide, int thirdSide) {
        int halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
        int area = (int) Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        return area;
    }
}
