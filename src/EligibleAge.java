import java.util.Scanner;

public class EligibleAge {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter age to check: ");
            if (in.hasNextInt()) {
                int age = in.nextInt();
                isEligible(age);
            } else {
                System.out.println("Invalid Input, Enter valid input.");
            }
        }
    }
    static void isEligible(int age) {
        boolean eligible = (age >= 18);
        System.out.println(eligible ? "Eligible" : "Not eligible");
    }
}
