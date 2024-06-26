package hillel.lesson9.HW_8;

public class Bus extends Vehicles implements Movable,MoveOnTheGround,Engine {
    protected Bus(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " переміщається з точки А в точку В");
    }

    @Override
    public void moveOnTheGround() {
        System.out.println(name + " їде по дорозі");
    }

    @Override
    void transport() {
        System.out.println(name + " переводить людей");
    }

    @Override
    public void engine() {
        System.out.println(name + " заводить двигун");
    }
}
