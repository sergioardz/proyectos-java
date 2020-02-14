public class P3S2 {
    static double balance = 320000;
    static double annualInterestRate = 0.2;
    static double monthlyInterestRate = annualInterestRate / 12;

    public static double lowerSide(double b) {
        return b / 12;
    }

    public static double upperSide(double b) {
        return (b * Math.pow((1 + monthlyInterestRate), 12)) / 12;
    }

    public static void main(String[] args) {
        double aux = balance;
        double minMonthly = lowerSide(balance);
        while (aux >= 0.01) {
            aux = balance;
            for (int i = 1; i < 13; i++) {
                aux -= minMonthly;
                aux *= 1 + (annualInterestRate / 12);
            }
            if (aux >= 0) {
                minMonthly = minMonthly + lowerSide(Math.abs(aux));
            } else {
                minMonthly = minMonthly - upperSide(Math.abs(aux));
                aux = Math.abs(aux);
            }
        }
        double roundedminMonthly = Math.round(minMonthly * 100) / 100.0;
        System.out.println("Lowest payment: " + roundedminMonthly);
    }
}