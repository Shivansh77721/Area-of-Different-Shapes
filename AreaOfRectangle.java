import java.util.Scanner;

class AreaOfRectangle {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth:");
        double b = sc.nextDouble();

        double area = l * b;
        System.out.println("Area of Rectangle is: " + area);
    }
}