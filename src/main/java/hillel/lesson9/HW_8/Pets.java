package hillel.lesson9.HW_8;

abstract class Pets extends Animal implements Runnable, Movable, EatOutOfHand, MoveOnTheGround {
    protected Pets(String name) {
        super(name);
    }
    public void moveOnTheGround() {
        System.out.println(name + " переміщається по землі");
    }
}
