package hillel.lesson9.HW_8;

public class Stork extends FlyBird {
    protected Stork(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println(name + " каже клац-клац");
    }
}
