package hillel.lesson6;

public class Main {
    public static void main(String[] args) {

//       Dog firstDog; - створили змінну
//       new Dog(); - створили instance (екземпляр Класу), Об'єкт в Heap, створили конкретний інстанс, собачка народилась
//       firstDog = new Dog(); - присвоєння ім'я

        Dog firstDog = new Dog("Sharik", "Pitbul");
        Dog secondDog = new Dog("Tuzik", "Dvorterierr");

        Food pedigree = new Food();
        pedigree.foodName = "Pedigree";

        Food meet = new Food();
        meet.foodName = "Meet";

        firstDog.voice();
        firstDog.eat(pedigree);

        secondDog.voice();
        secondDog.eat(pedigree);


//      приклади модифікаторів доступу
        Food food = new Food();



    }
}
