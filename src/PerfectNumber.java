import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a range for perfect number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <= b; i++) {
            int sum = 0;

            for (int j = 1; j <= i/2; j++) {
                if(i % j == 0) {
                    sum += j;
                }
            }
            if(sum==i) {
                System.out.print(i + " ");
            }
        }
    }
}
