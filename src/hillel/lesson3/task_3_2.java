package hillel.lesson3;

import java.util.Scanner;

public class task_3_2 {
    public static void main(String[] args) {

        double costOfProduct = Double.parseDouble(args[0]);

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much product do you want to buy?");
        double quantityOfProduct = scanner.nextDouble();

        double totalPrice = 0;

        if (quantityOfProduct <= 10) {
            totalPrice = costOfProduct * quantityOfProduct;
        } else if ((quantityOfProduct > 10) && (quantityOfProduct <= 20)) {
            totalPrice = (costOfProduct * quantityOfProduct) - (costOfProduct * quantityOfProduct * 5 / 100);
        } else if ((quantityOfProduct > 20) && (quantityOfProduct <= 30)) {
            totalPrice = (costOfProduct * quantityOfProduct) - (costOfProduct * quantityOfProduct * 10 / 100);
        } else if ((quantityOfProduct > 30) && (quantityOfProduct <= 80)) {
            totalPrice = (costOfProduct * quantityOfProduct) - (((quantityOfProduct - 30) / 10 * 0.4 + 12 ) / 100 * costOfProduct * quantityOfProduct);
        } else if (quantityOfProduct > 80) {
            totalPrice = (costOfProduct * quantityOfProduct) - (costOfProduct * quantityOfProduct * 13 / 100);
        }

        System.out.println("The total price of the products = " + totalPrice);
    }
}
