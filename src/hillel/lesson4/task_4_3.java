package hillel.lesson4;

import java.util.Scanner;

public class task_4_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me please total loan amount ");
        double totalLoanAmount = scanner.nextDouble();

        System.out.println("Give me please monthly interest rate ");
        double monthlyInterestRate = scanner.nextDouble();

        System.out.println("""
                Select the required calculation type\s
                If you want to calculate the number of monthly payments that must be made to fully repay the loan, press number 1\s
                If you want to calculate the monthly payment amount, press number 2""");
        int calculationType = scanner.nextInt();

        if (calculationType == 1) {
            System.out.println("Give me amount of monthly payment");
            double amountOfMonthlyPayment = scanner.nextDouble();

            double numberOfPayments = ((totalLoanAmount - amountOfMonthlyPayment) + ((totalLoanAmount - amountOfMonthlyPayment) * monthlyInterestRate / 100)) / amountOfMonthlyPayment;

            System.out.println(numberOfPayments);
        } else if (calculationType == 2) {
            System.out.println("Give me number of payments");
            int numberOfPayments = scanner.nextInt();

            double amountOfMonthlyPayment = (totalLoanAmount * monthlyInterestRate /100 + totalLoanAmount) / numberOfPayments;

            System.out.println(amountOfMonthlyPayment);

        }
    }

}