package hillel.lesson9.HW_8;

abstract class Vehicles {
    protected String name;

    abstract void transport();

    protected Vehicles(String name) {
        this.name = name;
    }
    protected void display() {
        System.out.println("Це - " + name);
    }
}
