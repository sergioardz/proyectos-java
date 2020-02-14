public class P2S2 {
    public static void main(String[] args) {
        double balance = 3329;
        double annualInterestRate = 0.2;
        double aux = balance;
        int minMonthly = 0;
        while (aux >= 0) {
            aux = balance;
            minMonthly += 10;
            for (int i = 1; i < 13; i++) {
                aux -= minMonthly;
                aux *= 1 + (annualInterestRate/12);
            }
        }
        System.out.println("Lowest payment: " + minMonthly);
    }
}