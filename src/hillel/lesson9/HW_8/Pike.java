package hillel.lesson9.HW_8;

class Pike extends Fish {

    protected Pike(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " плаває мов щука");
    }
    @Override
    public void move() {
        System.out.println(name + " переміщається, в різні точки");
    }

}
