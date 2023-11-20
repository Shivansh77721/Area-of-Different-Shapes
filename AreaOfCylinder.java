import java.util.Scanner;

public class AreaOfCylinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();

        double area = 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;

        System.out.println("The area of the cylinder is: " + area);
    }
}