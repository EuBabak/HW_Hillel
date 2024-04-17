package hillel.lesson9.HW_8;

public class Crucian extends Fish {

    public Crucian(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(name + " плаває мов карась");
    }
    @Override
    public void move() {
        System.out.println(name + " переміщається, куди хоче");
    }
}
