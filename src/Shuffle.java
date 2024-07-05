import java.util.*;

class Shuffle {
    public int[] rearrangeArray(int[] nums, int n) {
        int[] result = new int[nums.length];

        if (nums.length % n != 0) {
            throw new IllegalArgumentException("Invalid input: array length must be divisible by n.");
        }

        int groupSize = nums.length / n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < groupSize; j++) {
                result[i * groupSize + j] = nums[j * n + i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Shuffle solution = new Shuffle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];

        System.out.println("Enter the elements of the array separated by space:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int[] rearranged = solution.rearrangeArray(nums, n);
        System.out.println("Output: " + Arrays.toString(rearranged));

        scanner.close();
    }
}
