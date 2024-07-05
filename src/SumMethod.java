import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double sum = sumWow(a, b);
        System.out.print("The sum is: " + sum);
    }

    static double sumWow(double num1, double num2) {
        return num1 + num2;
    }
}
