package hillel.lesson9.HW_8;

abstract class LandBird extends Bird implements MoveOnTheGround {
    protected LandBird(String name) {
        super(name);
    }
    public void moveOnTheGround() {
        System.out.println(name + " переміщається по землі");
    }


}
