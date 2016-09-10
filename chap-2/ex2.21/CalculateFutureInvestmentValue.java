/* Write a program that reads in investment amount, annual interest rate, and
number of years, and dis- plays the future investment value using the following
formula:

futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12

For example, if you enter amount 1000, annual interest rate 3.25%, and number of
years 1, the future investment value is 1032.98.
*/

import java.util.Scanner;

public class CalculateFutureInvestmentValue {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter investment amount: ");
    double investmentAmount = input.nextDouble();
    System.out.print("Enter annual interest rate in percentage: ");
    double monthlyInterestRate = input.nextDouble() / 100 / 12;
    System.out.print("Enter number of years: ");
    double numberOfYears = input.nextDouble();
    double duration = numberOfYears * 12;
    
    double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), duration);
    System.out.println("Accumulated value is " + futureInvestmentValue);
  }
}