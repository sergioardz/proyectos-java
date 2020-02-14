public class P1S2 {
    public static void main(String[] args) {
        double balance = 42;
        double annualInterestRate = 0.2;
        double monthlyPaymentRate = 0.04;
        for (int i = 1; i < 13; i++) {
            double minMonthly = monthlyPaymentRate * balance;
            balance -= minMonthly;
            balance *= 1 + (annualInterestRate/12);
        }
        double roundedBalance = Math.round(balance * 100) / 100.0;
        System.out.println("Remaining balance: " + roundedBalance);
    }
}