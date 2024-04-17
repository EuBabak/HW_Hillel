package hillel.lesson9.HW_8;

public class Penguin extends LandBird implements Swimable {

    protected Penguin(String name) {
        super(name);
    }
    @Override
    void voice() {
        System.out.println(name + " каже піу-піу");
    }

    @Override
    public void swim() {
        System.out.println(name + " дуже любить плавати в холодній воді");
    }
}
