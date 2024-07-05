import java.util.Scanner;

public class BestSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        in.nextLine();  // Consume the newline

        // Initializing the array
        int[] array = new int[n];

        // Taking array elements input
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        // Finding and printing the maximum sum of a subarray
        int maxSum = findMaxSumSubarray(array);
        System.out.println("Maximum sum of a subarray: " + maxSum);
    }

    static int findMaxSumSubarray(int[] array) {
        int maxSoFar = array[0];
        int maxEndingHere = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
