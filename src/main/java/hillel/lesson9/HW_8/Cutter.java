package hillel.lesson9.HW_8;

public class Cutter extends Vehicles implements Movable, Swimable, Engine {
    protected Cutter(String name) {
        super(name);
    }

    @Override
    void transport() {
        System.out.println(name + " перевозить вантажі і людей");
    }

    @Override
    public void engine() {
        System.out.println(name + " має маленький двигун");
    }

    @Override
    public void move() {
        System.out.println(name + " переміщається до берега");
    }

    @Override
    public void swim() {
        System.out.println(name + " плаває по морю");
    }
}
