package hillel.lesson9.HW_8;

abstract class FlyBird extends Bird implements Flyable {
    protected FlyBird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " літає в небі");
    }
}
