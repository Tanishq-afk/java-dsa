import java.util.Scanner;

import static java.lang.Math.pow;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        double p = in.nextDouble();
        System.out.print("Enter Interest rate: ");
        double r = in.nextDouble();
        System.out.print("Enter Time: ");
        double t = in.nextDouble();
        double ci = p*(pow((1+(r/100)),t))-p;
        System.out.print("The compound interest is: " + ci);

    }
}
