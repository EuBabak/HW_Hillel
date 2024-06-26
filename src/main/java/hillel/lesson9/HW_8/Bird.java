package hillel.lesson9.HW_8;

abstract class Bird extends Animal implements Movable {

    protected Bird(String name) {
        super(name);
    }
    public void move() {
        System.out.println(name + " переміщається з точки А в точку В ");
    }
}
