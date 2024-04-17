package hillel.lesson9.HW_8;

public class Boat extends Vehicles implements Movable, Swimable {
    protected Boat(String name) {
        super(name);
    }

    @Override
    void transport() {
        System.out.println(name + " перевозить людей");
    }

       @Override
    public void move() {
        System.out.println(name + " переміщається біля берега");
    }

    @Override
    public void swim() {
        System.out.println(name + " плаває по річці");
    }
}
