package hillel.lesson3;

import java.util.Scanner;

public class task_3_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Give me a number, please");
        int number = scanner.nextInt();

        String evenOrOdd;
        if (number%2 ==0) {
            evenOrOdd = "even";
        }
        else {
            evenOrOdd = "odd";
        }

        String positiveOrNegative = "The number is not positive or negative it`s just a 0";
        if (number > 0 ) {
            positiveOrNegative = "positive";
        }
        else if (number < 0) {
            positiveOrNegative = "negative";
        }

        String primeOrComposite = number > 0 ? "prime" : "composite";
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                primeOrComposite = "composite";
                break;
            }
        }

        System.out.println("The number is: \n" +
                evenOrOdd + "\n" +
                positiveOrNegative + "\n" +
                primeOrComposite);
    }
}
