/*
Write a program that displays the following table:
a     a^2   a^3
1     1     1
2     4     8
3     9     27
4     16    64
*/

package chap_01;

public class Ex1_04_PrintTable {
  public static void main(String[] args) {
    System.out.println("a     a^2   a^3");
    
    //row 1
    int a = 1;
    System.out.print(a + "     ");
    System.out.print(a * a + "     ");
    System.out.println(a * a * a);
    
    //row 2
    a = 2;
    System.out.print(a + "     ");
    System.out.print(a * a + "     ");
    System.out.println(a * a * a);
    
    //row 3
    a = 3;
    System.out.print(a + "     ");
    System.out.print(a * a + "     ");
    System.out.println(a * a * a);
    
    //row 4
    a = 4;
    System.out.print(a + "     ");
    System.out.print(a * a + "    ");
    System.out.println(a * a * a);
  }
}