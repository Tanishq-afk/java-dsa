import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        if(num1==num2) {
            System.out.println("Both are equal");
        }
        else {
            double largest = (num1 > num2) ? num1 : num2;
            System.out.println("The largest number is: " + largest);
        }
    }
}


