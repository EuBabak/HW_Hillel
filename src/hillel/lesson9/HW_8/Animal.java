package hillel.lesson9.HW_8;

abstract class Animal {
    protected String name;

    abstract void voice();

    protected Animal(String name) {
        this.name = name;
    }
    protected void display() {
        System.out.println("Це - " + name);
    }



}
