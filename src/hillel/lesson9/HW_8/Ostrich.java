package hillel.lesson9.HW_8;

public class Ostrich extends LandBird implements Runnable{
    protected Ostrich(String name) {
        super(name);
    }
    @Override
    void voice() {
        System.out.println(name + " каже уак-уак");
    }

    @Override
    public void run() {
        System.out.println(name + " бігає дуже швидко");
    }
}
