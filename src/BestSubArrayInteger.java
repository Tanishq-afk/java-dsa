import java.util.Scanner;

public class BestSubArrayInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int endingHere = arr[0];
        int tillNow = arr[0];
        for (int i = 1; i <= n-1 ; i++) {
            endingHere = Math.max(arr[i], endingHere + arr[i]);
            tillNow = Math.max(endingHere, tillNow);
        }
        System.out.println(tillNow);
    }
}
