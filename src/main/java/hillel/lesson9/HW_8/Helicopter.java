package hillel.lesson9.HW_8;

public class Helicopter extends Vehicles implements Flyable, Movable, Engine {
    protected Helicopter(String name) {
        super(name);
    }

    @Override
    void transport() {
        System.out.println(name + " перевозить середньої важкості вантажі");
    }

    @Override
    public void fly() {
        System.out.println(name + " літає вверх і в різні боки");
    }

    @Override
    public void move() {
        System.out.println(name + " переміщається без злітної смуги");
    }

    @Override
    public void engine() {
        System.out.println(name + " має один двигун");
    }
}
