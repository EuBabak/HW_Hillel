package hillel.lesson9.HW_8;

public class Duck extends LandBird implements Flyable, Swimable{
    protected Duck(String name) {
        super(name);
    }
    @Override
    void voice() {
        System.out.println(name + " каже кря-кря");
    }

    @Override
    public void fly() {
        System.out.println(name + " дуже любить літати");
    }

    @Override
    public void swim() {
        System.out.println(name + " дуже любить плавати");
    }
}
