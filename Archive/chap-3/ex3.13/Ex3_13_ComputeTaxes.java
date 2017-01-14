/* 3.13 (Financial application: compute taxes) Listing 3.5, ComputeTax.java, gives the source code to compute taxes for
 * single filers. Complete Listing 3.5 to compute the taxes for all filing statuses.
 */

package chap_3;

import java.util.Scanner;

public class Ex3_13_ComputeTaxes {
  public static void main(String[] args) {
    final int single10Max = 8350, single15Max = 33950, single25Max = 82250, single28Max = 171550, single33Max = 372950,
        joint10Max = 16700, joint15Max = 67900, joint25Max = 137050, joint28Max = 208850, joint33Max = 372950,
        separate10Max = 8350, separate15Max = 33950, separate25Max = 68525, separate28Max = 104425,
        separate33Max = 186475, head10Max = 11950, head15Max = 45500, head25Max = 117450, head28Max = 190200,
        head33Max = 372950;

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter filing status
    System.out.print("(0-single filer, 1-married jointly or " + "qualifying widow(er), 2-married separately, 3-head of "
        + "household) Enter the filing status: ");
    int status = input.nextInt();

    // Prompt the user to enter taxable income
    System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();

    // Compute tax
    double tax = 0;

    if (status == 0) { // Compute tax for single filers
      if (income <= single10Max)
        tax = income * 0.10;
      else if (income <= single15Max)
        tax = single10Max * 0.10 + (income - single10Max) * 0.15;
      else if (income <= single25Max)
        tax = single10Max * 0.10 + (single15Max - single10Max) * 0.15 + (income - single15Max) * 0.25;
      else if (income <= single28Max)
        tax = single10Max * 0.10 + (single15Max - single10Max) * 0.15 + (single25Max - single15Max) * 0.25
            + (income - single25Max) * 0.28;
      else if (income <= single33Max)
        tax = single10Max * 0.10 + (single15Max - single10Max) * 0.15 + (single25Max - single15Max) * 0.25
            + (single28Max - single25Max) * 0.28 + (income - single28Max) * 0.33;
      else
        tax = single10Max * 0.10 + (single15Max - single10Max) * 0.15 + (single25Max - single15Max) * 0.25
            + (single28Max - single25Max) * 0.28 + (single33Max - single28Max) * 0.33 + (income - single33Max) * 0.35;
    } else if (status == 1) { // Compute tax for married file jointly
      // Left as exercise
      if (income <= joint10Max)
        tax = income * 0.10;
      else if (income <= joint15Max)
        tax = joint10Max * 0.10 + (income - joint10Max) * 0.15;
      else if (income <= joint25Max)
        tax = joint10Max * 0.10 + (joint15Max - joint10Max) * 0.15 + (income - joint15Max) * 0.25;
      else if (income <= joint28Max)
        tax = joint10Max * 0.10 + (joint15Max - joint10Max) * 0.15 + (joint25Max - joint15Max) * 0.25
            + (income - joint25Max) * 0.28;
      else if (income <= joint33Max)
        tax = joint10Max * 0.10 + (joint15Max - joint10Max) * 0.15 + (joint25Max - joint15Max) * 0.25
            + (joint28Max - joint25Max) * 0.28 + (income - joint28Max) * 0.33;
      else
        tax = joint10Max * 0.10 + (joint15Max - joint10Max) * 0.15 + (joint25Max - joint15Max) * 0.25
            + (joint28Max - joint25Max) * 0.28 + (joint33Max - joint28Max) * 0.33 + (income - joint33Max) * 0.35;
    } else if (status == 2) { // Compute tax for married separately
      // Left as exercise
      if (income <= separate10Max)
        tax = income * 0.10;
      else if (income <= separate15Max)
        tax = separate10Max * 0.10 + (income - separate10Max) * 0.15;
      else if (income <= separate25Max)
        tax = separate10Max * 0.10 + (separate15Max - separate10Max) * 0.15 + (income - separate15Max) * 0.25;
      else if (income <= separate28Max)
        tax = separate10Max * 0.10 + (separate15Max - separate10Max) * 0.15 + (separate25Max - separate15Max) * 0.25
            + (income - separate25Max) * 0.28;
      else if (income <= separate33Max)
        tax = separate10Max * 0.10 + (separate15Max - separate10Max) * 0.15 + (separate25Max - separate15Max) * 0.25
            + (separate28Max - separate25Max) * 0.28 + (income - separate28Max) * 0.33;
      else
        tax = separate10Max * 0.10 + (separate15Max - separate10Max) * 0.15 + (separate25Max - separate15Max) * 0.25
            + (separate28Max - separate25Max) * 0.28 + (separate33Max - separate28Max) * 0.33
            + (income - separate33Max) * 0.35;
    } else if (status == 3) { // Compute tax for head of household
      // Left as exercise
      if (income <= head10Max)
        tax = income * 0.10;
      else if (income <= head15Max)
        tax = head10Max * 0.10 + (income - head10Max) * 0.15;
      else if (income <= head25Max)
        tax = head10Max * 0.10 + (head15Max - head10Max) * 0.15 + (income - head15Max) * 0.25;
      else if (income <= head28Max)
        tax = head10Max * 0.10 + (head15Max - head10Max) * 0.15 + (head25Max - head15Max) * 0.25
            + (income - head25Max) * 0.28;
      else if (income <= head33Max)
        tax = head10Max * 0.10 + (head15Max - head10Max) * 0.15 + (head25Max - head15Max) * 0.25
            + (head28Max - head25Max) * 0.28 + (income - head28Max) * 0.33;
      else
        tax = head10Max * 0.10 + (head15Max - head10Max) * 0.15 + (head25Max - head15Max) * 0.25
            + (head28Max - head25Max) * 0.28 + (head33Max - head28Max) * 0.33 + (income - head33Max) * 0.35;
    } else {
      System.out.println("Error: invalid status");
      System.exit(1);
    }

    // Display the result
    System.out.println("Tax is " + (int) (tax * 100) / 100.0);
  }
}
