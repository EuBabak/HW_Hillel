package hillel.lesson2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int workWeeksPerMonth = 4;
        int workMonthPerYear = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me please work hours per week");
        double workHoursPerWeek = scanner.nextDouble();

        System.out.println("Give me please salary per year with tax");
        double salaryPerYearWithTax = scanner.nextDouble();

        System.out.println("Give me please tax");
        double tax = scanner.nextDouble();

        double salaryPerMonthWithTax = salaryPerYearWithTax / workMonthPerYear;
        double salaryPerMonthWithoutTax = salaryPerMonthWithTax / ( 1 + tax / 100 );
        double costPerHourWithoutTax = salaryPerMonthWithoutTax / workWeeksPerMonth / workHoursPerWeek;


        System.out.println("At " + workHoursPerWeek + " work hours per week with annual salary with tax of " + salaryPerYearWithTax + " and tax of " + tax + " %, hour of time costs " + costPerHourWithoutTax);






    }
}
