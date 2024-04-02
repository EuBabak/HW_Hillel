package hillel.lesson7.HW_6;

public class Credit {
    private String borrowName;
    private double amount;
    private double interestRate;
    private int durationMonth;

    public Credit(String borrowName, double amount, double interestRate, int durationMonth) {
        this.borrowName = borrowName;
        this.amount = amount;
        this.interestRate = interestRate;
        this.durationMonth = durationMonth;
    }

    public double calculateTotalAmount() {
        return amount * (1 + interestRate / 100);
    }
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = interestRate / 100 / 12;
        return (amount * monthlyInterestRate) / (1 - Math.pow (1 + monthlyInterestRate, -durationMonth));
    }
    public String getBorrowName() {
        return borrowName;
    }
    public double getAmount() {
        return amount;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public int getDurationMonth() {
        return durationMonth;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setDurationMonth(int durationMonth) {
        this.durationMonth = durationMonth;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
