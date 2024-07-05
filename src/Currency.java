import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter currency in INR(₹): ");
        double cur = input.nextDouble();
        System.out.println("Currency in Dollar: $" + (cur/83.1));
    }
}
