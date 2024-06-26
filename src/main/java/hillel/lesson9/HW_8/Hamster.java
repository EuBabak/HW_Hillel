package hillel.lesson9.HW_8;

public class Hamster extends Pets {
    protected Hamster(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println(name + " каже хрум");
    }

    @Override
    public void run() {
        System.out.println(name + " бігає мов хом'як");
    }

    @Override
    public void move() {
        System.out.println(name + " переміщається вперед підстрибуючи");
    }

    @Override
    public void eatOutOfHand() {
        System.out.println(name + " любить їсти з господаря");
    }
}
