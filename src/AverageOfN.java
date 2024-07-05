import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values of N: ");
        int n = in.nextInt();
        double sum = 0;
        for(int i = 1; i <= n ; i++) {
            System.out.print("Enter number " + i + " : ");
            double num = in.nextDouble();
            sum = sum +num;
        }
        System.out.println("The average is: " + (sum/n));
    }
}
