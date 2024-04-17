package hillel.lesson9.HW_8;

public class Car extends Vehicles implements Movable,MoveOnTheGround,Engine {
    protected Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " переміщається з точки А в точку В");
    }

    @Override
    public void moveOnTheGround() {
        System.out.println(name + " їде по автобану");
    }

    @Override
    void transport() {
        System.out.println(name + " переводить людей і вантажі");
    }

    @Override
    public void engine() {
        System.out.println(name + " заводить двигун");
    }
}
