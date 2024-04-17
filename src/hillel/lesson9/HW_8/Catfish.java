package hillel.lesson9.HW_8;

public class Catfish extends Fish {
    public Catfish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " плаває мов сом");
    }
    @Override
    public void move() {
        System.out.println(name + " переміщається, куди хоче");
    }
}
