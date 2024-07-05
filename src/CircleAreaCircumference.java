import java.util.Scanner;

public class CircleAreaCircumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = in.nextDouble();;
        double circumference = circumferenceOf(radius);
        double area = areaOf(radius);
        System.out.print("Circumference of circle: " + circumference);
        System.out.print("\nArea of circle: " + area);
        in.close();
    }

    static double areaOf(double r) {
        return Math.PI*Math.pow(r, 2);
    }
    static double circumferenceOf(double r) {
        return 2*Math.PI*r;
    }
}
