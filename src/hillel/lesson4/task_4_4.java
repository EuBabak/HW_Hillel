package hillel.lesson4;

public class task_4_4 {
    public static void main(String[] args) {

        double costOfHour = Double.parseDouble(args[0]);
        double tax = Double.parseDouble(args[1]);

        int workHourPerDay = 8;

        int workdaysIfDaysPerJan = 23;
        int workdaysIfDaysPerFeb = 20;
        int workdaysIfDaysPerMar = 23;
        int workdaysIfDaysPerApr = 22;
        int workdaysIfDaysPerMay = 23;
        int workdaysIfDaysPerJun = 22;
        int workdaysIfDaysPerJul = 23;
        int workdaysIfDaysPerAug = 23;
        int workdaysIfDaysPerSep = 22;
        int workdaysIfDaysPerOct = 23;
        int workdaysIfDaysPerNov = 22;
        int workdaysIfDaysPerDec = 23;

        double salaryPerJanWithoutTax = workdaysIfDaysPerJan * costOfHour * workHourPerDay;
        double salaryPerFebWithoutTax = workdaysIfDaysPerFeb * costOfHour * workHourPerDay;
        double salaryPerMarWithoutTax = workdaysIfDaysPerMar * costOfHour * workHourPerDay;
        double salaryPerAprWithoutTax = workdaysIfDaysPerApr * costOfHour * workHourPerDay;
        double salaryPerMayWithoutTax = workdaysIfDaysPerMay * costOfHour * workHourPerDay;
        double salaryPerJunWithoutTax = workdaysIfDaysPerJun * costOfHour * workHourPerDay;
        double salaryPerJulWithoutTax = workdaysIfDaysPerJul * costOfHour * workHourPerDay;
        double salaryPerAugWithoutTax = workdaysIfDaysPerAug * costOfHour * workHourPerDay;
        double salaryPerSepWithoutTax = workdaysIfDaysPerSep * costOfHour * workHourPerDay;
        double salaryPerOctWithoutTax = workdaysIfDaysPerOct * costOfHour * workHourPerDay;
        double salaryPerNovWithoutTax = workdaysIfDaysPerNov * costOfHour * workHourPerDay;
        double salaryPerDecWithoutTax = workdaysIfDaysPerDec * costOfHour * workHourPerDay;

        double salaryPerJanWithTax = salaryPerJanWithoutTax + salaryPerJanWithoutTax * tax / 100;
        double salaryPerFebWithTax = salaryPerFebWithoutTax + salaryPerFebWithoutTax * tax / 100;
        double salaryPerMarWithTax = salaryPerMarWithoutTax + salaryPerMarWithoutTax * tax / 100;
        double salaryPerAprWithTax = salaryPerAprWithoutTax + salaryPerAprWithoutTax * tax / 100;
        double salaryPerMayWithTax = salaryPerMayWithoutTax + salaryPerMayWithoutTax * tax / 100;
        double salaryPerJunWithTax = salaryPerJunWithoutTax + salaryPerJunWithoutTax * tax / 100;
        double salaryPerJulWithTax = salaryPerJulWithoutTax + salaryPerJulWithoutTax * tax / 100;
        double salaryPerAugWithTax = salaryPerAugWithoutTax + salaryPerAugWithoutTax * tax / 100;
        double salaryPerSepWithTax = salaryPerSepWithoutTax + salaryPerSepWithoutTax * tax / 100;
        double salaryPerOctWithTax = salaryPerOctWithoutTax + salaryPerOctWithoutTax * tax / 100;
        double salaryPerNovWithTax = salaryPerNovWithoutTax + salaryPerNovWithoutTax * tax / 100;
        double salaryPerDecWithTax = salaryPerDecWithoutTax + salaryPerDecWithoutTax * tax / 100;

        double salaryPerYearWithoutTax = salaryPerJanWithoutTax + salaryPerFebWithoutTax + salaryPerMarWithoutTax +
                salaryPerAprWithoutTax + salaryPerMayWithoutTax + salaryPerJunWithoutTax +
                salaryPerJulWithoutTax + salaryPerAugWithoutTax + salaryPerSepWithoutTax +
                salaryPerOctWithoutTax + salaryPerNovWithoutTax + salaryPerDecWithoutTax;

        double salaryPerYearWithTax = salaryPerJanWithTax + salaryPerFebWithTax + salaryPerMarWithTax +
                salaryPerAprWithTax + salaryPerMayWithTax + salaryPerJunWithTax +
                salaryPerJulWithTax + salaryPerAugWithTax + salaryPerSepWithTax +
                salaryPerOctWithTax + salaryPerNovWithTax + salaryPerDecWithTax;

        System.out.println("JAN  " + salaryPerJanWithoutTax + "  " + salaryPerJanWithTax + "\n" +
                        "FEB  " + salaryPerFebWithoutTax + "  " + salaryPerFebWithTax + "\n" +
                        "MAR  " + salaryPerMarWithoutTax + "  " + salaryPerMarWithTax + "\n" +
                        "APR  " + salaryPerAprWithoutTax + "  " + salaryPerAprWithTax + "\n" +
                        "MAY  " + salaryPerMayWithoutTax + "  " + salaryPerMayWithTax + "\n" +
                        "JUN  " + salaryPerJunWithoutTax + "  " + salaryPerJunWithTax + "\n" +
                        "JUL  " + salaryPerJulWithoutTax + "  " + salaryPerJulWithTax + "\n" +
                        "AUG  " + salaryPerAugWithoutTax + "  " + salaryPerAugWithTax + "\n" +
                        "SEP  " + salaryPerSepWithoutTax + "  " + salaryPerSepWithTax + "\n" +
                        "OCT  " + salaryPerOctWithoutTax + "  " + salaryPerOctWithTax + "\n" +
                        "NOV  " + salaryPerNovWithoutTax + "  " + salaryPerNovWithTax + "\n" +
                        "DEC  " + salaryPerDecWithoutTax + "  " + salaryPerDecWithTax + "\n" +
                "\n" +
                "Salary per year without tax: " + salaryPerYearWithoutTax + "\n" +
                "Salary per year with tax:    " + salaryPerYearWithTax
                );
    }
}
