package hillel.lesson9.HW_8;

public class Main {
    public static void main(String[] args) {

        Pike pike = new Pike("Щука");
        pike.display();
        pike.swim();
        pike.voice();
        pike.move();

        Crucian crucian = new Crucian("Карась");
        crucian.display();
        crucian.swim();
        crucian.voice();
        crucian.move();

        Catfish catfish = new Catfish("Сом");
        catfish.display();
        catfish.swim();
        catfish.voice();
        catfish.move();

        Cat cat = new Cat("Мурчік");
        cat.display();
        cat.run();
        cat.voice();
        cat.move();
        cat.eatOutOfHand();
    }
}
