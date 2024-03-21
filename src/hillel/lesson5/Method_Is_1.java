package hillel.lesson5;

import java.util.Scanner;

public class Method_Is_1 {
    public static void main(String[] args) {

        System.out.println(sum(5,7,5,9,2,7,3));

        int firstNumber = getNumberFromUserInput();
        int secondNumber = getNumberFromUserInput();
        System.out.println(sum(firstNumber, secondNumber));


    }


/*        returnType nameMethod(typeArg1 nameArg1, typeArg2 nameArg2...) { }
                local variables; визначення локальних змін, може бути декілька (може не бути)
                business logic; розрахунок (обов'язково є)
                return; повертає результат (може не бути)

*/
    public static int sum(int firstNumber, int secondNumber) {
//        int result = 0;
//        result = firstNumber + secondNumber;
//        return result;
        return firstNumber + secondNumber;
    }


//    якщо void нічого не буде повертати
    void nameMethod(int arg) {
        if (arg < 0) {
            return;
        }
        System.out.println();
    }

//    Метод сканер

    static int getNumberFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int s = scanner.nextInt();
        return s;
    }

//      variable args - метод останньої надії
    public static int sum(int firstNumber, int... otherNumbers) {
        int result = firstNumber;
        for (int n : otherNumbers) {
            result += n;
        }
        return result;
    }

    public static int sum1(int firstNumber, int... otherNumbers) {
        int result = firstNumber;
        for (int n : otherNumbers) {
            result = sum(result, n);
        }
        return result;
    }

    public static int sum(int firstNumber, int secondNumber, int thirdNumber) {
        return 10;
    }

    public static int sum1(int firstNumber, int secondNumber, int thirdNumber) {
        return sum(firstNumber, sum(secondNumber, thirdNumber));
    }

    public static int sum(String firstNumber, int secondNumber) {
        return 20;
    }

    public static int sum1(String firstNumber, int secondNumber) {
        return sum(Integer.parseInt(firstNumber), secondNumber);
    }

    public static int sum(int firstNumber, String secondNumber) {
        return 30;
    }

    public static int sum1(int firstNumber, String secondNumber) {
        return sum(Integer.parseInt(secondNumber), firstNumber);
    }




}
