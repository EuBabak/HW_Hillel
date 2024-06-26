package hillel.lesson9.HW_8;

public class Barge extends Vehicles implements Movable, Swimable, Engine {
    protected Barge(String name) {
        super(name);
    }

    @Override
    void transport() {
        System.out.println(name + " перевозить вантажі і людей");
    }

    @Override
    public void engine() {
        System.out.println(name + " має 2 двигуни");
    }

    @Override
    public void move() {
        System.out.println(name + " переміщається від одного берега до іншого");
    }

    @Override
    public void swim() {
        System.out.println(name + " плаває по воді");
    }
}
