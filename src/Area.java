import java.util.Scanner;

import static java.lang.Math.pow;

public class Area {
    private static final double PI = 3.14;

    public void areaOfCircle(Scanner in) {
        System.out.print("Enter radius: ");
        double r = in.nextDouble();
        double area = PI * pow(r, 2);
        System.out.println("Area is: " + area);
    }

    public void areaOfTriangle(Scanner in) {
        System.out.print("Enter base and height: ");
        double b = in.nextDouble();
        double h = in.nextDouble();
        double area = 0.5 * b * h;
        System.out.println("Area is: " + area);
    }

    public void areaOfRectangle(Scanner in) {
        System.out.print("Enter length and breadth: ");
        double l = in.nextDouble();
        double b = in.nextDouble();
        double area = l * b;
        System.out.println("Area is: " + area);
    }

    public void areaOfParallelogram(Scanner in) {
        System.out.print("Enter base and height: ");
        double b = in.nextDouble();
        double h = in.nextDouble();
        double area = b * h;
        System.out.println("Area is: " + area);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Area obj = new Area();
        System.out.println("Circle");
        obj.areaOfCircle(in);
        System.out.println("Triangle");
        obj.areaOfTriangle(in);
        System.out.println("Rectangle");
        obj.areaOfRectangle(in);
        System.out.println("Parallelogram");
        obj.areaOfParallelogram(in);
        in.close();
    }
}
