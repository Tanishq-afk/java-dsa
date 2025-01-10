import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
