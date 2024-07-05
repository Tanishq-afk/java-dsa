import java.util.Scanner;

public class Perimeter {
    public static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Perimeter obj = new Perimeter();
        System.out.println("------Finding the perimeter------");
        System.out.println(("Circle"));
        obj.perimeterOfCircle(in);
        System.out.println("\nEquilateral Triangle");
        obj.perimeterOfEquiTriangle(in);
        System.out.println("\nParallelogram");
        obj.perimeterOfParallelogram(in);
        System.out.println("\nRectangle");
        obj.perimeterOfRectangle(in);
        System.out.println("\nSquare");
        obj.perimeterOfSquare(in);
        System.out.println("\nRhombus");
        obj.perimeterOfRhombus(in);

    }
    public void perimeterOfCircle(Scanner in) {
        System.out.print("Enter the value of Radius: ");
        double r = in.nextDouble();
        System.out.print("The perimeter of Circle is: "+ (2*PI*r));
    }
    public void perimeterOfEquiTriangle(Scanner in) {
        System.out.print("Enter the value of Side: ");
        double a = in.nextDouble();
        System.out.print("The perimeter of Equilateral Triangle is: " + (3*a));
    }
    public void perimeterOfParallelogram(Scanner in) {
        System.out.print("Enter the value of two Adjacent Sides: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.print("The perimeter of Parallelogram is: " + (2*(a+b)));
    }
    public void perimeterOfRectangle(Scanner in) {
        System.out.print("Enter the value of Length and Width: ");
        double l = in.nextDouble();
        double w = in.nextDouble();
        System.out.print("The perimeter of Rectangle is: " + (2*(l+w)));
    }
    public void perimeterOfSquare(Scanner in) {
        System.out.print("Enter the value of Side: ");
        double s = in.nextDouble();
        System.out.print("The perimeter of Square is: " + (4*s));
    }
    public void perimeterOfRhombus(Scanner in) {
        System.out.print("Enter the value of Side: ");
        double s = in.nextDouble();
        System.out.print("The perimeter of Rhombus is: " + (4*s));

    }
}
