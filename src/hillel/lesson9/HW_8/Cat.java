package hillel.lesson9.HW_8;

public class Cat extends Pets {
    protected Cat(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println(name + " каже мяу-мяу");
    }

    @Override
    public void run() {
        System.out.println(name + " бігає мов кошеня");
    }

    @Override
    public void move() {
        System.out.println(name + " переміщається хаотично: то вперед, то вбік");
    }

    @Override
    public void eatOutOfHand() {
        System.out.println(name + " любить їсти з рук");
    }
}
