/*
Problem 1 - Paying Debt off in a Year 10.0/10.0 points (graded) Write a program to calculate the credit card balance after one year if a person only pays the minimum monthly payment required by the credit card company each month.

The following variables contain values as described below:
    balance - the outstanding balance on the credit card
    annualInterestRate - annual interest rate as a decimal
    monthlyPaymentRate - minimum monthly payment rate as a decimal

For each month, calculate statements on the monthly payment and remaining balance. At the end of 12 months, print out the remaining balance. Be sure to print out no more than two decimal digits of accuracy.
*/

public class P1S2 {
    public static void main(String[] args) {
        // Define and set initial variables
        double balance = 42;
        double annualInterestRate = 0.2;
        double monthlyPaymentRate = 0.04;
        // Iterate through 12 months and calculate current balance with the given conditions
        for (int i = 1; i < 13; i++) {
            double minMonthly = monthlyPaymentRate * balance;
            balance -= minMonthly;
            balance *= 1 + (annualInterestRate/12);
        }
        // Round and print the current balance at the end of the year as the answer
        double roundedBalance = Math.round(balance * 100) / 100.0;
        System.out.println("Remaining balance: " + roundedBalance);
    }
}