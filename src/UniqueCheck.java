public class UniqueCheck {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2,2,3,3,3,3};
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
        }
    }
}
