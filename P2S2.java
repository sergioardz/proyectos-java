/*
Problem 2 - Paying Debt Off in a Year 15.0/15.0 points (graded) Now write a program that calculates the minimum fixed monthly payment needed in order pay off a credit card balance within 12 months. By a fixed monthly payment, we mean a single number which does not change each month, but instead is a constant amount that will be paid each month.

In this problem, we will not be dealing with a minimum monthly payment rate.
The following variables contain values as described below:
    balance - the outstanding balance on the credit card
    annualInterestRate - annual interest rate as a decimal

The program should print out one line: the lowest monthly payment that will pay off all debt in under 1 year, for example:

Lowest Payment: 180 Assume that the interest is compounded monthly according to the balance at the end of the month (after the payment for that month is made). The monthly payment must be a multiple of $10 and is the same for all months. Notice that it is possible for the balance to become negative using this payment scheme, which is okay. A summary of the required math is found below:

Monthly interest rate = (Annual interest rate) / 12.0 Monthly unpaid balance = (Previous balance) - (Minimum fixed monthly payment) Updated balance each month = (Monthly unpaid balance) + (Monthly interest rate x Monthly unpaid balance)
*/

public class P2S2 {
    public static void main(String[] args) {
        // Define and set initial variables
        double balance = 3329;
        double annualInterestRate = 0.2;
        double aux = balance;
        int minMonthly = 0;
        // Iterate until the balance becomes 0 or less, set aux as balance and increment minMonthly by 10 on each iteration
        while (aux >= 0) {
            aux = balance;
            minMonthly += 10;
            // Iterate through 12 months and calculate current balance with the given conditions
            for (int i = 1; i < 13; i++) {
                aux -= minMonthly;
                aux *= 1 + (annualInterestRate/12);
            }
        }
        // Once the while condition is no longer met, print minMonthly as the answer
        System.out.println("Lowest payment: " + minMonthly);
    }
}