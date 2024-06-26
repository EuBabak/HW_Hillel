package hillel.lesson5;

public class training_5_1 {
    public static void main(String[] args) {

//        "" - Якщо перший тип даних рядок, то всі інщі типи автоматично будуть приводитись так само до рядка, а не складатись!
//        System.out.println("" + i + j);

////        Намалювати квадрат:
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.print(String.valueOf(i) + j + " ");
//            }
//            System.out.println();
//        }

//        Намалювати трикутник з ліва прямий кут:
//        break; - зупиняє повністю цикл

//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.print(String.valueOf(i) + j + " ");
//                if (i == j) {
//                    break;
//                }
//            }
//            System.out.println();
//        }


//        continue; - переходить до наступної ітерації
//        Як тільки знаходить переходить до наступної ітерації

//       Намалювати лінію:
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (i != j) {
//                    System.out.print(" ");
//                    continue;
//                }
//                System.out.print(String.valueOf(i) + j + " ");
//            }
//            System.out.println();
//        }

////        Список чисел
//        for (int i = 0; i < 9; i++) {
//            System.out.println(i);
//        }

//        Список парних чисел
        for (int i = 0; i < 9; i+=2) {
            System.out.println(i);
        }

//        Список парних чисел (кількість ітерацій в 2 рази більше)
//        i%2 - залишок ділення на 2,
//        i%3 - залишок ділення на 3,
        for (int i = 0; i < 9; i++) {
            if (i%2 !=0) {
                continue;
            }
            System.out.println(i);
        }



    }

}
