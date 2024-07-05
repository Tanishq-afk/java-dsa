import java.util.Arrays;

public class RangeStartEnd {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = {-1, -1};
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;

    }

    static int findLast(int[] nums, int target) {
        int start = 0;
        int index = -1;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target) {
                start = mid + 1;
            }
            else end = mid - 1;
            if(nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    static int findFirst(int[] nums, int target) {
        int start = 0;
        int index = -1;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target) {
                end = mid - 1;
            }
            else start = mid + 1;
            if(nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }
}
