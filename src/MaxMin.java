import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double max = maximumNo(a, b, c);
        double min = minimumNo(a, b, c);
        System.out.print("The Maximum number is: " + max);
        System.out.print("\nThe Minimum number is: " + min);
    }

    static double minimumNo(double a, double b, double c) {
        return Math.min(a, Math.min(b,c));
    }
    static double maximumNo(double a, double b, double c) {
        return Math.max(a, Math.max(b,c));

    }
}
