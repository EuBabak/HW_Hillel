package hillel.lesson9.HW_8;

public class Kiwi extends LandBird{
    protected Kiwi(String name) {
        super(name);
    }
    @Override
    void voice() {
        System.out.println(name + " каже ківі-ківі");
    }
}
