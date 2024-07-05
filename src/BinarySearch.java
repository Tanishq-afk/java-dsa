public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {52, 43, 34, 25, 16, 11, 2, 1};
        int target = 2;
        int ans = binarySearching(arr, target);
        System.out.println(ans);
    }

    static int binarySearching(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[start] < arr[end] ) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
