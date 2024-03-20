package hillel.lesson4;

public class training_4_1 {
    public static void main(String[] args) {

//        Для примітивів масив буде заповнений нулями
//        int[] numbers = new int[args.length];





//        while (condition)    - > for (   ;condition;   )
//        while перевіряє умову, а потім виконує
 //       while приймає тільки - (boolean Type), має бути якесь condition
//        Цикл виконується доки, виконується умова, яку ми прописали в душках
        int k = 0;
        while(k < 7) {
            System.out.println("k = " + k);
            k++;
        }
        System.out.println(k);

//      для нескінченного циклу обов'язково потрібен - break
        int i = 0;
        while(true) {
            System.out.println("i = " + k);
            i++;
            if (i == 7) {
                break;
            }
        }


//        виконує, а потім перевіряє умову (чи треба йти на наступну ітерацію?)
//        як мінімум один раз пройде
        do {
            System.out.println("One time");
        } while (k < 7);


//        System.out.println("Total loan amount " + totalLoanAmount + ", monthly interest rate " +
//                monthlyInterestRate +"%. If the user paid " +
//                amountOfMonthlyPayment + "during the first month, then in the second month the loan balance will be added");

//            double amountOfMonthlyPayment = ((1 - (totalLoanAmount * monthlyInterestRate / 100)) + (monthlyInterestRate /100))/numberOfPayments;

//            double numberOfPayments = (1 - (totalLoanAmount * monthlyInterestRate / 100)) + (monthlyInterestRate /100);



    }
}
