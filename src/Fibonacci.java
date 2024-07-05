import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number up to which you want fibonacci series: ");
        int n = input.nextInt();
        if(n<=0) {
            System.out.println("Enter valid term.");
        }
        else {
            System.out.println("The fibonacci series for " + n + " terms is:");
            if(n==1) {
                System.out.print("0");
            }
            else {
                int a = 0, b = 1;
                System.out.print(a + " " + b);
                int count = 2;
                while(count<n) {
                    int next = a + b;
                    System.out.print(" " + next);
                    a = b;
                    b = next;
                    count++;
                }
            }
        }
    }
}
