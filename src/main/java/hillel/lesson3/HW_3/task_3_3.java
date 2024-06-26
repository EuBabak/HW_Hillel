package hillel.lesson3.HW_3;

public class task_3_3 {
    public static void main(String[] args) {

        int monthNumber = Integer.parseInt(args[0]);
        double costOfHour = Double.parseDouble(args[1]);
        double tax = Double.parseDouble(args[2]);

        int workHourPerDay = 8;

        int workdaysIfDaysPerMonth_28 = 20;
        int workdaysIfDaysPerMonth_30 = 22;
        int workdaysIfDaysPerMonth_31 = 23;

        boolean incorrectNumberOfMonths = monthNumber > 12;
        if (incorrectNumberOfMonths) {
            System.out.println("WARNING!!! " + monthNumber + "-th month is non-existent month. The month number cannot be greater than 12. \n" +
                    "It is not possible to calculate the salary per month!");
        }

        double salaryPerMonthWithoutTax = 0;

        if (monthNumber == 2 ) {
            salaryPerMonthWithoutTax = workdaysIfDaysPerMonth_28 * costOfHour  * workHourPerDay;
        } else if ((monthNumber == 4) || (monthNumber == 6) || (monthNumber == 9) || (monthNumber == 11)) {
            salaryPerMonthWithoutTax = workdaysIfDaysPerMonth_30 * costOfHour  * workHourPerDay;
        } else if ((monthNumber == 1) || (monthNumber == 3) || (monthNumber == 5) || (monthNumber == 7) ||
                (monthNumber == 8) || (monthNumber == 10) || (monthNumber == 12)) {
            salaryPerMonthWithoutTax = workdaysIfDaysPerMonth_31 * costOfHour  * workHourPerDay;
        }

        double salaryPerMonthWithTax = salaryPerMonthWithoutTax + salaryPerMonthWithoutTax * tax /100;

        System.out.println("Salary per " + monthNumber + "-th month without tax = " + salaryPerMonthWithoutTax);
        System.out.println("Salary per " + monthNumber + "-th month with tax = " + salaryPerMonthWithTax);
    }
}
