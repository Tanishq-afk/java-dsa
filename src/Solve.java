import java.util.Arrays;

public class Solve {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));

    }

    static int[] runningSum(int[] nums) {
//        int[] runningSum = new int[nums.length];
//        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
//            runningSum[i] = nums[i] + temp;
//            temp = runningSum[i];
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
