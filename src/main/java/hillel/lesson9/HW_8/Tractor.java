package hillel.lesson9.HW_8;

public class Tractor extends Vehicles implements Movable,MoveOnTheGround,Engine {
    protected Tractor(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " переміщається з автобази до поля");
    }

    @Override
    public void moveOnTheGround() {
        System.out.println(name + " їде по полю");
    }

    @Override
    void transport() {
        System.out.println(name + " культивує поле");
    }

    @Override
    public void engine() {
        System.out.println(name + " заводить гучний двигун");
    }
}
