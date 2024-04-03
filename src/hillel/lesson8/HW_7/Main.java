package hillel.lesson8.HW_7;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        RightTriangle rightTriangle = new RightTriangle(4,5);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(5,6);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(6);
        Square square = new Square(7);
        Rectangle rectangle = new Rectangle(3, 4);
        Parallelogram parallelogram = new Parallelogram(3,4,2);
        Trapezoid trapezoid = new Trapezoid(3,5,4,6);
        Rhombus rhombus = new Rhombus(3,5);

        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of right triangle: " + rightTriangle.area());
        System.out.println("Area of isosceles triangle: " + isoscelesTriangle.area());
        System.out.println("Area of equilateral triangle: " + equilateralTriangle.area());
        System.out.println("Area of square: " + square.area());
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of parallelogram: " + parallelogram.area());
        System.out.println("Area of trapezoid: " + trapezoid.area());
        System.out.println("Area of rhombus: " + rhombus.area());
    }
}
