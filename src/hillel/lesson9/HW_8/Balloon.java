package hillel.lesson9.HW_8;

public class Balloon extends Vehicles implements Flyable,Movable{
    protected Balloon(String name) {
        super(name);
    }

    @Override
    void transport() {
        System.out.println(name + " перевозить людей");
    }

    @Override
    public void fly() {
        System.out.println(name + " літає дуже повільно");
    }

    @Override
    public void move() {
        System.out.println(name + " переміщається куди вітер подує");
    }
}
