/* Write a program that reads in the radius and length of a cylinder and
computes the area and volume using the following formulas:

area = radius * radius * pi
volume = area * length
*/
import java.util.Scanner;

public class ComputeVolumeCylinder {
  public static void main(String[] args) {
    double radius = 0.0,
      length = 0.0,
      area = 0.0,
      volume = 0.0;
      
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius and length of a cylinder: ");
    radius = input.nextDouble();
    length = input.nextDouble();
    
    area = Math.pow(radius, 2) * Math.PI;
    volume = area * length;
    
    System.out.println("The area is " + area);
    System.out.println("The volume is " + volume);
  }
}