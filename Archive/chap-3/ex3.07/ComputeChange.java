/* Modify Listing 2.10, ComputeChange .java, to display the nonzero
denominations only, using singular words for single units such as 1 dollar and 1
penny, and plural words for more than one unit such as 2 dollars and 3 pennies.
*/

import java.util.Scanner;

public class ComputeChange {
  public static void main(String[] args) {   
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount 
    System.out.print(
      "Enter an amount in double, for example 11.56: ");
    double amount = input.nextDouble();

    int remainingAmount = (int)(amount * 100);

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    // Display results
    System.out.println("Your amount " + amount + " consists of"); 
    if (numberOfOneDollars != 0) {
      if (numberOfOneDollars == 1) {
        System.out.println("    " + numberOfOneDollars + " dollar");
      } else {
        System.out.println("    " + numberOfOneDollars + " dollars");
      }
    }
    if (numberOfQuarters != 0) {
      if (numberOfQuarters == 1) {
        System.out.println("    " + numberOfQuarters + " quarter ");
      } else {
        System.out.println("    " + numberOfQuarters + " quarters ");
      }
    }
    if (numberOfDimes != 0) {
      if (numberOfDimes == 1) {
        System.out.println("    " + numberOfDimes + " dime"); 
      } else {
        System.out.println("    " + numberOfDimes + " dimes"); 
      }
    }
    if (numberOfNickels != 0) {
      if (numberOfNickels == 1) {
        System.out.println("    " + numberOfNickels + " nickel");
      } else {
        System.out.println("    " + numberOfNickels + " nickels");
      }
    }
    if (numberOfPennies != 0) {
      if (numberOfPennies == 1) {
        System.out.println("    " + numberOfPennies + " penny");
      } else {
        System.out.println("    " + numberOfPennies + " pennies");
      }
    }
  }
}
