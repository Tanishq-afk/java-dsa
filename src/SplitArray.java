public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int ans = splitArray(nums, k);
        System.out.println(ans);
    }
    public static int splitArray(int[] nums, int k) {
        int min = 0;
        int max = 0;
        for (int num : nums) {
            max += num;
            min = Math.max(min, num);
        }
        if(k == nums.length) {
            return min;
        }
        else if(k==1) {
            return max;
        }
        int start = min;
        int end = max;
        while(start<=end) {
            int mid = (start + end) / 2;
            int sum = 0;
            int pieces = 1;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum > mid) {
                    pieces++;
                    sum = nums[i];

                }
            }
            if(pieces<=k) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
            if(start == end) {
                return end;
            }
        }
        return -1;
    }
}
