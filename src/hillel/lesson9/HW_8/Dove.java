package hillel.lesson9.HW_8;

public class Dove extends FlyBird implements EatOutOfHand {
    protected Dove(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println(name + " каже бурку-ку");
    }

    @Override
    public void eatOutOfHand() {
        System.out.println(name + " люибить їсти зернятка з рук");
    }
}
