package hillel.lesson2.HW_2;

public class task2 {
    public static void main(String[] args) {
        int workHoursPerWeek = Integer.parseInt(args[0]);
        int workWeeksPerMonth = 4;
        int workMonthPerYear = 12;
        double costPerHour = Double.parseDouble(args[1]);
        double tax = Double.parseDouble(args[2]);

        double salaryPerMonthWithoutTax = workHoursPerWeek * workWeeksPerMonth * costPerHour;

        double salaryPerMonthWithTax = salaryPerMonthWithoutTax + salaryPerMonthWithoutTax * tax / 100;

        double salaryPerYearWithoutTax = salaryPerMonthWithoutTax * workMonthPerYear;

        double salaryPerYearWithTax = salaryPerMonthWithTax * workMonthPerYear;

        System.out.println("Salary per month without tax: " + salaryPerMonthWithoutTax);
        System.out.println("Salary per month with tax: " + salaryPerMonthWithTax);
        System.out.println("Salary per year without tax: " + salaryPerYearWithoutTax);
        System.out.println("Salary per year with tax: " + salaryPerYearWithTax);

    }
}