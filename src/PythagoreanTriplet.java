import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers to check: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        pythagorean(a, b, c);
    }

    static void pythagorean(int a, int b, int c) {
        int largest = Math.max(a, Math.max(b, c));
        boolean triplet;
        if(largest == a) {
            triplet = ((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)));
        }
        else if(largest == b) {
            triplet = ((Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)));
        }
        else {
            triplet = ((Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)));
        }
        System.out.println(triplet? "Is a Pythagorean Triplet" : "Not a Pythagorean Triplet");
    }
}
