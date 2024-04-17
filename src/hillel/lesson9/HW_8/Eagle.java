package hillel.lesson9.HW_8;

public class Eagle extends FlyBird {
    protected Eagle(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println(name + " каже ор-ор");
    }

}
