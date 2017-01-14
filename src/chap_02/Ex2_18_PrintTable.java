/* Write a program that displays the following table. Cast floating- point
numbers into integers.

a b pow(a, b)
1 2 1
2 3 8
3 4 81
4 5 1024
5 6 15625
*/

package chap_02;

public class Ex2_18_PrintTable {
  public static void main(String[] args) {
    int a = 1,
      b = 2,
      pow = 0;
    
    System.out.println("a b pow(a, b)");
    for (; a < 6; a++, b++) {
      pow = (int) Math.pow(a, b);
      System.out.println(a + " " + b + " " + pow);
    }
  }
}