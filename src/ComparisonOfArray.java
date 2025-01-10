import java.util.Scanner;

public class ComparisonOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter elements of 1st array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("Enter elements of 2nd array: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if(arr1[i] > arr2[i]) {
                count1++;
            }
            else if(arr1[i] < arr2[i]) {
                count2++;
            }
        }
        System.out.println("Points of 1st array: " + count1);
        System.out.println("Points of 2nd array: " + count2);
    }
}
