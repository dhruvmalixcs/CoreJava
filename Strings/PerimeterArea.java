// Q1. You are developing a drawing application that supports different shapes such as rectangles
// and circles. Implement an abstract class to represent a shape and its specific subclasses for
// rectangles and circles. Prompt the user to enter the dimensions and properties of a shape and
// display its area and perimeter.
// abstract class will hold gerArea() and getPerimeter() method.
// Input Format
// First line input consists integer value, that is choice of shape (1. Rectangle, 2. Circle)
// Second line input consists of double values (for Rectangle it will be 2 space separated values that
// is Length and Width, for Circle it will be only 1 value that is Radius, fi choice is 3 print “Invalid
// Choice”).
// Output Format
// Output will be lines separated double values showing the Area and Perimeter/ Circumference of
// the chosen shape.
// Sample Input 1
// 1
// 5.2
//3.7
// Sample Output 1
// Area: 19.24
// Perimeter: 17.80
import java.util.*;

public class PerimeterArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                System.out.printf("Area: %.2f",length*width );
                System.out.printf("\nPerimeter: %.2f",2*(length+width) );
                break;
            case 2:
                double radius = scanner.nextDouble();
                System.out.printf("Area: %.2f",3.14*Math.pow(radius,2) );
                System.out.printf("\nCircumference: %.2f",2*3.14*radius );
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

    }
}
