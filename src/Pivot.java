class Pivot {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int target = 0;
        int result = search(nums, target);
        System.out.println(result);
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        return pivot;
//        int result = binarySearch(nums, 0, pivot, target);
//        if(result != -1) {
//            return result;
//        }
//        result = binarySearch(nums, pivot + 1, nums.length - 1, target);
//        return result;
    }
    public static int binarySearch(int[] nums, int start, int end, int target) {
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(target == nums[mid]) {
                return mid;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid+1]) {
                return nums[mid];
            } else if(mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid - 1];
            } else if(nums[mid] < nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}