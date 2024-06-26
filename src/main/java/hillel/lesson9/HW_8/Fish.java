package hillel.lesson9.HW_8;

abstract class Fish extends Animal implements Swimable, Movable {

    protected Fish(String name) {
        super(name);
    }

    @Override
    protected void voice() {
        System.out.println(name + " каже бульк");
    }


}
