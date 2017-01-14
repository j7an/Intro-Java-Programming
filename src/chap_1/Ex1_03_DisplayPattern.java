/*
Write a program that displays the following pattern:

    J    A    V     V   A
    J   A A    V   V   A A
J   J  AAAAA    V V   AAAAA
 J J  A     A    V   A     A
*/

package chap_1;

public class Ex1_03_DisplayPattern {
  public static void main(String[] args) {
    // Row 1
    System.out.print("    J");
    System.out.print("    A");
    System.out.print("    V     V");
    System.out.println("   A");
    
    // Row 2
    System.out.print("    J");
    System.out.print("   A A");
    System.out.print("    V   V");
    System.out.println("   A A");
    
    // Row 3
    System.out.print("J   J");
    System.out.print("  AAAAA");
    System.out.print("    V V");
    System.out.println("   AAAAA");
    
    // Row 4
    System.out.print(" J J");
    System.out.print("  A     A");
    System.out.print("    V");
    System.out.println("   A     A");
  }
}