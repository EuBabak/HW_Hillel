package hillel.lesson9.HW_8;

public class Plane extends Vehicles implements Flyable, Movable, Engine {
    protected Plane(String name) {
        super(name);
    }

    @Override
    void transport() {
        System.out.println(name + " перевозить важкі вантажі");
    }

    @Override
    public void fly() {
        System.out.println(name + " літає дуже швидко");
    }

    @Override
    public void move() {
        System.out.println(name + " переміщається з одного міста в інше");
    }

    @Override
    public void engine() {
        System.out.println(name + " має 2 двигуна");
    }
}
