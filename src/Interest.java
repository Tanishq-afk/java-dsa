import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float p = input.nextFloat();
        System.out.print("Enter Time: ");
        float t = input.nextFloat();
        System.out.print("Enter Rate :");
        float r = input.nextFloat();
        double interest = p*r*t / 100;
        System.out.println("The interest is: " + interest);



    }
}
